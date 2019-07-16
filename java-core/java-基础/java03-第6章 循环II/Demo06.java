/*练习3：求1~100的和，计算当和大于500时，加到了哪个数？*/
public class Demo06{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				System.out.println("这个数为："+i);
				break;//中止循环
			}
		}
	}
}