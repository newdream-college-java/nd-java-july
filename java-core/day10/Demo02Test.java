import java.util.Scanner;
/*ʵ�ֻ��ֻ�������:�𿨿ͻ����ִ��� 1000 �ֻ��տ��ͻ����ִ��� 5000����û���
���� 500 �֡������ͻ�����������õ��Ļ�������*/
public class Demo02Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Domo02 demo = new Domo02();
		System.out.print("��������֣�");
		demo.jiFen = input.nextInt();
		System.out.print("�����뿨���ͣ�");

		demo.kaLeiXin = input.next();
		demo.Show();
		if (demo.jiFen > 5000 && demo.kaLeiXin.equals("��ͨ��")) {
			demo.jiFen += 500;
			System.out.println("��������500��");
		} else if (demo.jiFen > 1000 && demo.kaLeiXin.equals("��")) {
			demo.jiFen += 500;
			System.out.println("��������500��");
		} else {
			System.out.println("���ź���û�л�û���");
		}
	}
}
