/*1.6、编程实现一个简单的人与电脑的猜拳游戏软件。*/
import java.util.Scanner;
import java.util.Random;
public class Work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int c=0;					//将String转换为int
		int ren=0,dn=0;				//人和电脑各自赢的局数
		System.out.print("请输入游戏局数：");
		int i = sc.nextInt();				//进行的有效局数
		int j = i;					//用来判断局数胜负
		while(i>0){
			System.out.print("你出的：");
			String a = sc.next();
			int b = rd.nextInt(3);
			if(b==0){
				System.out.println("电脑出的：布");
			}else if(b==1){
				System.out.println("电脑出的：剪刀");
			}else if(b==2){
				System.out.println("电脑出的：石头");
			}
			//将你输入的String转换为int
			switch(a){
				case "石头":
					c = 2;
					break;
				case "剪刀":
					 c = 1;
					break;
				case "布":
					c = 0;
					break;
				default:
					break;
			}
			//胜负判断
			if(c==b){
				System.out.println("平局"+"\n ");
			}else if(c==0&&b==2){
				System.out.println("你赢了！"+"\n ");
				ren++;
				--i;
			}else if(c==2&&b==0){
				System.out.println("你输了！"+"\n ");
				dn++;
				--i;
			}else if(c>b){
				System.out.println("你赢了！"+"\n ");
				ren++;
				--i;
			}else{
				System.out.println("你输了！"+"\n ");
				dn++;
				--i;
			}
			//
			if(ren==(j/2+1)||dn==(j/2+1)){
				if(ren==(j/2+1)){
					System.out.println(j+"局"+(j/2+1)+"胜制，最终赢家是你！！恭喜！！");
					System.exit(-1);
				}else
					System.out.println(j+"局"+(j/2+1)+"胜制，最终赢家电脑，裂开！！");
					System.exit(-1);
			}
		}
	}
}