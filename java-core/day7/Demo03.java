import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		/*1.3������ժ��һ���� N ������һ�����һ�룬���Ӳ���񫣬�ֶ����һ�����ڶ���
		           �ֳ���ʣ�µ�һ����һ�����Ժ�ÿ����ˣ�����ʮ�죬����һ��ֻʣ��һ���ˡ�
		           ������ж��ٸ�����?*/
		
		int sum=1;
		for(int i=1; i<=10;i++){
			sum=sum*2+2;
		}
		System.out.println(sum);
		/*1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ���������
		�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��*/
		Scanner input=new Scanner(System.in);
		int data;
		int lessThan=0;
		int greater=0,equal=0;
		for(;;){
			data=input.nextInt();
			if(data==999){
				break;
			}else if(data<0){
				lessThan++;
			}else if(data>0){
				greater++;
			}else{
				equal++;
			}
		}
		System.out.println("�����ĸ����У�"+greater+"\t�����ĸ����У�"+lessThan+"\t0�ĸ����У�"+equal);
	}
}