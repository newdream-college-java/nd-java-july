/*�޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�*/
package demo03;
//���ӿͻ�
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
			System.out.println("��������");
		}
	}
	//�޸Ŀͻ�����
	public void xgname(String name){
		boolean s=false;
		for(int i=0;i<count;i++){
			if(names[i].equals(name)){
				s=true;
				System.out.print("�������µĿͻ�������");
				names[i]=input.next();
				System.out.println("*****�޸Ľ��*****");
				System.out.println("�ҵ������޸ĳɹ���");
				break;
			}
		}
		if(!s){
			System.out.println("*****�޸Ľ��*****");
			System.out.println("û�ҵ������޸�ʧ�ܣ�");
		}
	}
	//��ʾ�����б�
	public void show(){
		for(int i=0;i<count;i++){
			System.out.print(names[i]+"\t");
		}
	}
}
