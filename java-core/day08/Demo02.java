import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		/*1.3、 循环 365 天，每天吃三次饭，要求使用嵌套循环来完成。第过一天就输出“总
		算又过了一天”，然后这一天里要求输出“我吃了一顿饭”三次。*/
		for(int i=1;i<=365;i++){
			for(int j=1;j<=3;j++){
				System.out.println("我吃了一顿饭");
			}
			System.out.println("总算又过了一天");
		}
		/*1.4、 求和:1!+2！+3！+4！+......+10!*/
		int sum=1;
		int svn=1;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				svn*=j;
			}
			sum+=svn;
			if(i==10){
			System.out.print(i+"!");
			}else{
			System.out.print(i+"!+");
			}
		}
		System.out.println("="+sum);
	}
}