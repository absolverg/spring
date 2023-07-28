package wmp.cert.spring.Mapper;
import org.apache.ibatis.annotations.Mapper;

import wmp.cert.spring.DTO.MemberMapperDTO;

@Mapper
public interface TestMapperRepository {
    void save1(MemberMapperDTO memberMapperDTO);

    String select();

    MemberMapperDTO searchmember(String email);
}