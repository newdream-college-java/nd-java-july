/*�� 1 һֱ�ӵ� 100,������ۼӵĺʹ��� 500
ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��*/
public class Demo01{
	public static void main(String[] args){
		int sum=0;	
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>=500){
				System.out.println("�ۼӺʹ���500,i="+i);
				break;
			}
		}
		System.out.println("sum="+sum);	
	}
}