package chapter12_1;

public class MathMan {
	public int getMax(int a ,int b){
		int max = a>b?a:b;
		return max;
	}
	
	public int getUnit(int a){
		int num = a%10;
		return num;
	}
	
	public int getCube(int a){
		return a*a*a;
	}
	
	public int getSum(int a){
		int sum = 0;
		for(int i = 1;i<=a;i++){
			sum+=i;
		}
		return sum;
		
	}
}
