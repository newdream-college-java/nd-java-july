/*	
	ʹ�� for ѭ���� break ���ʵ�֣��� 1 һֱ�ӵ� 100,������ۼӵĺʹ��� 500
	ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��
*/

public class A{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum=sum+i;
			if(sum>500){
				System.out.println("iΪ:"+i);
				break;
			}
		}
	}
}
	

	
