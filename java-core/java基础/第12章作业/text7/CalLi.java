package job01.text7;

public class CalLi {
	public double liXi(double money,double lilv,int year) {
		double sumLi=(money*lilv/100)*year;
		return sumLi;
	}
	
	public void huanQian(double money,double lilv,int year) {
		double li=liXi(money, lilv,year);
		double huan=(money+li)/(year*12);
		System.out.println("您的贷款金额为："+money+"\t贷款年限为："+year+"\t利率为："+lilv);
		System.out.println("您共应还款："+(money+li)+"元");
		System.out.println("其中利息为："+li);
		System.out.println("您每月应还金额为："+huan);
	}
}
