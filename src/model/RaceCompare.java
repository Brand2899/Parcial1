package model;

import java.util.Comparator;

public class RaceCompare implements Comparator<Dog> {
	public int compare(Dog d1, Dog d2) {
		return d1.getRace().compareTo(d2.getRace());
	}
}
