import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		//1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则
			//输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误
		Scanner input=new Scanner(System.in);
		System.out.println("请输入1-10的正整数，我么们将计算他的阶乘");
		int data;
		if(input.hasNextInt()){
		data=input.nextInt();
		if(data<1||data>10){
		System.out.println("输入错误");
		System.exit(-1);
		}
		}else{
			System.out.print("请输入1-10的正整数");
			return;
		}
		int sum=1;
		System.out.print(data+"!=");
		for(int i=1;i<=data;i++){
			sum*=i;
		if(i==data){
			System.out.print(i);
		}else{
		System.out.print(i+"*");	}
		}
		System.out.println("="+sum);
	}
}