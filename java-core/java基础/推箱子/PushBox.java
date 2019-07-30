package pushbox;

import java.util.Random;
import java.util.Scanner;

public class PushBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][]a=new String[9][9];
        //1、画地图
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]="口";
			}
		}
        //2、确定目标位置
        int mx=(0+a.length)/2;
        int my=(0+a.length)/2;
        a[my][mx]=" ★ ";
        //3、确定箱子位置
        Random rd =new Random();
        int bx =  rd.nextInt(7)+1;//1~8
        int by = rd.nextInt(7)+1;
        while(mx==bx&&my==by) {
            bx =  rd.nextInt(8)+1;//1~8
            by = rd.nextInt(8)+1;
        }
        a[by][bx]=" □";
        //4、确定人的位置
        int rx =  rd.nextInt(9);
        int ry = rd.nextInt(9);
        //人与箱子位置 以及目标位置不能重合
        while((rx==mx&&ry==my)||(rx==bx&&ry==by)) {
            rx =  rd.nextInt(9);
            ry = rd.nextInt(9);
        }
        a[ry][rx]=" ♀";
        drawMap(a);
        while(true) {
            System.out.println("移动(w-上;s-下;a-左;d-右)");
            String answer = input.next();
            System.out.println(answer);
            if(answer.equalsIgnoreCase("w")) {
                //情况一：人前面没有箱子 并且人前面没有目标
                if(!(ry-1==by&&rx==bx)&&!(ry-1==my&&rx==mx)&&ry!=0) {
                    System.out.println("1111111===="+ry);
                    //1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    a[ry][rx]=" ♀";
                    System.out.println("22222==="+ry);
                }else if(!(ry-1!=by&&rx==bx)&&!(ry-1!=my&&rx==mx)&&ry>1){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    by--;
                    a[by][bx]=" □";
                }else if(by!=my&&!(by-1==my)&&ry>1){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    by--;
                    a[by][bx]=" □";
                    
                }else if(by-1==my&&ry>1){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    a[ry][rx]=" ♀";
                    System.out.println("恭喜你赢了！！！");
                    break;
                }else{
                	System.out.println("你有病！！！");
                }
            }else if(answer.equalsIgnoreCase("s")) {
            	//情况一：人前面没有箱子 并且人前面没有目标
                if(!(ry+1==by&&rx==bx)&&!(ry+1==my&&rx==mx)&&ry!=8) {
                    System.out.println("1111111===="+ry);
                    //1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry+1;
                    a[ry][rx]=" ♀";
                    System.out.println("22222==="+ry);
                }else if(!(ry+1!=by&&rx==bx)&&!(ry+1!=my&&rx==mx)&&ry<7){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry+1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    by++;
                    a[by][bx]=" □";
                }else if(by!=my&&!(by+1==my)&&ry<7){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry+1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    by++;
                    a[by][bx]=" □";
                    
                }else if(by+1==my&&ry<7){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    ry=ry+1;
                    a[ry][rx]=" ♀";
                    System.out.println("恭喜你赢了！！！");
                    break;
                }
            }else if(answer.equalsIgnoreCase("a")) {
            	//情况一：人前面没有箱子 并且人前面没有目标
                if(!(rx-1==bx&&ry==by)&&!(rx-1==mx&&ry==my)&&rx!=0) {
                    System.out.println("1111111===="+rx);
                    //1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx-1;
                    a[ry][rx]=" ♀";
                    System.out.println("22222==="+rx);
                }else if(!(rx-1!=bx&&ry==by)&&!(rx-1!=mx&&ry==my)&&rx>1){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx-1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    bx--;
                    a[by][bx]=" □";
                }else if(bx!=my&&!(bx-1==my)&&rx>1){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx-1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    bx--;
                    a[by][bx]=" □";
                    
                }else if(bx-1==mx&&rx>1){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx-1;
                    a[ry][rx]=" ♀";
                    System.out.println("恭喜你赢了！！！");
                    break;
                }
            }else if(answer.equalsIgnoreCase("d")){
            	//情况一：人前面没有箱子 并且人前面没有目标
                if(!(rx+1==bx&&ry==by)&&!(rx+1==mx&&ry==my)&&rx!=8) {
                    System.out.println("1111111===="+rx);
                    //1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx+1;
                    a[ry][rx]=" ♀";
                    System.out.println("22222==="+rx);
                }else if(!(rx+1!=bx&&ry==by)&&!(rx+1!=mx&&ry==my)&&rx<7){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx+1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    bx++;
                    a[by][bx]=" □";
                }else if(bx!=my&&!(bx+1==mx)&&rx<7){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx+1;
                    a[ry][rx]=" ♀";
                    //3.箱子向上移动1
                    bx++;
                    a[by][bx]=" □";
                    
                }else if(bx+1==mx&&rx<7){
                	//1.清空人原来原值
                    a[ry][rx]="口";
                    //2.人y轴向上移动1
                    rx=rx+1;
                    a[ry][rx]=" ♀";
                    System.out.println("恭喜你赢了！！！");
                    break;
                }
            }else {
               System.out.println("你有病！！！");
            }
            
          //重绘制地图
            drawMap(a);
        }
    }
    public static void drawMap(String [][]a){
    	for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
    }
}
