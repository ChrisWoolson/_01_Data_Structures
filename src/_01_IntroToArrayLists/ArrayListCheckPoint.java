package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListCheckPoint {

	
	
	
	public static void main(String[] args) {
		class Cow {
			public void feed() {
			}

		}
		Cow cow;
		ArrayList<Cow> cows = new ArrayList<Cow>();
		
		Random rand = new Random();
		int ran = rand.nextInt(2000);
		
		for (int i = 0; i < ran; i++) {
			cows.add(new Cow());
		}
		
		for (int i = 0; i < cows.size(); i++) {
			cows.get(i).feed();
			System.out.println("Cow fed "+i);
		}
		System.out.println(ran);
	}
	
	
	
	
	
}
