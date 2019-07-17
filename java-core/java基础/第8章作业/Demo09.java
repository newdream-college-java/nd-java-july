/*
  *******
   *****
    ***
     *
*/
public class Demo09{
	public static void main(String[] args){
		//方法一
		for(int i=4;i>0;i--){
			for(int j=1;j<5-i;j++){//控制空格
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){//控制行
				System.out.print("*");
			}
			System.out.println();
		}
		
		//方法二
		for(int i=1;i<5;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			for(int j=3;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}