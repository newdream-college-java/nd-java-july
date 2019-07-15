/*3、求和：1-2+3-4+5-6.....+99-100
	方式一：(1+3+5...+99)-(2+4+6+8+10....+100)
	方式二：if判断
*/
public class Demo10{
	public static void main(String[] args){
		//int sum1 = 0;//奇数和
		//int sum2 = 0;//偶数和
		//int i=1;
		//while(i<=50){
			//1.求奇数和
		//	sum1+=2*i-1;
			//2.求偶数和
		//	sum2+=2*i;
		//	i++;
		//}
		//3.1-2的结果
		//System.out.println(sum1-sum2);

		//方式二：
		int sum = 0;
		int i=1;
		while(i<=100){
			//if(i是奇数){
			if(i%2==1){
				sum+=i;
			}else{//i是偶数
				sum-=i;
			}
			i++;
		}
		System.out.println(sum);

			

	}
		
}