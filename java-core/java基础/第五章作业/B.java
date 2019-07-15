/*1.2、计算 1+1/4+1/9+....+1/(20*20)*/
import java.util.*;
public class B{
	public static void main(String[] args){
		double i=1.0;
		double sum=0;
		while(i<=20){
			sum=sum+1/(i*i);
			i++;
		}
		System.out.println("运算结果为："+sum);
	}
}