/*实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
积分 500 分。创建客户对象输出他得到的回馈积分*/
package Demo02;

public class Customer {
	int integral;
	String cardType;
	public void show(){
		if(cardType.equals("金卡")){
			System.out.println("积分："+integral+",卡类型:"+cardType);
			if(integral>1000){
				System.out.println("回馈积分500分！");
			}
		}else{
			System.out.println("积分："+integral+",卡类型:"+cardType);
			if(integral>5000){
				System.out.println("回馈积分500分！");
			}
		}
	}
}
