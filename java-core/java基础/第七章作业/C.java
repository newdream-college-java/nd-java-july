/*、	
	猴子摘了一堆枣 N 个，第一天吃了一半，还嫌不过瘾，又多吃了一个：第二天
	又吃了剩下的一半零一个：以后每天如此，到第十天，猴子一看只剩下一个了。
	问最初有多少个枣子?
*/


public class C{
	public static void main(String[] args) {
		int a=1,sum=1;
		for(int i=10;i>=1;i--){
			System.out.print("第"+i+"天有"+sum+"个桃子\n");
			sum=sum*2+a+1;
		}
	}
}