import java.util.Scanner;
public class A9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int age;
		int a=0;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"�˿͵�����");	
			age =input.nextInt();
			if(age>=30){
				a++;
			}
		}
		System.out.println("30�����ϵı�����"+a*10.0+"%");
		System.out.println("30�����µı�����"+(10-a)*10.0+"%");
	}
}
		