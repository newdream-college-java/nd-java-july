
public class Dc {
	String type;
	double power;
	String brand;
	
	public void hPower(){
		System.out.print(brand+"Ʒ�Ƶĵ�����ڳ��");
	}
	public void sendPower(){
		System.out.print(brand+"Ʒ�Ƶĵ�����ڷŵ�");
	}
	
	public String getBrand(){
		return brand;
	}
	public double getPower(){
		return power;
	}
	public String gettype(){
		return type;
	}
	public String toString(){
		return brand+power+type;
	}
	
	public void changeBrand1(String b,Dc a){
		a.brand=b;
	}
	public void changeBrand(double b,Dc a){
		a.power=b;
	}
	public void changeBrand(String b,Dc a){
		a.type=b;
	}
}
