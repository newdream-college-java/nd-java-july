package Chapter09_array;

/*
 定义特价商品数组，存储 5 件商品名称，控制台显示特价商品名称
 */
public class A {
	public static void main(String[] args) {
		String[] a = { "Nike背包", "Adidas运动衫", "李宁运动鞋", "Kappa外套", "361°腰包" };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\n");
		}
	}

}
