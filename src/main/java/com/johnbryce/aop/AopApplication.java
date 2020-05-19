package com.johnbryce.aop;

import com.johnbryce.aop.beans.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	@Autowired
	private Player player;

	public static void main(String[] args) {

		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public Map<Integer,Integer> createHashSet(){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		return map;
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i=0;i<=200;i++){
			player.pioPio();
		}
	}
}
