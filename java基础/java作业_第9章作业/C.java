import java.util.Arrays;
public class C{
	public static void main(String [] args){
		char[] a ={'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("���������");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("�������Ϊ��");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"\t");
		}
}
}