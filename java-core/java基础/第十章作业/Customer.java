package 第10章作业;

/*
 实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
 积分 500 分。创建客户对象输出他得到的回馈积分
 */

public class Customer {
	int 积分 = 3050;
	String 卡类型 = "金卡";
	int 回馈积分 = 500;

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("积分：" + customer.积分 + ",卡类型：" + customer.卡类型);
		System.out.println("回馈积分" + customer.回馈积分 + "分!");
	}

}
