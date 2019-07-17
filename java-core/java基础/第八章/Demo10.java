/*
5.¥Ú”°Õº–Œ

 ******* 
   *   * 
    * * 
     *
*/
public class Demo10{
	public static void main(String [] args){
		for(int i =1;i<=4;i++){
			if(i==1){
				for(int j = 1;j<=7;j++){
					System.out.print("*");
				}
			}else{
				System.out.print("*");
				for(int k =2*i;k<=6;k++){
					System.out.print(" ");
				}
				if(i!=4){
					System.out.print("*");
				}
			}
			System.out.print("\n");
			for(int j =1;j<=i;j++){
				System.out.print(" ");
			}
		}
	}
}