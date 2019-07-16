import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		//、商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例
		Scanner input=new Scanner(System.in);
		int ageData;
		double sum=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客年龄");
			ageData=input.nextInt();
			if(ageData>=30){
				sum++;
			}
		}
		double proporion=(sum/10.0)*10;
		System.out.println("30岁以上的比例是"+proporion+"%");
		System.out.println("30岁以下的比例是"+(10-proporion)+"%");
	}
}