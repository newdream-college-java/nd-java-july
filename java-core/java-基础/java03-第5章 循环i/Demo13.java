/*
1.6、编程实现一个简单的人与电脑的猜拳游戏软件。
出拳：  0--石头   1--剪刀  2---布
人出拳：输入
电脑出拳：随机 (0~2)

我的思路：
	ren  		dn 			输赢（ren-dn）
	0			0			0（平局）
	0			1			-1（人赢）
	0			2
	1			0			
	1			1			0（平局）
	1			2			-1（人赢）	
	2			0			2（人赢）			
	2			1			
	2			2			0（平局）
*/
import java.util.*;
public class Demo13{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		Random rd =new Random();
		//1.人出拳
		//提示
		System.out.print("请出拳：(0:石头；1:剪刀；2:布)");
		int ren = input.nextInt();
		switch(ren){
			case 0:
				System.out.println("人出的是：石头");
				break;
			case 1:
				System.out.println("人出的是：剪刀");
				break;
			case 2:
				System.out.println("人出的是：布");
				break;
			default:
				System.out.println("你是个傻屌！！");
				break;
		}
		//2.电脑出拳---随机
		int dn = rd.nextInt(3);//0~2
		switch(dn){
			case 0:
				System.out.println("电脑出的是：石头");
				break;
			case 1:
				System.out.println("电脑出的是：剪刀");
				break;
			default:
				System.out.println("电脑出的是：布");
				break;
		}

		//3.判断输赢
		//3.1 人赢  
		if((ren-dn)==-1 || (ren-dn)==2){
			System.out.println("人赢");
		}else if((ren-dn)==0){//3.2 平局
			System.out.println("平局");
		}else{//3.3 电脑赢
			System.out.println("电脑赢");
		}
	}
}