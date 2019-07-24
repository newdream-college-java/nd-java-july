package job02.text2;
//编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。
public class TextCus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer();
		Customer cus2=new Customer();
		cus1.name="王一";
		cus1.age=30;
		cus1.flag=false;
		cus1.show(cus1);
		cus2.name="郝强";
		cus2.age=19;
		cus2.flag=true;
		cus2.show(cus2);
	}

}
