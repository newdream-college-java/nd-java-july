import java.util.*;
public class Demo04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int index=0;
		int i;
		int [] a={0,60,65,70,80,99};
		//1、先找到位置
		for(i=1;i<a.length;i++){
			if(num<a[i]){
				index=i-1;
				break;	
			}
		}
		if(i==a.length){
			index=a.length-1;
		}
		System.out.println(index);
		//2、前移
		for(i=0;i<=index-1;i++){
			a[i]=a[i+1];
		}
		//3、插入
		a[index]=num;
		//4、输出
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
}