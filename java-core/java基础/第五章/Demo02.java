/*
1.2、计算 1+1/4+1/9+....+1/(20*20)
*/
import java.util.*;
public class Demo02{
	public static void main(String [] args){
		double sum = 0;
		int i =1;
		while(i<=20){
			sum=sum+1.0/(i*i);
			i++;
		}
		System.out.println("1+1/4+1/9+....+1/(20*20) 之和为："+sum);
	}
}	