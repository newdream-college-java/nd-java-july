/*�����ͻ�ҵ���� CustomerBiz,ʵ�ֿͻ���������Ӻ���ʾ*/
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
			System.out.println("��������");
		}
	}
	public void show(){
		for(int i=0;i<count;i++){
			System.out.print(names[i]+"\t");
		}
	}
}
