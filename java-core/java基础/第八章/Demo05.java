/*
1.5、 打印 99 乘法表（先打最后 1 行 最后打第 1 行）
*/
public class Demo05{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j =i;j<=9;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.print("\n");
		}
	}
}