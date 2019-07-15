/*随机数：  
有符号整数：-(2^32-1)/2+1  ~  (2^32-1)/2   
无符号整数(正数)：0  ~  2^32-1
*/
import java.util.Random;
public class Demo07{
	public static void main(String[] args){
		Random rd = new Random();
		int a = rd.nextInt();
		System.out.println("a="+a);


		int i =1;
		while(i<=100){
			int b =rd.nextInt(311)+23;
			System.out.println(b);
			i++;
		}
		
	}
}