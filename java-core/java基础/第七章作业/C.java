/*��	
	����ժ��һ���� N ������һ�����һ�룬���Ӳ���񫣬�ֶ����һ�����ڶ���
	�ֳ���ʣ�µ�һ����һ�����Ժ�ÿ����ˣ�����ʮ�죬����һ��ֻʣ��һ���ˡ�
	������ж��ٸ�����?
*/


public class C{
	public static void main(String[] args) {
		int a=1,sum=1;
		for(int i=10;i>=1;i--){
			System.out.print("��"+i+"����"+sum+"������\n");
			sum=sum*2+a+1;
		}
	}
}