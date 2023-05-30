package com.tsg.bayada.joy;

import com.tsg.bayada.joy.domain.ScreeningQuestion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@ConfigurationPropertiesScan
//@EnableFeignClients
public class BayadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BayadaApplication.class, args);

	}

}
