package model;

import processing.core.PApplet;

public class Dog {
	
	private String name;
	private String race;
	private int date;
	private int id;
	private int age;
	private PApplet app;
	
	public Dog(String name, String race, int date, int id, int age, PApplet app) {
		this.name = name;
		this.race = race;
		this.date = date;
		this.id = id;
		this.age = age;
		this.app = app;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
	
}
