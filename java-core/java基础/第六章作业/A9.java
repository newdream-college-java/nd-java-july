import java.util.Scanner;
public class A9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int age;
		int a=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"顾客的年龄");	
			age =input.nextInt();
			if(age>=30){
				a++;
			}
		}
		System.out.println("30岁以上的比例是"+a*10.0+"%");
		System.out.println("30岁以下的比例是"+(10-a)*10.0+"%");
	}
}
		