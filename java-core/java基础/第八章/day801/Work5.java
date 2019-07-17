/*
1.5、 打印 99 乘法表（先打最后 1 行 最后打第 1 行）
*/

public class Work5{
	public static void main(String[] args){
		for(int i = 9;i>=1;i--){
			for(int j = 1;j<=i;j++){
				if(i==j){
				System.out.print(j+"x"+i+"="+i*j+"\n");		
				}else
					System.out.print(j+"x"+i+"="+i*j+"\t");
			}
		}
	}
}