/*、	输出 1900-2012 的闰年
*/


public class C{
	public static void main(String[] args) {
		for(int i=1900;i<=2012;i++)
			if(i%400==0||i%4==0&&i%400!=0){
				System.out.println("1900-2012 的闰年是："+i);
			}
	}
}