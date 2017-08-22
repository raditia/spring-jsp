package com.raditia.springjsp;

import com.raditia.springjsp.DAO.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjspApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringjspApplication.class, args);
		UserDao.createTableUser();
	}
}
