package com.demo.app.controller;

public class TestDto {

	private String name;
	private int id;

	public TestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestDto(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
