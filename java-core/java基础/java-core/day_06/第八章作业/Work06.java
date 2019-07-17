/*1.6、 打印如下图形*/
public class Work06{
	public static void main(String[] args){
		//1
		for(int i=1;i<=4;i++){
			System.out.println("**************");
		}
		System.out.println();
		//2
		for(int i=1;i<=4;i++){
			System.out.println("**************");
			for(int j=4;j>4-i;j--){
				System.out.print(" ");
			}
			
		}
		System.out.println();
		//3
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//4
		for(int i=1;i<=4;i++){
			
			for(int j =1;j<=9-2*i;j++){
				System.out.print("*");
				
			}
			System.out.println();
			for(int k=4;k>4-i;k--){
				System.out.print(" ");
				}
		}
		System.out.println();
		//5
		for(int i=1;i<=4;i++){
			for(int j =1;j<=7;j++){
				if(i==1){
					System.out.print("*");
				}
				else if(i==2){
					System.out.print("*");
					for(int k=1;k<=3;k++){
						System.out.print(" ");
					}
					System.out.print("*");
					break;
				}else if(i==3){
					System.out.print("*");
					System.out.print(" ");
					System.out.print("*");
					break;
				}else{
					System.out.print("*");
					break;
				}
				
			}
			System.out.println();
			for(int k=4;k>4-i;k--){
				System.out.print(" ");
				}
		}
		System.out.println();


		//6
		for(int i=1;i<=7;i++){
				if(i==1||i==7){
					System.out.print("   ");
					System.out.println("*");
				}
				else if(i==3||i==5){
					System.out.print(" ");
					System.out.print("*");
					for(int k=1;k<=3;k++){
						System.out.print(" ");
					}
					System.out.println("*");
				}else if(i==6||i==2){
					System.out.print("  ");
					System.out.print("*");
					System.out.print(" ");
					System.out.println("*");
				}else{
					System.out.println("*******");
				}
		}
	}
}	