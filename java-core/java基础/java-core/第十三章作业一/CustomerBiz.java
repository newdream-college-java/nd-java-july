package chapter_13_1;
/*1.1、需求说明
创建客户业务类 CustomerBiz,实现客户姓名的添加和显示，如图*/
import java.util.Scanner;

public class CustomerBiz {
	String [] names;
	public void addcus(){
		Scanner sc=new Scanner(System.in);
		int count = 1;
		int i=0;
		do{System.out.print("请输入客户的姓名：");
			String name=sc.next();
			names[i]=name;
			i++;
			System.out.print("继续输入吗？（y/n）:");
			String hd=sc.next();
			if(hd.equals("y")){
				count++;
			}else if(hd.equals("n")){
				break;
			}else {
				System.out.println("输入不正确！请按要求输入！");
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
