import java.util.Scanner;



/*
 假设有一个长度为 5 的数组 int [] array = new int[]{1,3,-1,5,-2}现创建
一 个新数组 newArray[]，要求新数组中元素的存放顺序与原数组的元素逆序，并
且如果原数组 的元素值小于 0，在新数组中按 0 存储。编程输出新数组数据
 */
public class Demo07 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int n=input.nextInt();
		int[] array=new int[n];
		int[] newArray=new int[n];
		for(int i=0;i<array.length;i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			array[i]=input.nextInt();
		}
		for(int i=0;i<array.length;i++){
			if(array[array.length-1-i]>=0){
				newArray[i]=array[array.length-1-i];
			}else{
				newArray[i]=0;
			}
			System.out.print(newArray[i]+"\t");
		}
	}
}
