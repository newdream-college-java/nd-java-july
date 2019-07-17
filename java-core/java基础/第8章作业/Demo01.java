/*从 1 一直加到 100,但如果累加的和大于 500
也要结束循环，并输出此时已经加到的数是什么？*/
public class Demo01{
	public static void main(String[] args){
		int sum=0;	
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>=500){
				System.out.println("累加和大于500,i="+i);
				break;
			}
		}
		System.out.println("sum="+sum);	
	}
}