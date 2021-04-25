package model;

import java.util.Comparator;

public class AgeCompare implements Comparator<Dog> {
	
	public int compare(Dog d1, Dog d2) {
		return d1.getAge() - d2.getAge();
	}
}
