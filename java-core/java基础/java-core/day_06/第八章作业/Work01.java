/*1.1�� ʹ�� for ѭ���� break ���ʵ�֣��� 1 һֱ�ӵ� 100,������ۼӵĺʹ��� 500ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��*/
public class Work01{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		for(;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println("�ӵ���ֵΪ��"+i);
		System.out.println("����500�ĺ�Ϊ��"+sum);
	}
}