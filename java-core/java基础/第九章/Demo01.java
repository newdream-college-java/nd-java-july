/*
定义特价商品数组，存储 5 件商品名称，控制台显示特价商品名称 
*/

public class Demo01{
	public static void main (String [] args){
		String a[]={"Nike背包","Adidas运动衫","李宁运动鞋","Kappa外套","361°腰包"};
		System.out.println("本次活动特价商品有：");
		for(int i =0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}