package 推箱子;

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
        map[by][bx]="🐘 ";
        
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
                    //System.out.println("1111111===="+ry);
                    //1.清空人原来原值
                    map[ry][rx]=" 口 ";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    map[ry][rx]=" 囚 ";
                   
                    //System.out.println("22222==="+ry);
                }else if((ry-1==by&&rx==bx)&&!(ry-2==my&&rx==mx)&&by!=0){
                	 //System.out.println("1111111===="+ry);
                     //1.清空箱子原来原值
                     map[by][bx]=" 口 ";
                     //2.箱子y轴向上移动1
                     by=by-1; 
                     map[by][bx]=" 🐘 ";
                     //3.清空人原值
                     map[ry][rx]=" 口 ";
                     //4.人y轴向上移动1
                     ry=ry-1;
                     map[ry][rx]=" 囚 ";
                     drawMap(map);
                     if (by==0) {
 						System.out.println("你输了！游戏结束！！");
 						System.exit(-1);
 					}
                     //System.out.println("22222==="+ry);
                }else if (!(ry-1==by&&rx==bx)&&(ry-1==my&&rx==mx)&&ry!=0) {
					//1.清空人原来值
                	map[ry][rx]=" 口 ";
                	//2.人y轴向上移动2
                	ry=ry-2;
                    map[ry][rx]=" 囚 ";
				}else if ((ry-1==by&&rx==bx)&&(by-1==my&&rx==mx)&&ry!=0) {
					//1.人取代箱子使箱子消失游戏胜利
					map[ry][rx]=" 口 ";
					ry=ry-1;
                    map[ry][rx]=" 囚 ";
                    drawMap(map);
                    System.out.println("游戏胜利！");
                    System.exit(-1);
				}else if ((ry-2==by&&rx==bx)&&(ry-1==my&&rx==mx)&&ry!=0) {
					 //1.清空箱子原来原值
                    map[by][bx]=" 口 ";
                    //2.箱子y轴向上移动1
                    by=by-1; 
                    map[by][bx]=" 🐘 ";
                  //4.人y轴向上移动2
                    ry=ry-2;
                    map[ry][rx]=" 囚 ";
				}
                
                
            }else if(answer.equalsIgnoreCase("s")) {
            	if(!(ry+1==by&&rx==bx)&&!(ry+1==my&&rx==mx)&&ry!=9) {
                    //System.out.println("1111111===="+ry);
                    //1.清空人原来原值
                    map[ry][rx]=" 口 ";
                    //2.人y轴向下移动1
                    ry=ry+1;
                    map[ry][rx]=" 囚 ";
                    //System.out.println("22222==="+ry);
                }else if((ry+1==by&&rx==bx)&&!(ry+2==my&&rx==mx)&&ry!=9){
                	 //System.out.println("1111111===="+ry);
                     //1.清空箱子原来原值
                     map[by][bx]=" 口 ";
                     //2.箱子y轴向下移动1
                     by=by+1; 
                     map[by][bx]=" 🐘 ";
                     //3.清空人原值
                     map[ry][rx]=" 口 ";
                     //4.人y轴向下移动1
                     ry=ry+1;
                     map[ry][rx]=" 囚 ";
                     if (by==9) {
  						System.out.println("你输了！游戏结束！！");
  						System.exit(-1);
  					}
                     //System.out.println("22222==="+ry);
                }else if (!(ry+1==by&&rx==bx)&&(ry+1==my&&rx==mx)&&ry!=9) {
					//1.清空人原来值
                	map[ry][rx]=" 口 ";
                	//2.人y轴向下移动2
                	ry=ry+2;
                    map[ry][rx]=" 囚 ";
				}else if ((ry+1==by&&rx==bx)&&(by+1==my&&rx==mx)&&ry!=9) {
					//1.人取代箱子使箱子消失游戏胜利
					map[ry][rx]=" 口 ";
					ry=ry+1;
                    map[ry][rx]=" 囚 ";
                    drawMap(map);
                    System.out.println("游戏胜利！");
                    System.exit(-1);
				}else if ((ry+2==by&&rx==bx)&&(ry+1==my&&rx==mx)&&ry!=9) {
					 //1.清空箱子原来原值
                    map[by][bx]=" 口 ";
                    //2.箱子y轴向下移动1
                    by=by+1; 
                    map[by][bx]=" 🐘 ";
                  //4.人y轴向下移动2
                    ry=ry+2;
                    map[ry][rx]=" 囚 ";
				}
            }else if(answer.equalsIgnoreCase("a")) {
            	 if(!(ry==by&&rx-1==bx)&&!(ry==my&&rx-1==mx)&&rx!=0) {
                    // System.out.println("1111111===="+ry);
                     //1.清空人原来原值
                     map[ry][rx]=" 口 ";
                     //2.人y轴向左移动1
                     rx=rx-1;
                     map[ry][rx]=" 囚 ";
                     //System.out.println("22222==="+ry);
                 }else if((ry==by&&rx-1==bx)&&!(ry==my&&rx-2==mx)&&rx!=0){
                 	// System.out.println("1111111===="+ry);
                      //1.清空箱子原来原值
                      map[by][bx]=" 口 ";
                      //2.箱子y轴向左移动1
                      bx=bx-1; 
                      map[by][bx]=" 🐘 ";
                      //3.清空人原值
                      map[ry][rx]=" 口 ";
                      //4.人y轴向左移动1
                      rx=rx-1;
                      map[ry][rx]=" 囚 ";
                      if (bx==0) {
   						System.out.println("你输了！游戏结束！！");
   						System.exit(-1);
   					}
                      //System.out.println("22222==="+ry);
                 }else if (!(ry==by&&rx-1==bx)&&(ry==my&&rx-1==mx)&&rx!=0) {
 					//1.清空人原来值
                 	map[ry][rx]=" 口 ";
                 	//2.人y轴向左移动2
                 	rx=rx-2;
                     map[ry][rx]=" 囚 ";
 				}else if ((ry==by&&rx-1==bx)&&(ry==my&&bx-1==mx)&&rx!=0) {
 					//1.人取代箱子使箱子消失游戏胜利
 					map[ry][rx]=" 口 ";
 					rx=rx-1;
                     map[ry][rx]=" 囚 ";
                     drawMap(map);
                     System.out.println("游戏胜利！");
                     System.exit(-1);
 				}else if ((ry==by&&rx-2==bx)&&(ry==my&&rx-1==mx)&&rx!=0) {
 					 //1.清空箱子原来原值
                     map[by][bx]=" 口 ";
                     //2.箱子y轴向左移动1
                     bx=bx-1; 
                     map[by][bx]=" 🐘 ";
                   //4.人y轴向左移动2
                     rx=rx-2;
                     map[ry][rx]=" 囚 ";
 				}
            }else if(answer.equalsIgnoreCase("d")){
            	if(!(ry==by&&rx+1==bx)&&!(ry==my&&rx+1==mx)&&rx!=9) {
                    // System.out.println("1111111===="+ry);
                     //1.清空人原来原值
                     map[ry][rx]=" 口 ";
                     //2.人y轴向右移动1
                     rx=rx+1;
                     map[ry][rx]=" 囚 ";
                     //System.out.println("22222==="+ry);
                 }else if((ry==by&&rx+1==bx)&&!(ry==my&&rx+2==mx)&&rx!=9){
                 	// System.out.println("1111111===="+ry);
                      //1.清空箱子原来原值
                      map[by][bx]=" 口 ";
                      //2.箱子y轴向右移动1
                      bx=bx+1; 
                      map[by][bx]=" 🐘 ";
                      //3.清空人原值
                      map[ry][rx]=" 口 ";
                      //4.人y轴向右移动1
                      rx=rx+1;
                      map[ry][rx]=" 囚 ";
                      if (bx==9) {
   						System.out.println("你输了！游戏结束！！");
   						System.exit(-1);
   					}
                      //System.out.println("22222==="+ry);
                 }else if (!(ry==by&&rx+1==bx)&&(ry==my&&rx+1==mx)&&rx!=9) {
 					//1.清空人原来值
                 	map[ry][rx]=" 口 ";
                 	//2.人y轴向右移动2
                 	rx=rx+2;
                     map[ry][rx]=" 囚 ";
 				}else if ((ry==by&&rx+1==bx)&&(ry==my&&bx+1==mx)&&rx!=9) {
 					//1.人取代箱子使箱子消失游戏胜利
 					map[ry][rx]=" 口 ";
 					rx=rx+1;
                     map[ry][rx]=" 囚 ";
                     drawMap(map);
                     System.out.println("游戏胜利！");
                     System.exit(-1);
 				}else if ((ry==by&&rx+2==bx)&&(ry==my&&rx+1==mx)&&rx!=9) {
 					 //1.清空箱子原来原值
                     map[by][bx]=" 口 ";
                     //2.箱子y轴向右移动1
                     bx=bx+1; 
                     map[by][bx]=" 🐘 ";
                   //4.人y轴向右移动2
                     rx=rx+2;
                     map[ry][rx]=" 囚 ";
 				}
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
