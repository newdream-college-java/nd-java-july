/*修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功*/
package demo03;
//增加客户
import java.util.*;
public class CustomerBiz {
	Scanner input=new Scanner(System.in);
	int count=0;
	String []names=new String[5];
	public void addname(String name){
		boolean s=false;
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				s=true;
				count++;
				names[i]=name;
				break;
			}
		}
		if(!s){
			System.out.println("人数已满");
		}
	}
	//修改客户姓名
	public void xgname(String name){
		boolean s=false;
		for(int i=0;i<count;i++){
			if(names[i].equals(name)){
				s=true;
				System.out.print("请输入新的客户姓名：");
				names[i]=input.next();
				System.out.println("*****修改结果*****");
				System.out.println("找到并且修改成功！");
				break;
			}
		}
		if(!s){
			System.out.println("*****修改结果*****");
			System.out.println("没找到并且修改失败！");
		}
	}
	//显示姓名列表
	public void show(){
		for(int i=0;i<count;i++){
			System.out.print(names[i]+"\t");
		}
	}
}
