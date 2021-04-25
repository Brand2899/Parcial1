package model;

import processing.core.PApplet;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Dog {
	
	private String name;
	private String race;
	private Date date;
	private int id;
	private int age;
	private PApplet app;
	
	public Dog(String name, String race, Date date, int id, int age, PApplet app) {
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
	
	public void drawDog(int i) {
		app.textSize(10);
		app.text("ID: " + id, i, 50);
		app.text("Name: " + name, i, 70);
		app.text("Age: " + age, i, 90);
		app.text("Race: "+ race, i, 110);
		
		SimpleDateFormat dt = new SimpleDateFormat("DD-MM-YYYY");
		String Date = dt.format(this.date);
		app.text("Birth Date: " + Date, i, 130);
	}
}
