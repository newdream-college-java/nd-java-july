package chapter12_1;
	
public class Account {
	double money = 0;
	public void save(double money1){
		money+=money1;
		System.out.println("存款成功");
		System.out.println();
		System.out.println("***当前余额为："+money+"***");
	}
	public void get(double money2){
		money-=money2;
		System.out.println("取款成功");
		System.out.println();
		System.out.println("***当前余额为："+money+"***");
	}
}
