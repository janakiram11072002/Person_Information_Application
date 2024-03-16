package com.Person_Information.jhonny;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Person_Information.jhonny.Models.Person;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@RunWith(SpringRunner.class)
@SpringBootTest
class JhonnyApplicationTests {

	// @Autowired
	// private Person person;

	@Test
	void contextLoads() 
	{
		//System.out.println(person);
	}

}
