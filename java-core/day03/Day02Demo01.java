import java.util.Scanner;
public class Day02Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//1、输入一个三位整数，判其是不是降序数如:531 是降序数 百位>十位>个位
		System.out.println("第一题：输入一个三位整数，判其是不是降序数如:531 是降序数 百位>十位>个位");
		int theInteger=input.nextInt();
		int ones=theInteger%10;
		int ten=theInteger/10%10;
		int hundred=theInteger/100%10;
		if(hundred>ten && ten>ones){
			System.out.println("是降序数   "+hundred+">"+ten+">"+ones);
		}else{
			System.out.println("不是降序数");
		}
		System.out.println("******************************黄金分割线************************");
		//2、输入一个年份，判是闰年还是平年
		System.out.println("第二题：输入一个年份，判是闰年还是平年");
		int years=input.nextInt();
		if(years%400==0 || years%4==0 && years%100!=0){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
		System.out.println("******************************黄金分割线************************");
		
			
	}
	
}