/*1.2������ 1+1/4+1/9+....+1/(20*20)*/
public class Work2{
	public static void main(String[] args){
		double i = 1;
		double sum = 0;
		while(i<=20){
			sum = sum+1/(i*i);
			i++;
		}
		System.out.println("���Ϊ��"+sum);
	}
}