public class Demo01{
	public static void main(String[] arge){
		//1.1、计算 100 以内的奇数之和
		int sum=0;
		for(int i=0;i<100;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println("100以内的奇数和是"+sum);
		//1.2、 开发一个标题为”FlipFlop”的游戏应用程序。它从 1 计数到 100，遇到 3
		//的倍数就输出单词“Flip”，遇到 5 的倍数就输出单词”Flop”，既为 3 的倍数也为
		//5 的倍数就输出”FlipFlop”，其余情况输出当前数字
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
				continue;
			}
			if(i%3==0){
				System.out.println("Flip");
				continue;
			}
			if(i%5==0){
				System.out.println("Flop");
				continue;
			}
			System.out.println(i);
		}
		//1.3、输出 1900-2012 的闰年
		for(int i=1900;i<=2012;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i+"年是闰年");
			}
		}
		//1.4、输出 10000-99999 里面的所有回文数。说明：例如：12321 是回文数，个位与
			//万位相同，十位与千位相同。12321 99999 99899
			for(int i=10000;i<100000;i++){
				if(i%10==i/10000%10&&i/10%10==i/1000%10){
					System.out.println(i);
				}
			}
		//1.5、求 100-999 之间的水仙花数。（例如：水仙花数 153=1*1*1+5*5*5+3*3*3）
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100%10;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
		//1.6、计算 1*2*3*……*10 的结果
		int svn=1;
		for(int i=1;i<=10;i++){
			svn*=i;
			System.out.print(i+"*");
		}
		System.out.println("="+svn);
	}
}