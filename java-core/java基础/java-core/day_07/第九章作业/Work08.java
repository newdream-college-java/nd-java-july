/*1.8����һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С�����Ҫ����һ�׸����������飬�����ָ��������������С�Ч����ͼ*/
import java.util.*;
import java.lang.*;
public class Work08{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String[] s={"","Island","Ocean","Pretty","Sun"};
		System.out.print("����ǰ������Ϊ��");
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		System.out.print("������������ƣ�");
		int index=0;
		int i=1;
		String c=in.next();
		for(;i<s.length;i++){
			if(s[i].compareToIgnoreCase(c)>=0){
				index=i-1;
				break;
			}
		}
		if(i==s.length){
			index=s.length-1;
		}
		for(int j=0;j<index;j++){
			s[j]=s[j+1];
		}
		//����Ԫ��
		s[index]=c;
		for(int k=0;k<s.length;k++){
			System.out.print(s[k]+"\t");
		}
		
	}
}
