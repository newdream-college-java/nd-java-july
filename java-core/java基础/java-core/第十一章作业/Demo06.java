package chapter_11;
import java.util.*;
public class Demo06 {
	int year;
	public String pandun(){
		Scanner sc=new Scanner(System.in);	
		System.out.print("��������ݣ�");
		year=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0)){
			return "����";
		}else{
			return "ƽ��";
		}
	}
		
	
	public static void main(String[] args) {
		Demo06 a=new Demo06();
		System.out.println(a.pandun());

	}

}
