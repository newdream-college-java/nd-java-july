
/*PPT 上案例2-1
预习：
*****
*****
*****
*****

   *****
  *****
 *****
*****


   *
  ***
 *****
*******


   *
  * *
 *   *
*******


   *
  * *
 *   *
*******
 *   *
  * *
   *
*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i=1;i<6;i++){//i表示专卖店的编号
			//1.欢迎词
			System.out.println("欢迎进入"+i+"家专卖店");
			//2.循环是否离开/是否购买衣服(3次)
			for(int j=1;j<=3;j++){//衣服数量、询问的次数
				System.out.print("要离开吗？(y/n)");
				String hd = input.next();
				if(hd.equals("y")){
					
					break;//终止内层循环
				}
				System.out.println("买了一件衣服！！");
				count++;
			}
			System.out.println("离店结账！");
		}
		//3.统计购买衣服的数量
		System.out.println("一共购买了"+count+"件衣服！！");

	}
}