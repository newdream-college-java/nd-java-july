package text2.praJob10;

/*实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
积分 500 分。创建客户对象输出他得到的回馈积分*/
public class Text02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card=new Card();
		card.shuRu();
		card.show();
		card.reward();
	}

}
