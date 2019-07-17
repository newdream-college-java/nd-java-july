/*1.3、猴子摘了一堆枣 N 个，第一天吃了一半，还嫌不过瘾，又多吃了一个：第二天又吃了剩下的一半零一个：以后每天如此，到第十天，猴子一看只剩下一个了。问最初有多少个枣子?*/
public class Work03{
	public static void main(String[] args){
		int N=1;
		for(int i=1;i<10;i++){
			N=(N+1)*2;
		}
		System.out.println("总共有"+N+"个桃子");
	}
}