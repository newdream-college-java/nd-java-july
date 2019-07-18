/*
1.1、 使用 for 循环与 break 语句实现：从 1 一直加到 100,但如果累加的和大于 500
也要结束循环，并输出此时已经加到的数是什么？
*/
public class Demo01{
	public static void main(String[] args){
		int sum = 0;
		int i = 1;
		for(;i<=100;i++){
			sum+=i;
			if(sum>500){
				break ;
			}
		}
		System.out.println("此时加到了："+i);
	}
}
