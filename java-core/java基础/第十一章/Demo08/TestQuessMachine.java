package chapter11;

import java.util.Scanner;

public class TestQuessMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		QuessMachine qme = new QuessMachine();
		qme.initial();
		int b = 0;
		int a = input.nextInt();
		while(!qme.guess(a)){
			b++;
			System.out.print("再猜一次吧：");
			a = input.nextInt();

			if(b==3){
				System.out.println("4次都没猜对，下次再来吧！");
				break;
			}
		}
	}

}
