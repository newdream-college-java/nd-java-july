/*1、输出斐波拉契数列：1	1   2    3     5    8   13……..前20项。
规律：从第3个数开始，每1个数等于前面2个数之和

分析：
1	1	?2	?3	?
a	b	c=a+b
	a	b	c=a+b
		a	b	c=a+b;

代码：

int a = 1;
int b = 1;
int c ;
第3个数：
	c = a+b;
	输出c:  2
	a=b;
	b=c;
第4个数：
	c=a+b;
	输出c:3
	a=b;
	b=c;
第5个数：
	c=a+b;		
	输出c:5	
	a=b;
	b=c;
循环3要素？
	int i=3; 表示 数列的第几位
	i++;
	i<=20

*/
public class Demo08{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//输入
		int a = 1;
		int b = 1;
		System.out.println(a+"\n"+b);
		int c ;

		int i=3;
		while(i<=20){
			//重复执行的代码
			c=a+b;		
			//输出c:5
			System.out.println(c);
			a=b;
			b=c;

			i++;
		}





	}
}