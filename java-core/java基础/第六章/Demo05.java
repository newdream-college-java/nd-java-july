/*
1.5���� 100-999 ֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��
*/
public class Demo05{
	public static void main(String[] args){
		for(int i =100;i<1000;i++){
			double a,b,c;
			 a = Math.pow( (i%10),3);
			 b = Math.pow( (i/10%10),3);
			 c = Math.pow( (i/100%10),3);
			if((a+b+c) == i){
				System.out.println(i);
			}	
		}
	}
}