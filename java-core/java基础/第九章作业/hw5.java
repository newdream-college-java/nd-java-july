import java.util.Scanner;
public class hw5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������ѧ������:");
		int num=sc.nextInt();
		double sum=0;
		int max=0;
		int min=1000;
		for(int i=1;i<=num;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ���");
			int score=sc.nextInt();
			sum+=score;
			if(max<=score){
				max=score;
			}
			if(min>score){
				min=score;
			}
		}
		System.out.println("��߷�Ϊ"+max+"\t��ͷ�Ϊ"+min);
		System.out.print("ƽ����Ϊ"+sum/num);
	}
}