/*1.5、根据指定不同的行和字符，生成不同的三角形，如图:	
 提示:定义带参方法 printTriangle(int row,String ch)，利用二重循环实现
 */
package demo05;

public class PrintTriangle {
	public void printTriangle(int row,String cj){
		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				System.out.print(cj);
			}
			System.out.println();
		}
	}
}
