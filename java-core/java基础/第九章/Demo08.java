/*
��һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С���
��Ҫ����һ�׸����������飬�����ָ��������������С�
*/
import java.util.*;
public class Demo08{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] musicName={"Island","Ocean","Pretty","Sun"," "};
		System.out.print("����ǰ������Ϊ��");
		for (int  i= 0;  i< musicName.length; i++) {
			System.out.print(musicName[i]+" ");
		}
		System.out.println();
		System.out.print("������������ƣ�");
		String name=input.next();
		int index=0;
		for (int i = 0; i < musicName.length-1; i++) {
			if(name.compareToIgnoreCase(musicName[i])<=0){
				index=i;
				break;
			}
		}
		if(name.compareToIgnoreCase(musicName[musicName.length-2])>0){
			index=musicName.length-1;
		}
		for (int i =musicName.length-1; i >index; i--) {
			musicName[i]=musicName[i-1];
		}
		musicName[index]=name;
		System.out.print("����������Ϊ��");
		for (int i = 0; i < musicName.length; i++) {
			System.out.print(musicName[i]+" ");
		}
	}
}