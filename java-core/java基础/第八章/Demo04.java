/*
1.4�� ���:1!+2��+3��+4��+......+10!
*/
public class Demo04{
	public static void main(String[] args){
		int sum1 = 0;
		for(int i = 1;i<=10;i++){
			int sum2 = 1;
			//ѭ������ÿ���׳˵�ֵ
			for(int j = 1;j<=i;j++){
				sum2*=j;
			}
			//�ۼӽ׳˵�ֵ
			sum1+=sum2;
		}
		System.out.println("������Ϊ��"+sum1);
	}
}