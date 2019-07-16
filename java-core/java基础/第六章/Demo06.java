/*
1.6、计算 1*2*3*……*10 的结果
*/
public class Demo06{
	public static void main(String[] args){
		int num = 1;
		for(int i = 1;i<=10;i++){
			num*=i;
		}
		System.out.println(num);
	}
}