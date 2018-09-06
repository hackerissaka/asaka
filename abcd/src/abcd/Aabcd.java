package abcd;

import java.util.TreeSet;

public class Aabcd {
private int empno;
private String name;



public Aabcd() {
	super();
	// TODO Auto-generated constructor stub
}



public Aabcd(int empno, String name) {
	super();
	this.empno = empno;
	this.name = name;
}



public static void main(String[] args) {
		TreeSet emp = new TreeSet();
		/*emp.add(new Aabcd(1,"a"));
		emp.add(new Aabcd(2,"b"));*/
		System.out.println("Size "+emp.size());

	}

}
