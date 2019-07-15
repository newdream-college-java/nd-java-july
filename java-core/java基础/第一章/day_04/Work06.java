/*1.6、编程实现一个简单的人与电脑的猜拳游戏软件。*/
import java.util.*;
public class Work06{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	Random rd=new Random();
	System.out.print("请出拳（0-石头、1-剪刀、2-布  三局两胜制）:");
	int a=1;
	while(a<=3){
		int ren=sc.nextInt();
		if(ren!=0&&ren!=1&&ren!=2){
			System.out.print("你怕是个傻屌！请出拳（0-石头、1-剪刀、2-布  ）:");
			ren=sc.nextInt();
		}
		int com=rd.nextInt(3);
		switch(ren){
			case 0:
				if(com==0){
					System.out.println("你们出的都是石头，平局哦！");
				}else if(com==1){
					System.out.println("你出的是石头，电脑出的是剪刀，恭喜你获胜！");
				}else{
					System.out.println("你出的是石头，电脑出的是布，你输了哦！");
				}
			break;
			case 1:
				if(com==1){
					System.out.println("你们出的都是剪刀，平局哦！");
				}else if(com==0){
					System.out.println("你出的是剪刀，电脑出的是石头，你输了哦！");
				}else{
					System.out.println("你出的是剪刀，电脑出的是布，恭喜你获胜！");
				}
			break;
			default :
				if(com==2){
					System.out.println("你们出的都是布，平局哦！");
				}else if(com==1){
					System.out.println("你出的是布，电脑出的是剪刀，你输了哦！");
				}else{
					System.out.println("你出的是布，电脑出的是石头，恭喜你获胜！");
				}
			
		}
		a++;
	}	
	}
}