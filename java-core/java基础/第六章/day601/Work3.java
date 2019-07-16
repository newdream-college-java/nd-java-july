/*1.3、输出 1900-2012 的闰年.*/
public class Work3{
	public static void main(String[] args){
		for(int i =1900;i<=2012;i++){
			if(i%400==0){
				System.out.println(i+"是闰年");
			}else if(i%4==0 && i%100!=0){
				System.out.println(i+"是闰年");			
			}
		}
	}
}