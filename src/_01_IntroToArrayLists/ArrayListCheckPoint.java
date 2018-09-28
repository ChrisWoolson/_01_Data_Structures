package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListCheckPoint {

	class Cow {
		public void feed() {}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Cow cow;
		ArrayList <Cow> cows = new ArrayList<Cow>();
		
		Random rand = new Random();
		int ran = rand.nextInt(2000);
		
		for (int i = 0; i < ran; i++) {
			cows.add(new Cow());
		}
		
	}
	
	
	
	
	
}
