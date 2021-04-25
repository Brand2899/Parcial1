package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private Controller c;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(500,500);
	}
	
	public void settup() {
		c = new Controller(this);
	}
	
	public void draw() {
		background(255);
	}
	
	public void keyPressed() {
		
	}
}
