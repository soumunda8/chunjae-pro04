package kr.ed.haebeop.config;

import kr.ed.haebeop.persistence.TestMapper1;
import kr.ed.haebeop.repository.TestRepository;
import kr.ed.haebeop.repository.TestRepositoryImpl;
import kr.ed.haebeop.service.NoticeService;
import kr.ed.haebeop.service.NoticeServiceImpl;
import kr.ed.haebeop.service.TestService;
import kr.ed.haebeop.service.TestServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.ed.haebeop")
public class ApplicationConfig {

    @Bean
    public TestService testService() {return new TestServiceImpl();}

    @Bean
    public TestRepository testRepository() {return new TestRepositoryImpl();}

    @Bean
    public NoticeService noticeService() {return new NoticeServiceImpl();}

}