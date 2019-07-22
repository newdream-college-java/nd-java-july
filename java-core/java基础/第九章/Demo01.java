/*定义特价商品数组，存储 5 件商品名称，控制台显示特价商品名称*/
import java.util.*;
public class Demo01{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("本次活动的特价商品有多少件：");
		int a=input.nextInt();
		String [] names=new String[a]; 
		for(int i=0;i<names.length;i++){
			System.out.print("第"+(i+1)+"件特价商品为：");
			names[i]=input.next();
		}
		System.out.println("本次活动的特价商品有：");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}	
}