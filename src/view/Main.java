package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private Controller c;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(1000,1000);
	}
	
	public void settup() {
		c = new Controller(this);
	}
	
	public void draw() {
		background(255);
		
		for(int i = 0; i < c.getDogList().size(); i++) {
			c.getDogList().get(i).drawDog(50 + i);
		}
		
	}
	
	public void keyPressed() {
		
	}
}
