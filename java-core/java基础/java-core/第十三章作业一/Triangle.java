package chapter_13_1;
import java.util.Scanner;
import java.util.Arrays;

/*�� 1. ���������ε������߳����ж�����ֱ�ǡ��۽ǣ�������������Ρ���Ҫ
��������:1)�����������������ߵı߳� 2)�ж��Ƿ񹹳������Σ��Ƿ񹹳������ǡ����� ��
��֮�ʹ��ڵ����ߡ�������������ʾ���� 3)���ܹ��ɣ��ж������ε�����һ�ߵ�ƽ���� ��
�������ߵ�ƽ���ĺͣ���Ϊֱ��������;������һ�ߵ�ƽ��������������ƽ���ĺͣ���Ϊ ��
��������;����Ϊ��������Ρ�*/
public class Triangle {
	public void panduan(double []bianchang){
		if(bianchang[0]+bianchang[1]>bianchang[2]){
			if(bianchang[0]*bianchang[0]+bianchang[1]*bianchang[1]==bianchang[2]*bianchang[2]){
				System.out.println("ֱ��������");
			}else if(bianchang[0]*bianchang[0]+bianchang[1]*bianchang[1]<bianchang[2]*bianchang[2]){
				System.out.println("�۽�������");
			}else{
				System.out.println("���������");
			}
		}else{
			System.out.println("������ı߳����ܹ��������Σ�");
		}
		
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������߳���");
		double []bianchangz=new double[3];
		for (int i = 0; i < bianchangz.length; i++) {
			System.out.print("�������"+(i+1)+"���߳���");
			bianchangz[i]=sc.nextDouble();
		}
		Arrays.sort(bianchangz);
		t.panduan(bianchangz);
	}
	

}
