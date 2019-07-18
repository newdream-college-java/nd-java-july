/*
1.6、 打印如下图形
1.
**************
**************
**************
**************
2.
**************
 **************
  **************
    **************
3.
****
***
**
*
4.
*******
  *****
   ***
     *
5.
*******
   *   *
    * *
     *
6.
      *
   *   *
 *       *
*******
 *       *
   *   *
     *	
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("*********一维智能打印系统**********");
		System.out.print("输入数字1~6打印图案（输“0”退出）：");
		int n = input.nextInt();
		switch(n){
			case 1:
				for(int i = 1;i<=4;i++){
					for(int j =1; j<=10;j++){
						if(j == 10){
							System.out.println("*");
						}
						else{
							System.out.print("*");
						}	
					}
				}
				break ;
			case 2:
				for(int i = 1;i <=4;i++){
					for(int k = 1;k<i;k++){
						System.out.print(" ");
					}
					for(int j = 1;j<=10;j++){
						if(j == 10){
							System.out.println("*");
						}
						else{
							System.out.print("*");
						}	
					}
				}
				break ;
			case 3:
				int a3 = 4;
				for(int i = 1;i<=4;i++){
					for(int j =1;j<=a3;j++){
						if(j == a3){
							System.out.println("*");
						}
						else{
							System.out.print("*");
						}
					}
					a3--;
				}
				break ;
			case 4:
				{int b4 = 7;
				for(int i = 1;i<=4;i++){
					//输出空格
					for(int k = 1;k<i;k++){
						System.out.print(" ");
					}
					//递减输出“*”
					for(int j =1;j<=b4;j++){
						System.out.print("*");
					}
					System.out.println();
					b4-=2;
				}
				break ;}
			case 5:
				int b5 = 7;
				for(int i = 1;i<=4;i++){
					//输出空格
					for(int k = 1;k<i;k++){
						System.out.print(" ");
					}
					//递减输出“*”
					for(int j =1;j<=b5;j++){	
						if(i == 4||i ==1){
							System.out.print("*");
						}
						else{
							if(j == 1||j == b5){
								System.out.print("*");
							}
							else{
								System.out.print(" ");
							}
						}
						}
					System.out.println();
					b5-=2;
				}
				break ;

			case 6:
		
				int b6 = 1;
				int kg6 = 3;
				for(int i = 1;i<=7;i++){
					//输出空格
					for(int k = 1;k<=kg6;k++){
						System.out.print(" ");
					}
					//递减输出“*”
					for(int j =1;j<=b6;j++){	
						if(i == 4||i ==1||i == 7){
							System.out.print("*");
						}
					//第一列与最后一列输出“*”中间输“ ”
						else{
							if(j == 1||j == b6){
								System.out.print("*");
							}
							else{
								System.out.print(" ");
							}
						}
					}
				System.out.println();
				//前三行空格递减，打印递增，后四排空格递增，打印递减
				if(i<4){
					kg6--;
					b6+=2;
					continue ;
					}
					kg6++;
					b6-=2;
				}
				break ;
			default :
				break;
		}
	}
}