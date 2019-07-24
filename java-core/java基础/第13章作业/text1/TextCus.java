package job02.text1;
//编写方法，实现对客户姓名的排序
public class TextCus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus=new Customer();
		String[] arr= {"fhh","egg","dff","cee","bdd","acc"};
		cus.sortCus(arr);
		cus.show(arr);
	}

}
