/*
												12
	11		22		33		44		55
	i=0				m=2				 j=4


	11		22		33		44		55
	i=0		j=1
	m=0

	11		22		33		44		55
			j=1
			i=1
			m=1

	11		22		33		44		55
	j=0		i=1



int i=0;
int j=arr.lenght-1;
while(i<=j){
	Middle =(i+j)/2;
	if(number>arr[middle]){
		i= middle+1;
	}else if(number<arr[middle]){
		y= middle-1;
	}else{
		这个数就在arr[middle]
		停止查找
	}
}
*/
	
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr = {11,22,33,44,55,66};
		//提示
		System.out.print("请输入你要查找的数：");
		int num = input.nextInt();
		int i= 0;
		int j= arr.length-1;
		while(i<=j){
			int middle = (i+j)/2;
			if(arr[middle]>num){
				//查找的数在middle的左边
				j=middle-1;

			}else if(arr[middle]<num){
				//查找的数在middle的右边
				i=middle+1;
			}else{
				System.out.println(num+"在数组的下标为："+middle+"的位置");
				break;
			}
		}
		if(i>j){
			System.out.println("查无此数！！");
		}


	}
}















