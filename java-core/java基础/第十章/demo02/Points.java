package Jul22;

public class Points {
	/*1.2、需求说明 
实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
积分 500 分。创建客户对象输出他得到的回馈积分*/
	int points;
	String card;
	
	public void result(){
		System.out.println("积分："+points+",卡类型："+card);
		if(card.equals("金卡")&&points>1000||card.equals("普卡")&&points>5000){
			System.out.println("回馈积分500分！");
		}
	}
}
