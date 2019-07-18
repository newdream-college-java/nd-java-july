/*
1.5、 打印 99 乘法表（先打最后 1 行 最后打第 1 行）
*/
public class Demo05{
	public static void main(String[] args){
		//i为第一个乘数，j为第二个乘数
		for(int i = 9;i>=1;i--){
			for(int j = 1;j<=i;j++){
				//当两个乘数相同时换行
				if(j!=i){
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				else{
					System.out.println(i+"*"+j+"="+i*j+"\t");
				}
			
			}
		}
	}
}