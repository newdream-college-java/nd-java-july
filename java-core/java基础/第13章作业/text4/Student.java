package job02.text4;

import java.util.Scanner;

public class Student {
	String name;
	String[] kc= {"Java","C","SQL"};
	double[] cj=new double[3];
	Scanner scanner=new Scanner(System.in);
	public void inPut() {
		System.out.println("«Î ‰»Î"+name+"µƒ≥…º®");
		for (int i = 0; i < cj.length; i++) {
			System.out.print(kc[i]+":");
			cj[i]=scanner.nextDouble();
		}
	}
}
