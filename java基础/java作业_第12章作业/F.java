import java.util.Scanner;


public class F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("����������������");
		int q = input.nextInt();
		int w = input.nextInt();
		F p = new F();
		System.out.println("���ֵΪ��"+p.show(q, w));
		System.out.println("������һ��������");
		int e = input.nextInt();
		System.out.println("��λ��Ϊ��"+p.show1(e));
		System.out.println("������һ��������");
		int r = input.nextInt();
		System.out.println("��������Ϊ��"+p.show2(r));
		System.out.println("������һ����������");
		int t = input.nextInt();
		System.out.println("��������ۼӺ�Ϊ��"+p.show3(t));
	}
	public int show(int a,int b){
		int c;
		if(a>b){
			c=a;
		}else {
			c=b;
		}
		return c;
	}
	public int show1(int a){
		int c=0;
		c=a%10;
		return c;
	}
	public int show2(int a){
		int c=0;
		c=a*a*a;
		return c;
	}
	public int show3(int a){
		int c=0;
		if(a>0){
			for(int i=1;i<=a;i++){
				c+=a;
			}
		}else {
			System.out.println("�������");
			
		}
		return c;
	}
}
