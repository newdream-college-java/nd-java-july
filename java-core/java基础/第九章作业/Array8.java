import java.util.Scanner;

/*1.8����һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С���
��Ҫ����һ�׸����������飬�����ָ��������������С�Ч����ͼ:*/
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] song={" ","Island","Ocean","Pretty","Sun"};
		System.out.print("������������ƣ�");
		String music=input.next();
		int index=0;
		System.out.print("����ǰ����Ϊ��");
		for (int i = 1; i < song.length; i++) {
			System.out.print(song[i]+" ");
			if (music.compareToIgnoreCase(song[i])<0) {
				index=i-1;
				break;
			}
			if (music.compareToIgnoreCase(song[song.length-1])>=0) {
				index=song.length-1;
			}
		}
		System.out.println();
		for (int i = 0; i < index; i++) {
			song[i]=song[i+1];
		}
		song[index]=music;
		System.out.print("��������Ϊ��");
		for (int i = 0; i < song.length; i++) {
			System.out.print(song[i]+" ");
		}
	}

}
