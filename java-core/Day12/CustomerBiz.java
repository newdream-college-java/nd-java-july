import java.util.Scanner;
/**
 * �����ͻ�ҵ���� CustomerBiz,ʵ�ֿͻ���������Ӻ���ʾ����ͼ
 * @author 54975
 *
 */
public class CustomerBiz {
	String name;
	String[] arrys=new String[4];
	public void addCustomer(String name){
		boolean flas=false;
		for(int i=0;i<arrys.length;i++){
		if(arrys[i]==null){
			flas=true;
			arrys[i]=name;
			break;
		}
		}
		if(!flas){
			System.out.println("��������");
			return;
		}
	}
	public void show(){
		 System.out.println("*****************************");
		 System.out.println("\t �ͻ������б�");
		 System.out.println("*****************************");
		 for (int i = 0; i < arrys.length; i++) {
			System.out.print(arrys[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		CustomerBiz c=new CustomerBiz();
		Scanner input=new Scanner(System.in);
		for(int i=0;;i++){
			System.out.print("������ͻ�������:");
			String name=input.next();
			c.addCustomer(name);
			System.out.print("��Ҫ����������(y/n)");
			String table=input.next();
			if(table.equals("y")){
				continue;
			}else{
				break;
			}	
		}
		c.show();
	}
	
}
