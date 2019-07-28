package pushbox;

import java.util.Random;
import java.util.Scanner;

public class PushBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1.绘制地图
        String[][] map= new String[10][10];
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[0].length;j++) {
                map[i][j]=" 📖 ";
            }
        }
        //绘制地图
        //drawMap(map);
        //2.确定目标位置
        Random rd =new Random();
        int mx=rd.nextInt(10);
        int my=rd.nextInt(10);
        map[my][mx]=" 🕳 ";
        //3.确定箱子位置
      
        int bx =  rd.nextInt(8)+1;//1~8
        int by = rd.nextInt(8)+1;
        //不能等于目标位置
        while(mx==bx&&my==by) {
            bx =  rd.nextInt(8)+1;//1~8
            by = rd.nextInt(8)+1;
        }
        map[by][bx]=" 🗳 ";
        
        //4.确定人的位置
        int rx =  rd.nextInt(10);
        int ry = rd.nextInt(10);
        //人与箱子位置 以及目标位置不能重合
        while((rx==mx&&ry==my)||(rx==bx&&ry==by)) {
            rx =  rd.nextInt(10);
            ry = rd.nextInt(10);
        }
        map[ry][rx]=" 🏃‍ ";
        
      //5.绘制地图
        drawMap(map);
        
        while(true) {
            System.out.println("移动(w-上;s-下;a-左;d-右)");
            String answer = input.next();
            System.out.println(answer);
            if(answer.equalsIgnoreCase("w")) {
                //情况一：人前面没有箱子 并且人前面没有目标并且人前面不是墙
                if(!(ry-1==by&&rx==bx)&&!(ry-1==my&&rx==mx)&&ry!=0) {
                    //1.清空人原来原值
                    map[ry][rx]=" 📖 ";
                    //2.人y轴向上移动1
                    ry=ry-1;
                    map[ry][rx]=" 🏃 ";
                }
                //情况二：人前面有箱子
                else if(ry-1 == by&&rx == bx){
                	//箱子后没有目标且箱子后不是墙
                	if(ry-2 != my&&ry-1 != 0){
                		by = by - 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		ry = ry - 1;
                		map[ry][rx] = " 🏃 ";
                	}
                	//箱子后是墙
                	else if(ry-1 == 0){
                		System.out.println("亲，不能再上移了哦！");
                	}
                	//箱子后是目标
                	else if(ry - 2 == my&&rx == mx){
                		by = by - 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		ry = ry - 1;
                		map[ry][rx] = " 🏃 ";
                		System.out.println("恭喜你，获得了胜利");
                	}
                	//箱子后是目标(不在同一线上)
               		else if(rx - 2 == mx&&ry != my){
               			by = by - 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		ry = ry - 1;
                		map[ry][rx] = " 🏃 ";
               		}

                }
             //情况三：人前面是目标
              else if(ry-1 == my&&rx == mx){
            	 System.out.println("亲，不能再上移了哦！");
             }
             //情况四：人前面是墙
              else if(ry == 0){
            	 System.out.println("亲，不能再上移了哦！");
             }
             
            }else if(answer.equalsIgnoreCase("a")) {
            	//情况一：人前面没有箱子 并且人前面没有目标并且人前面不是墙
            	 if(!(rx-1==bx&&ry==by)&&!(rx-1==mx&&ry==my)&&rx!=0) {
                    //1.清空人原来原值
                    map[ry][rx]=" 📖 ";
                    //2.人y轴向上移动1
                    rx=rx-1;
                    map[ry][rx]=" 🏃 ";
                }
                //情况二：人前面有箱子
            	else if(rx-1 == bx&&ry == by){
                	//箱子后没有目标且箱子后不是墙
            		if(rx-2 != mx&&rx-1 != 0){
            			bx = bx - 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		rx = rx - 1;
                		map[ry][rx] = " 🏃 ";
                		
                	}
                	//箱子后是墙
            		else if(rx-1 == 0){
                		System.out.println("亲，不能再左移了哦！");
                	}
                	//箱子后是目标
            		else if(rx - 2 == mx&&ry == my){
            			bx = bx - 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		rx = rx - 1;
                		map[ry][rx] = " 🏃 ";
                		System.out.println("恭喜你，获得了胜利");
                	}
            		//箱子后是目标(不在同一线上)
               		else if(rx - 2 == mx&&ry != my){
               			bx = bx - 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		rx = rx - 1;
                		map[ry][rx] = " 🏃 ";
               		}
                }
             //情况三：人前面是目标
            	else if(rx-1 == mx&&ry == my){
            	 System.out.println("亲，不能再左移了哦！");
             }
             //情况四：人前面是墙
            	else if(rx == 0){
            	 System.out.println("亲，不能再左移了哦！");
             }
                
            }else if(answer.equalsIgnoreCase("s")) {
            	 //情况一：人前面没有箱子 并且人前面没有目标并且人前面不是墙
                if(!(ry+1==by&&rx==bx)&&!(ry+1==my&&rx==mx)&&ry!=9) {
                    //1.清空人原来原值
                    map[ry][rx]=" 📖 ";
                    //2.人y轴向上移动1
                    ry=ry+1;
                    map[ry][rx]=" 🏃 ";
                }
                //情况二：人前面有箱子
                else if(ry+1 == by&&rx == bx){
                	//箱子后没有目标且箱子后不是墙
                	if(ry+2 != my&&ry+1 != 0){
                		by = by + 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		ry = ry + 1;
                		map[ry][rx] = " 🏃 ";
                	}
                	//箱子后是墙
                	else if(ry+1 == 9){
                		System.out.println("亲，不能再下移了哦！");
                	}
                	//箱子后是目标
                	else if(ry + 2 == my&&rx == mx){
                		by = by + 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		ry = ry + 1;
                		map[ry][rx] = " 🏃 ";
                		System.out.println("恭喜你，获得了胜利");
                	}
                	//箱子后是目标(不在同一线上)
               		else if(rx + 2 == mx&&ry != my){
               			by = by + 1;
                		map[by][bx] = " 🗳 ";
                		map[ry][rx] = " 📖 ";
                		ry = ry + 1;
                		map[ry][rx] = " 🏃 ";
               		}
                }
             //情况三：人前面是目标
              else if(ry+1 == my&&rx == mx){
            	 System.out.println("亲，不能再下移了哦！");
             }
             //情况四：人前面是墙
              else if(ry == 9){
            	 System.out.println("亲，不能再下移了哦！");
             }
             
                
            }else if(answer.equalsIgnoreCase("d")){
            	//情况一：人前面没有箱子 并且人前面没有目标并且人前面不是墙
           	 if(!(rx+1==bx&&ry==by)&&!(rx+1==mx&&ry==my)&&rx!=9) {
                   //1.清空人原来原值
                   map[ry][rx]=" 📖 ";
                   //2.人y轴向上移动1
                   rx=rx+1;
                   map[ry][rx]=" 🏃 ";
               }
               //情况二：人前面有箱子
           	else if(rx+1 == bx&&ry == by){
               	//箱子后没有目标且箱子后不是墙
           		if(rx+2 != mx&&rx+1 != 9){
           			bx = bx + 1;
            		map[by][bx] = " 🗳 ";
            		map[ry][rx] = " 📖 ";
            		rx = rx + 1;
            		map[ry][rx] = " 🏃 ";
               	}
               	//箱子后是墙
           		else if(rx-1 == 9){
               		System.out.println("亲，不能再右移了哦！");
               	}
               	//箱子后是目标(在同一线上)
           		else if(rx + 2 == mx&&ry == my){
           			bx = bx + 1;
            		map[by][bx] = " 🗳 ";
            		map[ry][rx] = " 📖 ";
            		rx = rx + 1;
            		map[ry][rx] = " 🏃 ";
               		System.out.println("恭喜你，获得了胜利");
               	}
           		//箱子后是目标(不在同一线上)
           		else if(rx + 2 == mx&&ry != my){
           			bx = bx + 1;
            		map[by][bx] = " 🗳 ";
            		map[ry][rx] = " 📖 ";
            		rx = rx + 1;
            		map[ry][rx] = " 🏃 ";
           		}
               }
            //情况三：人前面是目标
           	else if(rx+1 == mx&&ry == my){
           	 System.out.println("亲，不能再右移了哦！");
            }
            //情况四：人前面是墙
           	else if(rx == 9){
           	 System.out.println("亲，不能再右移了哦！");
            }
               
                
            }else {
               System.out.println("亲，看清操作说明呢！");
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
