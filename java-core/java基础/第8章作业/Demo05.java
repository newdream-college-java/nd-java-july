/*打印 99 乘法表（先打最后 1 行 最后打第 1 行）*/
public class Demo05{
	public static void main(String[] args){
		for(int i=9;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"X"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}