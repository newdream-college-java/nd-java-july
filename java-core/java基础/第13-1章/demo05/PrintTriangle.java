/*1.5������ָ����ͬ���к��ַ������ɲ�ͬ�������Σ���ͼ:	
 ��ʾ:������η��� printTriangle(int row,String ch)�����ö���ѭ��ʵ��
 */
package demo05;

public class PrintTriangle {
	public void printTriangle(int row,String cj){
		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				System.out.print(cj);
			}
			System.out.println();
		}
	}
}
