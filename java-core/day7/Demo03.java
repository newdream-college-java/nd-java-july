import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		/*1.3、猴子摘了一堆枣 N 个，第一天吃了一半，还嫌不过瘾，又多吃了一个：第二天
		           又吃了剩下的一半零一个：以后每天如此，到第十天，猴子一看只剩下一个了。
		           问最初有多少个枣子?*/
		
		int sum=1;
		for(int i=1; i<=10;i++){
			sum=sum*2+2;
		}
		System.out.println(sum);
		/*1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
		的个数，0 的个数。直到用户输入 999 就结束，输出统计结果*/
		Scanner input=new Scanner(System.in);
		int data;
		int lessThan=0;
		int greater=0,equal=0;
		for(;;){
			data=input.nextInt();
			if(data==999){
				break;
			}else if(data<0){
				lessThan++;
			}else if(data>0){
				greater++;
			}else{
				equal++;
			}
		}
		System.out.println("正数的个数有："+greater+"\t负数的个数有："+lessThan+"\t0的个数有："+equal);
	}
}