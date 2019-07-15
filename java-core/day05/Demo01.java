import java.util.Scanner;
import java.util.Random;
public class Demo01{
	public static void main(String[] args){
		//1.1、输出计算 100+101+102+……+200 之和
		int i=100;
		int sum=0;
		while(i<=200){
			sum+=i;
			i++;
			System.out.print(i+"+");
		}
		System.out.println("="+sum);
		//计算 1+1/4+1/9+....+1/(20*20)
		int ii=1;
		double onesum=0;
		while(ii<=20){
			onesum=onesum+1.0/ii*ii;
			System.out.print(1+"/"+ii*ii+"+");
			ii++;
			
		}
			System.out.print("="+onesum);
		//1.3、编程使用 while 循环输出：100、95、90、85……、5。
		int one=100;
		while(one>=5){
			System.out.println(one);
			one-=5;
		}
		//1.4、循环问“你的名字叫什么？”，如果回答的是“不告诉你”，就继续问，否则输出“你的名字原来叫：**”。编程实现。
		Scanner input=new Scanner(System.in);
		System.out.println("wht you name?");
		String imput=input.next();
		while(imput.equals("不告诉你")){
			System.out.println("请重新输入：");
			imput=input.next();
		};
			System.out.println("你的名字原来叫"+imput);
		/*
		1.5、循环要求用户输入一个 0 到 2 之间的整数，
		如果输入的是 0 就输出“你出的是石头”，
		如果输入的是 1 就输出“你出的是剪刀”，
		如果输入的是 2 就输出“你出的是布”，
		如果是其它数就结束程序。
		*/
		System.out.println("请出拳：（0=石头；1=剪刀；2=布）");
		int a1=input.nextInt();
		switch(a1){
			case 0:
				System.out.println("您出的是石头");
				break;
			case 1:
				System.out.println("您出的是剪刀");
				break;
			case 2:
				System.out.println("您出的是布");
				break;
			default :
				System.out.println("你个傻逼输错了：");
			System.exit(-1);
		}
		/*
		1.6、编程实现一个简单的人与电脑的猜拳游戏软件*/
		System.out.println("请出拳：（0=石头；1=剪刀；2=布）");
		int a;
		do{
			a=input.nextInt();
		switch(a){
			case 0:
				System.out.println("您出的是石头");
				break;
			case 1:
				System.out.println("您出的是剪刀");
				break;
			case 2:
				System.out.println("您出的是布");
				break;
			default :
				System.out.println("你个傻逼输错了：");
		}
		}while(a>2||a<0);
		Random random=new Random();
		int data=random.nextInt(3);
		switch(data){
			case 0:
			System.out.println("计算机的是石头");
			break;
			case 1:
			System.out.println("计算机的是剪刀");
			break;
			case 2:
			System.out.println("计算机出的是布");
			break;
		}
		if(a==0&&data==1||a==1&&data==2||a==2&&data==0){
			System.out.print("您赢了");
		}else if(a==data){
			System.out.println("平局");
		}else{
			System.out.println("您输了");
		}
	}
}