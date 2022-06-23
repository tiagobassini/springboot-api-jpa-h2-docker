package com.tbassini.springbootapijpah2docker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class SpringbootApiJpaH2DockerApplication {

	@Bean
	public ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(true);
		return modelMapper;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiJpaH2DockerApplication.class, args);
	}

}
