/*
	��ӡ����ͼ��
	    *******
                     *    *
                       * *
                        *
*/
import java.util.Scanner;

public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ�е���������");
		int a=input.nextInt();
		for(int i=0;i<4;i++){
			for(int j=a;j>0;j--){
				if(j==a-i||j==i+1){
					System.out.print("*");
				}else if(i==0){
					System.out.print("*");
				}else   
					System.out.print(" ");		
			}
			System.out.println();
		}
	}	
}