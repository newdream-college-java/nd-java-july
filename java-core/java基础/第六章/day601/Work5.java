/*1.5���� 100-999 ֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��*/
public class Work5{
	public static void main(String[] args){
		for(int i =100;i<= 999;i++){
			int a = i%10;
			int b = i/10%10;
			int c = i/100%10;
			if(a*a*a+b*b*b+c*c*c == i){
				System.out.println("����ˮ�ɻ�����"+i);
			}
		}
	}
}