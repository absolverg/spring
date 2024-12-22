package wmp.cert.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import wmp.cert.spring.DTO.MemberMapperDTO;
import wmp.cert.spring.Mapper.TestMapperRepository;

@RestController
public class TestController {
    @Autowired
    TestMapperRepository TestMapperRepository;
    
    @GetMapping(value = "/")
    public String home(){
        return "home";
    }

    @GetMapping("/searchmember")
    public String select(String email){
        MemberMapperDTO member = TestMapperRepository.searchmember(email);
        String memberinfo = member.getMember_name();
        return memberinfo;
    }

    @GetMapping("/searchlist")
    public List<MemberMapperDTO> getMemberList(String email){
        List<MemberMapperDTO> memberlist = TestMapperRepository.getmemberlist(email);
        return memberlist;
    }
}
