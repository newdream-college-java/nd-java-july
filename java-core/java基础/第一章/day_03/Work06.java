/*2.5、 计算今年 1 月 1 日到今天的总天数。*/
import java.util.*;
public class Work06{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入今天的日期（月份1-12 日期 1-31）：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==1){
			System.out.println("总天数："+b);
		}else if(a==2){
			System.out.println("总天数："+(b+31));			

		}else if(a==3){
			System.out.println("总天数："+(b+59));
		}else if(a==4){
			System.out.println("总天数："+(b+90));			
		}else if(a==5){
			System.out.println("总天数："+(b+120));
		}else if(a==6){
			System.out.println("总天数："+(b+151));			
		}else if(a==7){
			System.out.println("总天数："+(b+181));
		}else if(a==8){
			System.out.println("总天数："+(b+212));			
		}else if(a==9){
			System.out.println("总天数："+(b+243));
		}else if(a==10){
			System.out.println("总天数："+(b+273));
		}else if(a==11){
			System.out.println("总天数："+(b+304));			
		}else if(a==12){
			System.out.println("总天数："+(b+334));
		}
	}
}
