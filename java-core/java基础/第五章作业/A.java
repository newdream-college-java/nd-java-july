/*1.1、输出计算 100+101+102+……+200 之和。*/
import java.util.*;
public class A{
	public static void main(String[] args){
		int i=100;
		int sum=0;
		while(i<=200){
			sum+=i;
			i++;
		}
		System.out.println("运算结果为："+sum);
	}
}