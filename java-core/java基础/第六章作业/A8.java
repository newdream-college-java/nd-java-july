import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double score;
		int a=0;
		for(int i=1;i<=5;i++){
			System.out.print("������ѧ���ɼ�:");
			score = input.nextDouble();
			if(score<=80){
				continue;
			}
			a++;
		}
		System.out.print("80�����ϵ���"+a+"��");
	}
}