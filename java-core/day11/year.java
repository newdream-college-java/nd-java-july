/**
 * ���һ���ж�ĳ���Ƿ�����ķ�����Ȼ���� main �����е��ã�������
 * @author 54975
 *
 */
public class year {
	public boolean juDge(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		year y=new year();
		if(y.juDge(2019)){
			System.out.println("������");
		}else{
			System.out.println("��ƽ��");
		}
	}
}
