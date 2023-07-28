package wmp.cert.spring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import wmp.cert.spring.DTO.MemberMapperDTO;
import wmp.cert.spring.Mapper.TestMapperRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private TestMapperRepository TestMapperRepository;

	// @Test
	// void contextLoads() {
	// }

	@Test
	@Transactional
	@Rollback
	@DisplayName("mybatis 회원가입 테스트")
	public void memberSaveTest1(){
		TestMapperRepository.save1(new MemberMapperDTO("mybatis회원이메일", "mybatis회원비밀번호", "mybatis회원이름"));
	}

	@Test
	@Transactional
	@Rollback
	@DisplayName("db select")
	public void dbSelectTest(){
		assert TestMapperRepository.select().equals("web");
	}

}
