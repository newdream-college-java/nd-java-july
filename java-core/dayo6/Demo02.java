import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		//1.7、循环输入大于 0 的数字进行累加，直到输入的数字为 0，就结束循环，并最后输出累加的结果。
		int sum=0;
		int data=1;
		System.out.print("请输入数字进行累加，直到输入的数字为 0");
		for(;data!=0;){
			
			data=input.nextInt();
			sum+=data;
			if(data==0){
				break;
			}
		}
		System.out.println("累加值为"+sum);
	}
}