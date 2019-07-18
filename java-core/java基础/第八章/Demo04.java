/*
1.4、 求和:1!+2！+3！+4！+......+10!
*/
public class Demo04{
	public static void main(String[] args){
		int sum1 = 0;
		for(int i = 1;i<=10;i++){
			int sum2 = 1;
			//循环计算每个阶乘的值
			for(int j = 1;j<=i;j++){
				sum2*=j;
			}
			//累加阶乘的值
			sum1+=sum2;
		}
		System.out.println("计算结果为："+sum1);
	}
}