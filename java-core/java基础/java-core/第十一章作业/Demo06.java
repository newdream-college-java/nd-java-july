package chapter_11;
import java.util.*;
public class Demo06 {
	int year;
	public String pandun(){
		Scanner sc=new Scanner(System.in);	
		System.out.print("请输入年份：");
		year=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0)){
			return "闰年";
		}else{
			return "平年";
		}
	}
		
	
	public static void main(String[] args) {
		Demo06 a=new Demo06();
		System.out.println(a.pandun());

	}

}
