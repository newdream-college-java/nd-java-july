/*玩游戏并晋级*/
import java.util.*;
public class Demo02{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int count = 0 ; //大于80分人数
		int i=1;
		for(;i<=5;i++){//i表示局数
			System.out.print("您正在进行第"+i+"句游戏，成绩为：");
			int cj =input.nextInt();
			if(cj>80){
				count++;
			}
			if(i<5){//不是第5句？
				System.out.print("进入下一局吗？(yes/no)");
				String hd = input.next();
				if(hd.equals("yes")){
					System.out.println("进入下一局！！");
				}else{
					break;//出局  终止循环
				}
			}
			

		}
		System.out.println("游戏结束");
		if(count>=5*80/100&&i==6){
			System.out.println("恭喜你晋升为一级");
		}else if(count>=5*60/100&&i==6){
			System.out.println("恭喜你晋升为二级");
		}else{
			System.out.println("对不起，未能晋级，继续加油！！");
		}

	}
}