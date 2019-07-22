/*打印如下图形
2. **************
     **************
      **************
       **************
*/
public class Demo07{
	public static void main(String [] args){
		for(int i= 1;i<=4;i++){
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=14;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}