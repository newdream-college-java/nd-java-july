/*1.3、输出 1900-2012 的闰年.*/
public class Demo03{
	public static void main(String[]args){
		System.out.print("1900-2012 的闰年为：");
		for(int i=1900;i<=2012;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.print(i+" ");
			}
		}
	}
}