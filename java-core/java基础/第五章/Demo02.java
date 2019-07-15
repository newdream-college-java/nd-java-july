/*
1.2°¢º∆À„ 1+1/4+1/9+....+1/(20*20)
*/
public class Demo02{
	public static void main(String[] args){
		double i =1;
		double sum = 0;
		while(i<=20){
			sum += 1.0/(i*i);
			i++;
		}
		System.out.println(sum);
	}
}