package chapter_13_1;

public class Yuegongjisuanqi {
	public void zonglixi(double jine,double lilv){
		double zonglixi=jine*lilv;
		System.out.println("����Ϣ�ǣ�"+zonglixi);
	}
	public void yuegong(double jine,double zonglixi,double year){
		double yuegong=(jine+zonglixi)/year;
		System.out.println("�¹���"+yuegong);
	}
	public static void main(String[] args) {
		Yuegongjisuanqi y=new Yuegongjisuanqi();
		y.zonglixi(50000, 0.01);
		y.yuegong(50000,5000,5*12);
	}

}
