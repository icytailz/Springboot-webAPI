package com.example.sburrestdemo;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SburRestDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

class Coffee {
	private final String id; //final mean the attribute can only be assigned only once and never modified
	private String name;

	public Coffee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Coffee(String name) {
		this(UUID.randomUUID().toString(), name); //create a unique id if none provided upon creation of Coffee
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
