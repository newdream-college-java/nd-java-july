/*1.2、计算 1+1/4+1/9+....+1/(20*20)*/
public class Demo02{
	public static void main(String [] args){
		double sum=0;
		int i=1;
		double a=1.0;
		int b=1;
		while(i<=20){
			sum+=a;
			i++;
			a=1.0/(i*i);
		}
		System.out.println("1+1/4+1/9+....+1/(20*20)的值为："+sum);
	}	
}