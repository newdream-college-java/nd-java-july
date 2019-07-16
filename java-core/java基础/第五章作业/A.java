/*	输出计算100+101+102+……+200之和
*/

public class A{
	public static void main(String[] args){
		int i=100,sum=0;
		while(i<=200){
			sum=sum+i;
			i++;
		}
		System.out.println("总和为："+sum);
	}
}
	

	
