import java.util.Scanner;


public class Customer {
	String type;
	double score;
	public void give(){
		if(type.equals("金卡")){
			if(score>1000){
				System.out.println("积分:"+score+"\t卡类型:"+type);
				System.out.print("回馈积分500分！");
				score+=500;
			}
		}else{
			if(score>5000){
				System.out.println("积分:"+score+"卡类型:普卡");
				System.out.print("回馈积分500分！");
				score+=500;
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.print("请输入顾客卡型");
		Customer a=new Customer();
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		a.type=b;
		System.out.print("请输入积分");
		double c=sc.nextDouble();
		a.score=c;
		a.give();
	}

}
