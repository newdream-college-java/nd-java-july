/* **************
      **************
       **************
         **************  */
public class Demo07{
	public static void main(String[] args){
		for(int i=1;i<5;i++){
			for(int j=1;j<15;j++){
				System.out.print("*");
			}
			System.out.println();
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
		}
	}
}