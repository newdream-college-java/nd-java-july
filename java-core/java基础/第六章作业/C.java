/*1.3����� 1900-2012 ������.*/
public class C{
	public static void main(String[] srgs){
		for(int i=1900;i<=2012;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i+"��������");
			}
		}
	}
}