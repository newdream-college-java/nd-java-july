/*
	��ӡ����ͼ��
                   *******
	    *****
	     ***
 	      *
*/

public class I{
	public static void main(String[ ] args){
		int a=7;  //����*�ĳ���
		//ѭ����ӡ4��
		for(int i=0;i<4;i++){
			//j����a��i��ֵ���жϴ�ӡ���ٸ�*
			for(int j=a;j>i;j--){
				System.out.print("*");
			}
			a=a-1;
			System.out.println();
			//����������������ӡ���ٸ��ո�
			for(int j=i;j>=0;j--){
				System.out.print(" ");
			}
		}
	}	
}