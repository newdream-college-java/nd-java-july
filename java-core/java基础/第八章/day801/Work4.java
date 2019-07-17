/*1.4、 求和:1!+2！+3！+4！+......+10!*/
public class Work4{
	public static void main(String[] args){
		int sum = 0;
		int jc = 1;
		for(int i =1;i<=10;i++){	
			for(int j =1; j<=i ; j++){
				jc*=j;
			}
			System.out.println(jc);
			sum+=jc;
			jc = 1;
		}
		System.out.println("总和为："+sum);
	}
}