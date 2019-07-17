/*
*******
  *    *
   * *
    *
*/
public class Demo10{
	public static void main(String[] args){
		for(int i=1;i<5;i++){
			for(int j=1;j<i;j++){//每行前面的空格
				System.out.print(" ");
			}
			if(i!=1){
				for(int j=1;j<=2*(5-i)-1;j++){
					if(j>1&&j<2*(5-i)-1){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
				
			}else{
				for(int j=1;j<=2*(5-i)-1;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}