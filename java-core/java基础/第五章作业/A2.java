public class A2{
	public static void main(String[] args){
		double sum = 0;
		int i = 1;
		while(i<=20){
			sum+=1.0/(i*i);
			i++;
		}
		System.out.print("此时总数为"+sum);
	}
}
		