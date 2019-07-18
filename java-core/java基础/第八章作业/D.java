/*1.4、 求和:1!+2！+3！+4！+......+10!*/
public class D{
	public static void main(String[] args){
		int total=0;
		for(int i=1;i<=10;i++){
			int sum=1;
			for(int j=1;j<=i;j++){
				sum*=j;
			}
		total+=sum;
		}
		System.out.println("结果为："+total);
	}
}