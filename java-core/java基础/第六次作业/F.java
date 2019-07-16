/*、计算 1*2*3*……*10 的结果
 */

public class F{
	public static void main(String[ ] args){
		int sum=1;
		for(int i=1;i<=10;i++){
			sum=sum*i;
		}
		System.out.println("1*2*3*……*10 的结果为："+sum);
	}
}