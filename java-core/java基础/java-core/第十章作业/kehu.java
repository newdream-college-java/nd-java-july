package chapter_10;
/*1.2������˵��
ʵ�ֻ��ֻ�������:�𿨿ͻ����ִ��� 1000 �ֻ��տ��ͻ����ִ��� 5000����û���
���� 500 �֡������ͻ�����������õ��Ļ�������*/
public class kehu {
	String cardType;
	int score;
	
	public  void huikui(){
		if((cardType.equals("��")&&score>1000)||(cardType.equals("�տ�")&&score>5000)){
			score+=500;
			System.out.println("���֣�"+score+"�������ͣ�"+cardType);
			System.out.println("��������500!");
		}
	}
	public static void main(String[] args) {
		admin admin1=new admin();
		admin admin2=new admin();
		admin1.userName="admin1";
		admin2.userName="admin2";
		admin1.passWord=111111;
		admin2.passWord=222222;
		admin1.show();
		admin2.show();
		admin1.gxmima();
		admin2.gxmima();
		

	}

}
