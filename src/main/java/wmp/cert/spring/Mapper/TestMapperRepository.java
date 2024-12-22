package wmp.cert.spring.Mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import wmp.cert.spring.DTO.MemberMapperDTO;

@Mapper
public interface TestMapperRepository {
    void save1(MemberMapperDTO memberMapperDTO);

    String select();

    MemberMapperDTO searchmember(String email);

    List<MemberMapperDTO> getmemberlist(String email);
}