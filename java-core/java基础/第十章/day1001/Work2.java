/*
 * 1.2、需求说明
	实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
	积分 500 分。创建客户对象输出他得到的回馈积分
 * */
public class Work2 {
		int  integral;
		String type;
		public void  integralAdd() {
			if(type.equals("金卡")){
				if(integral>1000){
					System.out.println("回馈积分500");
				}else{
					System.out.println("您的积分不足！");
				}
			}else if(type.equals("普卡")){
				if(integral>5000){
					System.out.println("回馈积分500");
				}else{
					System.out.println("您的积分不足！");
				}
			}
		}
		public void show(){
			System.out.println("您的积分："+integral+"\t卡的类型："+type);
		}
		public static void main(String[] args) {
			Work2 a = new Work2();
			a.type = "金卡";
			a.integral = 1200;
			a.show();
			a.integralAdd();
		}
}
