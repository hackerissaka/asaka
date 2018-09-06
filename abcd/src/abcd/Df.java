package abcd;

import java.util.Vector;

public class Df {

	public static void main(String[] args) {
		Vector v1 = new Vector(7,3);
		for (int num = 0; num <=15 ; num++) {
			v1.add(num);
			System.out.println("Inside  "+v1.capacity());
		}
		System.out.println("Outside  "+v1.capacity());
	}

}
