package text2.praJob10;

import java.util.Scanner;

public class Card {
	Scanner inputScanner=new Scanner(System.in);
	int jifen;
	String leixing;
	
	public void shuRu() {
		System.out.print("��������֣�");
		jifen=inputScanner.nextInt();
		System.out.print("�����뿨���ͣ�");
		leixing=inputScanner.next();
	}
	
	public void show() {
		System.out.println("���֣�"+jifen+"�������ͣ�"+leixing);
	}
	
	public void reward() {
		if((leixing.equals("��")&&jifen>1000)||(leixing.equals("�տ�")&&jifen>5000)) {
			System.out.println("��������500�֣�");
		}
	}

}
