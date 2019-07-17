/*
5. *******
      *   *
       * *
        *
*/
public class Work7 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
 			for(int j=1;j<=n-i;j++) { 			//控制每行最前面的空格
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k  ++) { 		//控制总的星号和空格
				if(i==1||i==n) { 
   					System.out.print("*");
  				}else if(k==1||k==2*i-1) { 		//控制第二行到n-1行的星号的输出
   					System.out.print("*");
   				}else { 				//控制第二行到n-1行的空格的输出
   					System.out.print(" ");
  					}	
  			}
  			System.out.println(); 			//每行输出完毕后进行换行操作
		}
 	}
}