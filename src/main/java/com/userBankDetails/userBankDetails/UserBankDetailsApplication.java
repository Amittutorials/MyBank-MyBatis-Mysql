package com.userBankDetails.userBankDetails;

import com.userBankDetails.userBankDetails.dto.UserAccountDetails;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MappedTypes(UserAccountDetails.class)
@MapperScan("com.userBankDetails.userBankDetails.mapper")
@SpringBootApplication
public class UserBankDetailsApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserBankDetailsApplication.class, args);
	}

}
