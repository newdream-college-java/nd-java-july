import java.util.Scanner;


public class CustomerBiz {
	String[] arr=new String[100];
	public void add(String names){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){//���arr[i]Ϊ�գ���name����names[i]��
				arr[i]=names;
				break;
				} 
		}
	}
	public void show(int num){
		for(int i=0;i<num;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args) {
		CustomerBiz cus=new CustomerBiz();
		Scanner sc=new Scanner(System.in);
		int count=0;
		do{
			System.out.println("������ͻ�������");
			String a=sc.next();
			cus.add(a);
			count++;
			System.out.print("����������(y/n)");
			String answer=sc.next();
			while(!answer.equals("y")&&!answer.equals("n")){
				System.out.print("�������������(y/n)");
				answer=sc.next();
			}
			if(answer.equals("n")){
				break;
			}
		}while(count>0);
		cus.show(count);
	}
}
