package 字符串;

import java.util.Random;
import java.util.Scanner;

public class PushBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1.绘制地图
        String[][] map= new String[10][10];
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[0].length;j++) {
                map[i][j]=" 口 ";
            }
        }
        //绘制地图
        //drawMap(map);
        //2.确定目标位置
        int mx=(0+map.length)/2-1;
        int my=(0+map.length)/2-1;
        map[my][mx]=" ⭐️ ";
        //3.确定箱子位置
        Random rd =new Random();
        int bx =  rd.nextInt(8)+1;//1~8
        int by = rd.nextInt(8)+1;
        //不能等于目标位置
        while(mx==bx&&my==by) {
            bx =  rd.nextInt(8)+1;//1~8
            by = rd.nextInt(8)+1;
        }
        map[by][bx]=" 🐘 ";
        
        //4.确定人的位置
        int rx =  rd.nextInt(10);
        int ry = rd.nextInt(10);
        //人与箱子位置 以及目标位置不能重合
        while((rx==mx&&ry==my)||(rx==bx&&ry==by)) {
            rx =  rd.nextInt(10);
            ry = rd.nextInt(10);
        }
        map[ry][rx]=" 囚 ";
        
      //5.绘制地图
        drawMap(map);
        
        while(true) {
            System.out.println("移动(w-上;s-下;a-左;d-右)");
            String answer = input.next();
            System.out.println(answer);
            if(answer.equalsIgnoreCase("w")) {
                //情况一：人前面没有箱子 并且人前面没有目标
                if(!(ry-1==by&&rx==bx)&&!(ry-1==my&&rx==mx)&&ry!=0) {
                    System.out.println("1111111===="+ry);
                    //1.清空人原来原值
                    map[ry][rx]=" 口 ";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    map[ry][rx]=" 囚 ";
                    System.out.println("22222==="+ry);
                }
            }else if(answer.equalsIgnoreCase("s")) {
                
            }else if(answer.equalsIgnoreCase("a")) {
                
            }else if(answer.equalsIgnoreCase("d")){
                
            }else {
               System.out.println("你有病！！！");
            }
            
          //重绘制地图
            drawMap(map);
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
