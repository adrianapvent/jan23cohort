package com.codingdojo.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codingdojo.zookeeper.models.Bat;
import com.codingdojo.zookeeper.models.Gorilla;

@SpringBootApplication
public class ZookeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperApplication.class, args);
		
		//gorilla test
		Gorilla gorilla = new Gorilla();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		gorilla.displayEnergy();
		
		// bat tests
		Bat bat = new Bat();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		bat.eatHumans();
		bat.eatHumans();
		
		bat.fly();
		bat.fly();
		bat.displayEnergy();
		
		
	}
	

}
