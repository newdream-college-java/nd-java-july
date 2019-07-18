/*
升序数组：0 60 63 82 85 99
插入的数：70  要求：插入70 任然保持数组有序

结果：60 63 70 82 85 99
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] arr = {0,60,63,82,85,99};
		//提示
		System.out.print("请输入要插入的数：");
		int num = input.nextInt();
		//思路一：将70插入arr[0]，然后排序
		//思路二：先找 再移动 在插入
		int index=0;//num要插入的下标假设为0
		boolean flag = false;//假设不能找到比num大的数
		//1.先找到70所要插入数组的下标
		for(int i=1;i<arr.length;i++){
			if(num<arr[i]){
				flag = true;//假设不成立
				index = i-1;
				break;//停止查找
			}
		}
		if(!flag){
			index = arr.length-1;
		}
		System.out.println("下标为："+index);
		//2.将找出的下标位置及之前的元素前移
		//arr[0]=arr[1]
		//arr[1]=arr[2]
		//。。。。。
		//arr[index-1] = arr[index]
		for(int i=0;i<index;i++){
			arr[i]=arr[i+1];
		}

		//3.最后将这个数70 放入下标位置
		arr[index]=num;
		//4.输出数组的值
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

	}
}