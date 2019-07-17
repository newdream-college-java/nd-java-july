/*猴子摘了一堆枣 N 个，第一天吃了一半，还嫌不过瘾，又多吃了一个：第二天
又吃了剩下的一半零一个：以后每天如此，到第十天，猴子一看只剩下一个了。
问最初有多少个枣子?
1  1534
2   766
3   382
4   190
*/
public class Demo03{
	public static void main(String[] args){
		int n=1;//总桃子数
		System.out.println("第10天还有"+1+"个枣");
		for(int i=9;i>0;i--){//天数，从第9天开始算,第10天有1个枣
			n=(n+1)*2;
			System.out.println("第"+i+"天还有"+n+"个枣");
		}
		System.out.println("\n最初有"+n+"个枣");
	}
}