package chapter_13_1;
/*1.1������˵��
�����ͻ�ҵ���� CustomerBiz,ʵ�ֿͻ���������Ӻ���ʾ����ͼ*/
import java.util.Scanner;

public class CustomerBiz {
	String [] names;
	public void addcus(){
		Scanner sc=new Scanner(System.in);
		int count = 1;
		int i=0;
		do{System.out.print("������ͻ���������");
			String name=sc.next();
			names[i]=name;
			i++;
			System.out.print("���������𣿣�y/n��:");
			String hd=sc.next();
			if(hd.equals("y")){
				count++;
			}else if(hd.equals("n")){
				break;
			}else {
				System.out.println("���벻��ȷ���밴Ҫ�����룡");
				count++;
				continue;
			}
			
		}while(i<names.length);
		System.out.println("*******************************");
		for(int j=0;j<count;j++){			
			System.out.print(names[j]+"\t");
		}
		System.out.println();
		System.out.println("*******************************");
	}
	public static void main(String[] args) {
		CustomerBiz c=new CustomerBiz();
		c.names=new String[4];
		c.addcus();
		

	}

}
