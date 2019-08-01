package cn.itsource.gogou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.itsource.gogou.mapper")
public class GogouApplication {

	public static void main(String[] args) {
		SpringApplication.run(GogouApplication.class, args);
	}

}
