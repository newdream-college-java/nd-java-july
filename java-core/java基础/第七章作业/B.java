/*
	ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
	�ͽ���ѭ���������ʾ��������������ַ�����
	���磺���� abc	 ���� def 	���� Esc
	����� abcdef
 */
import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String sum="";
		while(true){
			System.out.print("������һ���ַ�����");
			String a=input.next();
			//if�����ж�������ַ����Ƿ�ΪEsc,������ǣ����ַ�����sum����
			if(a.equals("Esc")){
				break;
			}else{
				sum+=a;
			}
		}
		System.out.println(sum);
	}
}