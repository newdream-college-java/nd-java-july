/*1.1、输出计算 100+101+102+……+200 之和。*/
public class Work01{
	public static void main(String[] args){
		int i=100,sum=0;
		while(i<=200){
			sum+=i;
			i++;
		}
		System.out.println("100+101+102+……+200 之和为："+sum);
	}
}