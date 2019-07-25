import java.util.Scanner;


public class CustomerBiz {
	String[] arr=new String[100];
	public void add(String names){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){//如果arr[i]为空，把name赋给names[i]。
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
			System.out.println("请输入客户的名字");
			String a=sc.next();
			cus.add(a);
			count++;
			System.out.print("继续输入吗？(y/n)");
			String answer=sc.next();
			while(!answer.equals("y")&&!answer.equals("n")){
				System.out.print("输入错误，请输入(y/n)");
				answer=sc.next();
			}
			if(answer.equals("n")){
				break;
			}
		}while(count>0);
		cus.show(count);
	}
}
