/*开发一个标题为”FlipFlop”的游戏应用程序。它从 1 计数到 100，遇到 3
的倍数就输出单词“Flip”，遇到 5 的倍数就输出单词”Flop”，既为 3 的倍数也为
5 的倍数就输出”FlipFlop”，其余情况输出当前数字。*/
public class Demo02{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("第"+i+"个："+"FlipFlop");
			}else {
				if(i%5==0){
					System.out.println("第"+i+"个："+"Flop");
				}else if(i%3==0){
					System.out.println("第"+i+"个："+"Flip");
				}
			}
		}
	}
}