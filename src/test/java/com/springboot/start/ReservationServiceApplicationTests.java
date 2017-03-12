package com.springboot.start;

import com.springboot.service.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReservationServiceApplicationTests {
	@Autowired
	private ReservationRepository reservationRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void test01(){
		System.out.println(reservationRepository);
	}



}
