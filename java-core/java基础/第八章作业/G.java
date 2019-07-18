/*	
	打印如下图形
	**************
	 **************
	  **************
	   **************
*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
		for(int i=0;i<4;i++){
			System.out.println("**************");
			//判断i的值，可知当前的位置，在根据位置打多少空格
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
		}	
	}
}