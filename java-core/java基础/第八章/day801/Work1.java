/*1.1�� ʹ�� for ѭ���� break ���ʵ�֣��� 1 һֱ�ӵ� 100,������ۼӵĺʹ��� 500
ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��*/
public class Work1{
	public static void main(String[] args){
		int sum = 0;
		for(int i =1;i<=100;i++){
			if(sum+i>500){
				System.out.println("�ӵ��˵�"+i+"������");
				break;
			}else
				sum+=i;
		}
		System.out.println("��Ϊ��"+sum);
	}
}