/*	�� 100-999 ֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��
*/
import java.lang.Math;

public class E{
	public static void main (String[] args){
		for(int i=100;i<=999;i++){
			if(i==Math.pow(i%10,3)+Math.pow(i/10%10,3)+Math.pow(i/100,3)){
				System.out.println("100-999 ֮���ˮ�ɻ���Ϊ��"+i);
			}
		}
	}
}