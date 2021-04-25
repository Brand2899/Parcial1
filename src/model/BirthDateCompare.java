package model;

import java.util.Comparator;

public class BirthDateCompare implements Comparator<Dog> {
	public int compare(Dog d1, Dog d2) {
		return d1.getDate().compareTo(d2.getDate());
	}
}
