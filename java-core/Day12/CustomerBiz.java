import java.util.Scanner;
/**
 * 创建客户业务类 CustomerBiz,实现客户姓名的添加和显示，如图
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
			System.out.println("数组已满");
			return;
		}
	}
	public void show(){
		 System.out.println("*****************************");
		 System.out.println("\t 客户姓名列表");
		 System.out.println("*****************************");
		 for (int i = 0; i < arrys.length; i++) {
			System.out.print(arrys[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		CustomerBiz c=new CustomerBiz();
		Scanner input=new Scanner(System.in);
		for(int i=0;;i++){
			System.out.print("请输入客户的姓名:");
			String name=input.next();
			c.addCustomer(name);
			System.out.print("还要继续输入吗(y/n)");
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
