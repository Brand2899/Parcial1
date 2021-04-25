package model;

import processing.core.PApplet;
import java.util.LinkedList;

public class Logic {
	
	private String[] txt1;
	private String[] txt2;
	
	private LinkedList<Dog> dogList;
	
	private PApplet app;
	
	private AgeCompare ac;
	private BirthDateCompare bdc;
	private NameCompare nc;
	private RaceCompare rc;
	
	public Logic(PApplet app) {
		this.app = app;
		
		txt1 = app.loadStrings("../data/TXT1.txt");
		txt2 = app.loadStrings("../data/TXT2.txt");
		
		dogList = new LinkedList<Dog>();
		
		ac = new AgeCompare();
		bdc = new BirthDateCompare();
		nc = new NameCompare();
		rc = new RaceCompare();
	}
	
	public LinkedList<Dog> getDogList() {
		return dogList;
	}
	
}
