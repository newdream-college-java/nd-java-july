/*���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		Random ran=new Random();
		System.out.print("�����漸�֣�");
		int ju=input.nextInt();
		int b=0,i;	
		int d=1,count1=0,count2=0,count3=0;
		String n=null,c=null;
		do{	
			System.out.print("�����(ʯͷ-0������-1����-2)��");
			i=input.nextInt();
			if(i>2||i<0){
				System.out.println("�����������������");
				System.out.print("�����(ʯͷ-0������-1����-2)��");
				i=input.nextInt();
			}
			b=ran.nextInt(3);
			n=leiXing(i);
			c=leiXing(b);
			/*�����ʯͷ������
			if(i==0){
				n="ʯͷ";
			}else if(i==1){
				n="����";
			}else{
				n="��";
			}

			if(b==0){
				c="ʯͷ";
			}else if(b==1){
				c="����";
			}else{
				c="��";
			}*/
			//�ȽϽ�����ж�
			if((i==0&&b==2)||(i==2&&b==0)){
				if(i>b){
					System.out.println("������ǣ�"+n+"\t"+"���Գ����ǣ�"+c+"\n"+"��"+d+"�֣���Ӯ");	
					count1++;	
				}else{
					System.out.println("������ǣ�"+n+"\t"+"���Գ����ǣ�"+c+"\n"+"��"+d+"�֣�����Ӯ");
					count2++;
				}
			}else if(i==b){
				System.out.println("������ǣ�"+n+"\t"+"���Գ����ǣ�"+c+"\n"+"��"+d+"�֣�ƽ��");
				count3++;
			}else{
				if(i<b){
					System.out.println("������ǣ�"+n+"\t"+"���Գ����ǣ�"+c+"\n"+"��"+d+"�֣���Ӯ");
					count1++;
				}else{
					System.out.println("������ǣ�"+n+"\t"+"���Գ����ǣ�"+c+"\n"+"��"+d+"�֣�����Ӯ");
					count2++;
				}
			}
			d++;
		}while(i>=0&&i<=2&&d<=ju);
		System.out.println("��Ϸ������������");
		if(count1>count2){
			System.out.println("��Ӯ��"+count1+"�Σ�"+"����Ӯ��"+count2+"�Σ�"+"ƽ��"+count3+"�Σ�"+"��ѱ�����Ӯ�ˣ�����");
		}else if(count1==count2){
			System.out.println("��Ӯ��"+count1+"�Σ�"+"����Ӯ��"+count2+"�Σ�"+"ƽ��"+count3+"�Σ�"+"��ѱ���ƽ�֣�����");	
		}else{
			System.out.println("��Ӯ��"+count1+"�Σ�"+"����Ӯ��"+count2+"�Σ�"+"ƽ��"+count3+"�Σ�"+"��ѱ�������Ӯ�ˣ�����");
		}
		
	}
	public static String leiXing(int i){
		String n=null;
		if(i==0){
			n="ʯͷ";
		}else if(i==1){
			n="����";
		}else{
			n="��";
		}
		return n;
	}
}