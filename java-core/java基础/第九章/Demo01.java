/*�����ؼ���Ʒ���飬�洢 5 ����Ʒ���ƣ�����̨��ʾ�ؼ���Ʒ����*/
import java.util.*;
public class Demo01{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���λ���ؼ���Ʒ�ж��ټ���");
		int a=input.nextInt();
		String [] names=new String[a]; 
		for(int i=0;i<names.length;i++){
			System.out.print("��"+(i+1)+"���ؼ���ƷΪ��");
			names[i]=input.next();
		}
		System.out.println("���λ���ؼ���Ʒ�У�");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}	
}