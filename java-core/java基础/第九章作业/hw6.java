import java.util.Scanner;
public class hw6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"��������");
			int a=sc.nextInt();
			if(a>0&&a<4){
				count++;
			}
		}
		System.out.print("��������Ϊ"+count+"\t�Ƿ����ָ���Ϊ"+(10-count));
	}
}