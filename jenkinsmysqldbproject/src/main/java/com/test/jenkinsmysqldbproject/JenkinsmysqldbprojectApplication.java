package com.test.jenkinsmysqldbproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import spring_mybatis.EmpController;
import spring_mybatis.EmpDAO;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses =EmpController.class )
@MapperScan(basePackageClasses = EmpDAO.class)
public class JenkinsmysqldbprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsmysqldbprojectApplication.class, args);
	}

}
