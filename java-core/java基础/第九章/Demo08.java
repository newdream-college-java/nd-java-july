/*1.8����һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С���
��Ҫ����һ�׸����������飬�����ָ��������������С�*/
import java.util.*;
public class Demo08{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		String [] music={"","Island","Ocean","Pretty","Sun"};
		System.out.print("����ǰ������Ϊ��");
		for(int i=1;i<=4;i++){
			System.out.print(music[i]+"  ");
		}
		System.out.println("");
		System.out.print("���������������:");
		music[0]=input.next();
		String tmp="";
		for(int i=0;i<4;i++){
			if(music[i].compareToIgnoreCase(music[i+1])>0){
				tmp=music[i];
				music[i]=music[i+1];
				music[i+1]=tmp;
			}
		}
		System.out.print("����������Ϊ��");
		for(int i=0;i<=4;i++){
			System.out.print(music[i]+"  ");
		}
	}	
}