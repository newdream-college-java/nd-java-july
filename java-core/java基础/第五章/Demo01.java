/*
1.1、输出计算 100+101+102+……+200 之和。
*/
public class Demo01{
	public static void main(String[] args){
		System.out.println("******银河一号巨型计算机*******");
		int i = 100;
		int sum = 0;
		while(i<=200){
			sum +=i;
			i++;
		}
		System.out.println("计算结果为："+sum);
		
	}
} 