/*1.2、计算 1+1/4+1/9+....+1/(20*20)*/
public class Work02{
	public static void main(String[] args){
		double i=1,sum=0;
		while(i<=20){
			sum=sum+1/(i*i);
			i++;
		}
		System.out.println("1+1/4+1/9+....+1/(20*20)之和为"+sum);
	}
}