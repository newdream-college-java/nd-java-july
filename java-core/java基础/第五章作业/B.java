/*
计算1+1/4+1/9+....+1/(20*20)
 */


public  class  B{
	public static void main(String[] args) {
		double i=1,sum=0;
		while(i<=20){
			sum=sum+1/(i*i);
			i++;
		}
		System.out.println("总和为："+sum);
	}
}