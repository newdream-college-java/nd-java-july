/*1.3、输出 1900-2012 的闰年.*/
public class Work03{
	public static void main(String [] args){
		for(int i =1900;i<=2012;i++){
			if(i%400!=0&&!(i%4==0&&i%100!=0)){
				continue;
			}
			System.out.println("1900-2012 的闰年:"+i);
		}
	}
}