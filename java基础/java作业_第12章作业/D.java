import java.util.Scanner;


public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("1�����\t2��ȡ��\t0���˳�");
		System.out.println("��������Ҫ�����ҵ��");
		int a = input.nextInt();
		D p = new D();
		p.show(a);
	
		
		
	}
	public void show(int yw){
		Scanner input = new Scanner(System.in);
		int ye=0;
		for(int i=1;i>0;i++){
			if(yw==1){
				System.out.print("���������");
				int ck = input.nextInt();
				ye+=ck;
				System.out.println("���ɹ�\b");
				System.out.println("***��ǰ���Ϊ��"+ye);
			}else if(yw==2){
				System.out.print("������ȡ���");
				int qk = input.nextInt();
				if(qk<=ye){
					ye-=qk;
					System.out.println("ȡ��ɹ�");
					System.out.println("***��ǰ���Ϊ��"+ye);
				}else {
					System.out.println("����");
				}
				
			}else if(yw==0){
				System.out.println("ллʹ��");
				break;
		}
			System.out.println("1�����\t2��ȡ��\t0���˳�");
			System.out.print("��������Ҫ�����ҵ��");
			 yw = input.nextInt();
		
	}

}
}
