public class Demo03{
	public static void main(String[] args){
		/*1.5、 打印 99 乘法表（先打最后 1 行 最后打第 1 行）*/
		for(int i=9;i>0;i--){
			for(int j=1;j<=i;j++){
				
				System.out.print(i+"*"+j+"="+j*i+"\t");
			}
			System.out.println();
		}

	}
}