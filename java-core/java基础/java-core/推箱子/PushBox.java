package pushBox;

import java.util.Random;
import java.util.Scanner;

public class PushBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1.绘制地图🔳⊡🔳🔯
        String[][] map= new String[10][10];
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[0].length;j++) {
                map[i][j]=" 🔳 ";
            }
        }
        //2.确定目标位置
        int mx=(0+map.length)/2-1;
        int my=(0+map.length)/2-1;
        map[my][mx]=" ★ ";
        //3.确定箱子位置
        Random rd =new Random();
        int bx =  rd.nextInt(8)+1;//1~8
        int by = rd.nextInt(8)+1;
        //不能等于目标位置
        while(mx==bx&&my==by) {
            bx =  rd.nextInt(8)+1;//1~8
            by = rd.nextInt(8)+1;
        }
        map[by][bx]=" ❎ ";
        
        //4.确定人的位置
        int rx =  rd.nextInt(10);
        int ry = rd.nextInt(10);
        //人与箱子位置 以及目标位置不能重合
        while((rx==mx&&ry==my)||(rx==bx&&ry==by)) {
            rx =  rd.nextInt(10);
            ry = rd.nextInt(10);
        }
        map[ry][rx]=" ☺ ";
        
      //5.绘制地图
        drawMap(map);
        
        while(true) {
            System.out.print("移动(w-上;s-下;a-左;d-右)：");
            String answer = input.next();
            System.out.println(answer);
            switch(answer ){
                //情况一：向上走
            	case "w":
            		//人前面没有箱子或者目标
                	if(!(ry-1==by&&rx==bx)&&!(ry-1==my&&rx==mx)&&ry!=0) {
                    //1.清空人原来原值
                    map[ry][rx]=" 🔳 ";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    map[ry][rx]=" ☺ ";
                    //箱子在人前面
                	}else if(ry==by+1&&rx==bx){
                		map[ry][rx]=" 🔳 ";
                		ry=ry-1;
                		by=by-1;
                		map[ry][rx]=" ☺ ";
                		map[by][bx]="⊠";
                	}else {
                		System.out.println("前面是墙或者目标，请按其他指令哦！");
                	}
                	break;
            	case "s":
            		//人后面没有箱子或者目标
                	if(!(ry+1==by&&rx==bx)&&!(ry+1==my&&rx==mx)&&ry!=9) {
                    //1.清空人原来原值
                    map[ry][rx]=" 🔳 ";
                    //2.人y轴向下移动1
                    ry=ry+1;
                    map[ry][rx]=" ☺ ";
                    //箱子在人前面
                	}else if(ry==by-1&&rx==bx){
                		map[ry][rx]=" 🔳 ";
                		ry=ry+1;
                		by=by+1;
                		map[ry][rx]=" ☺ ";
                		map[by][bx]=" ❎ ";
                	}else {
                		System.out.println("前面是墙或者目标，请按其他指令哦！");
                	}
                	break;
                case "a":
                	//人左边没有箱子或者目标
                	if(!(rx-1==bx&&ry==by)&&!(rx-1==mx&&ry==my)&&rx!=0) {
                    //1.清空人原来原值
                    map[ry][rx]=" 🔳 ";
                    //2.人x轴向左移动1
                    rx=rx-1;
                    map[ry][rx]=" ☺ ";
                    //箱子在人前面
                	}else if(rx==bx+1&&ry==by){
                		map[ry][rx]=" 🔳 ";
                		rx=rx-1;
                		bx=bx-1;
                		map[ry][rx]=" ☺ ";
                		map[by][bx]=" ❎ ";
                	}else {
                		System.out.println("前面是墙或者目标，请按其他指令哦！");
                	}
                	break;
                case"d":
                	//人右边没有箱子或者目标
                	if(!(rx+1==bx&&ry==by)&&!(rx+1==mx&&ry==my)&&rx!=9) {
                    //1.清空人原来原值
                    map[ry][rx]=" 🔳 ";
                    //2.人x轴向左移动1
                    rx=rx+1;
                    map[ry][rx]=" ☺ ";
                    //箱子在人前面
                	}else if(rx==bx-1&&ry==by){
                		map[ry][rx]=" 🔳 ";
                		rx=rx+1;
                		bx=bx+1;
                		map[ry][rx]=" ☺ ";
                		map[by][bx]=" ❎ ";
                	}else {
                		System.out.println("前面是墙或者目标，请按其他指令哦！");
                	}
                	break;
                default :
                		System.out.println("输入指令错误，请重新输入！");
                		break;
                		
            }
            	//重绘制地图
            	
            	if(bx==mx&&by==my){
            		map[my][mx]=" 🔳 ";
            		map[by][bx]=" ♕ ";
            		drawMap(map);
            		System.out.println("恭喜你赢了！！！");
            		break;
            	}
            	drawMap(map);
            	if(bx==0||bx==9||by==0||by==9){
            		System.out.println("闯关失败！！！");
            		break;
            	}
        }
    }
    //绘制
    public static void drawMap(String[][] map) {
      //绘制
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[0].length;j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
