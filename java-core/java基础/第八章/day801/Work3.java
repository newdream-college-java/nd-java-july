/*1.3、 循环 365 天，每天吃三次饭，要求使用嵌套循环来完成。第过一天就输出“总
算又过了一天”，然后这一天里要求输出“我吃了一顿饭”三次。*/
public class Work3{
	public static void main(String[] args){
		for(int i =1;i<=365;i++){
			for(int j = 1;j<=3;j++){
				System.out.println("\t我吃了一顿饭！");			
			}
		System.out.println("总算又过了一天！");
		}
	}
}




