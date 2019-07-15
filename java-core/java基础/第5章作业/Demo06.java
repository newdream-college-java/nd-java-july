/*编程实现一个简单的人与电脑的猜拳游戏软件。*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		Random ran=new Random();
		System.out.print("你想玩几局：");
		int ju=input.nextInt();
		int b=0,i;	
		int d=1,count1=0,count2=0,count3=0;
		String n=null,c=null;
		do{	
			System.out.print("请出手(石头-0、剪刀-1、布-2)：");
			i=input.nextInt();
			if(i>2||i<0){
				System.out.println("输入错误请重新输入");
				System.out.print("请出手(石头-0、剪刀-1、布-2)：");
				i=input.nextInt();
			}
			b=ran.nextInt(3);
			n=leiXing(i);
			c=leiXing(b);
			/*定义出石头剪刀布
			if(i==0){
				n="石头";
			}else if(i==1){
				n="剪刀";
			}else{
				n="布";
			}

			if(b==0){
				c="石头";
			}else if(b==1){
				c="剪刀";
			}else{
				c="布";
			}*/
			//比较结果的判断
			if((i==0&&b==2)||(i==2&&b==0)){
				if(i>b){
					System.out.println("你出的是："+n+"\t"+"电脑出的是："+c+"\n"+"第"+d+"局：你赢");	
					count1++;	
				}else{
					System.out.println("你出的是："+n+"\t"+"电脑出的是："+c+"\n"+"第"+d+"局：电脑赢");
					count2++;
				}
			}else if(i==b){
				System.out.println("你出的是："+n+"\t"+"电脑出的是："+c+"\n"+"第"+d+"局：平局");
				count3++;
			}else{
				if(i<b){
					System.out.println("你出的是："+n+"\t"+"电脑出的是："+c+"\n"+"第"+d+"局：你赢");
					count1++;
				}else{
					System.out.println("你出的是："+n+"\t"+"电脑出的是："+c+"\n"+"第"+d+"局：电脑赢");
					count2++;
				}
			}
			d++;
		}while(i>=0&&i<=2&&d<=ju);
		System.out.println("游戏结束！！！！");
		if(count1>count2){
			System.out.println("你赢了"+count1+"次，"+"电脑赢了"+count2+"次，"+"平局"+count3+"次，"+"这把比赛你赢了！！！");
		}else if(count1==count2){
			System.out.println("你赢了"+count1+"次，"+"电脑赢了"+count2+"次，"+"平局"+count3+"次，"+"这把比赛平局！！！");	
		}else{
			System.out.println("你赢了"+count1+"次，"+"电脑赢了"+count2+"次，"+"平局"+count3+"次，"+"这把比赛电脑赢了！！！");
		}
		
	}
	public static String leiXing(int i){
		String n=null;
		if(i==0){
			n="石头";
		}else if(i==1){
			n="剪刀";
		}else{
			n="布";
		}
		return n;
	}
}