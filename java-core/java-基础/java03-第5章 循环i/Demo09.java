/*1、累加求和:1+2+3+….+100   累加问题：钱箱子法
2、累加求和：1+3+5+7+....+99
	int sum = 0;
	int i=1;
	while(i<=99){
		sum+=i;
		i+=2;
	}
	System.out.println(sum);
3、求和：1-2+3-4+5-6.....+99-100
	方式一：(1+3+5...+99)-(2+4+6+8+10....+100)
	方式二：if判断
4、求和：1+1/2+1/3+1/4+1/5+....+1/100
*/
public class Demo09{
	public static void main(String[]args){
		//while循环
		//第1步：钱箱子清零
		int sum = 0;
		//第2步：100依次向钱箱子投钱-----while循环
		int i=1;//i表示人数
		while(i<=100){
			//sum=sum+i;
			sum+=i;
			i++;
		}
		System.out.println(sum);//这个代码不要重复



		//do-while循环
		sum = 0;
		int j =1;
		do{
			sum = sum+j;
			j++;
		}while(j<=100);
		System.out.println("1+2+。。。+100的和为："+sum);
 
	}
}