import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		//���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���
		Scanner input=new Scanner(System.in);
		int ageData;
		double sum=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿�����");
			ageData=input.nextInt();
			if(ageData>=30){
				sum++;
			}
		}
		double proporion=(sum/10.0)*10;
		System.out.println("30�����ϵı�����"+proporion+"%");
		System.out.println("30�����µı�����"+(10-proporion)+"%");
	}
}