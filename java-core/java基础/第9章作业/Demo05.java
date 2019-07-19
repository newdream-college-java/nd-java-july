import java.util.Scanner;
/*
 输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)
和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分 
 */
public class Demo05 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double arr[]=new double[10];
		int count1=0,count2=0,count3=0;
		double sum=0;
		System.out.println("请输入10个同学的单科成绩：");
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"位同学的成绩：");
			arr[i]=input.nextDouble();
			sum+=arr[i];
			if(arr[i]<60){
				count1++;
			}else if(arr[i]>=80){
				count3++;
			}else{
				count2++;
			}
		}
		double max=arr[0];
		double min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				continue;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
				continue;
			}
		}
		System.out.println("成绩在60分以下的人数为："+count1);
		System.out.println("成绩在60分~80分（含60）的人数为："+count2);
		System.out.println("成绩在80分以上的人数为："+count3);
		System.out.println("最高分为："+max);
		System.out.println("最低分为："+min);
		System.out.println("平均分为："+sum/10);
	}
}
