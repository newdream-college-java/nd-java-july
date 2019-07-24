/*创建客户业务类 CustomerBiz,实现客户姓名的添加和显示*/
package demo01;

public class CustomerBiz {
	int count=0;
	String []names=new String[3];
	public void addname(String name){
		boolean s=false;
		for(int i=0;i<3;i++){
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
	public void show(){
		for(int i=0;i<count;i++){
			System.out.print(names[i]+"\t");
		}
	}
}
