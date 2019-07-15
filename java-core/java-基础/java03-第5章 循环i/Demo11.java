/*
4、求和：1/1+1/2+1/3+1/4+1/5+....+1/100
注意点：1/2=0  1/3=0
*/
public class Demo11{
	public static void main(String[] args){
		double sum = 0;
		int i=1;//i表示分母
		while(i<=100){
			sum+=1.0/i;
			i++;
		}
		System.out.println(sum);

	}
}