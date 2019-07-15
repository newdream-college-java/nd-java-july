/*
1.1、输出计算 100+101+102+……+200 之和。
*/
import java.util.*;
public class Demo01{
	public static void main(String [] args){
		int sum= 0;
		int i =100;
		while(i<=200){
			sum=sum+i;
			i=i+1;
		}
		System.out.println("100+101+102+……+200 之和为："+sum);
	}
}