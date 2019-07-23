/*
定义特价商品数组，存储5件商品名称，控制台显示特价商品名称
*/
public class Demo01{
	public static void main(String[] args){
		String[] arr = {"飞旺","辣条","毛巾","mac","香油条"};
		System.out.println("本次活动特价商品有：");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}