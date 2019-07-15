/*计算 1+1/4+1/9+....+1/(20*20)*/
public class Demo02{
	public static void main(String[] args){
		int i=1;
		double sum=0;
		while(i<=20){
			sum+=(double)1/(i*i);
			i++;
		}
		System.out.println("结果为："+sum);
	}
}