/*1.6、计算 1*2*3*……*10 的结果。*/
public class Demo06{
	public static void main(String [] args){
		int count=1;
		for(int i=1;i<=10;i++){
			count*=i;
		}
		System.out.print("1*2*3*……*10 的结果为：");
		System.out.println(count);
	}
}