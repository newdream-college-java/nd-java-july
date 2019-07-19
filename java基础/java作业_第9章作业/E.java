import java.util.Scanner;
public class E{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double sum=0;
		double[] a= new double[10];
		double max = 0;
	
		int c=0;
		int l=0;
		int y=0;
		for(int i=0;i<a.length;i++){
		System.out.println("请输入第"+(i+1)+"个同学的成绩：");
		a[i] = input.nextDouble();
		sum+=a[i];
		
		
		if(a[i]<60){
			c++;
		}else if(a[i]>=60&&a[i]<80){
			l++;
		}else {
			y++;
		}
		}
		double min = a[0];		
		for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max = a[i];
		}		
			if(a[i]<min){
			min = a[i];
			}
		}
		System.out.println("成绩在60分以下的人数为："+c);
		System.out.println("成绩在60分以上80分以下的人数为："+l);
		System.out.println("成绩在80分以上的人数为："+y);
		System.out.println("平均分："+sum/a.length+"最大值："+max+"最小值："+min);
}
}