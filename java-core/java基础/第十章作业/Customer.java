import java.util.Scanner;


public class Customer {
	String type;
	double score;
	public void give(){
		if(type.equals("��")){
			if(score>1000){
				System.out.println("����:"+score+"\t������:"+type);
				System.out.print("��������500�֣�");
				score+=500;
			}
		}else{
			if(score>5000){
				System.out.println("����:"+score+"������:�տ�");
				System.out.print("��������500�֣�");
				score+=500;
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.print("������˿Ϳ���");
		Customer a=new Customer();
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		a.type=b;
		System.out.print("���������");
		double c=sc.nextDouble();
		a.score=c;
		a.give();
	}

}
