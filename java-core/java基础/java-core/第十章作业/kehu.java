package chapter_10;
/*1.2、需求说明
实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
积分 500 分。创建客户对象输出他得到的回馈积分*/
public class kehu {
	String cardType;
	int score;
	
	public  void huikui(){
		if((cardType.equals("金卡")&&score>1000)||(cardType.equals("普卡")&&score>5000)){
			score+=500;
			System.out.println("积分："+score+"，卡类型："+cardType);
			System.out.println("回馈积分500!");
		}
	}
	public static void main(String[] args) {
		admin admin1=new admin();
		admin admin2=new admin();
		admin1.userName="admin1";
		admin2.userName="admin2";
		admin1.passWord=111111;
		admin2.passWord=222222;
		admin1.show();
		admin2.show();
		admin1.gxmima();
		admin2.gxmima();
		

	}

}
