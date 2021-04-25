package controller;

import model.Dog;
import model.Logic;
import java.util.LinkedList;
import processing.core.PApplet;

public class Controller {
	private Logic l;
	private PApplet app;
	
	public Controller(PApplet app) {
		this.app = app;
		l = new Logic(app);
	}
	
	public LinkedList<Dog> getDogList(){
		return l.getDogList();
	}
}
