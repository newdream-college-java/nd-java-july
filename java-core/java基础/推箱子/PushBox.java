package pushbox;

import java.util.Random;
import java.util.Scanner;

public class PushBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][]a=new String[9][9];
        //1������ͼ
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]="��";
			}
		}
        //2��ȷ��Ŀ��λ��
        int mx=(0+a.length)/2;
        int my=(0+a.length)/2;
        a[my][mx]=" �� ";
        //3��ȷ������λ��
        Random rd =new Random();
        int bx =  rd.nextInt(7)+1;//1~8
        int by = rd.nextInt(7)+1;
        while(mx==bx&&my==by) {
            bx =  rd.nextInt(8)+1;//1~8
            by = rd.nextInt(8)+1;
        }
        a[by][bx]=" ��";
        //4��ȷ���˵�λ��
        int rx =  rd.nextInt(9);
        int ry = rd.nextInt(9);
        //��������λ�� �Լ�Ŀ��λ�ò����غ�
        while((rx==mx&&ry==my)||(rx==bx&&ry==by)) {
            rx =  rd.nextInt(9);
            ry = rd.nextInt(9);
        }
        a[ry][rx]=" ��";
        drawMap(a);
        while(true) {
            System.out.println("�ƶ�(w-��;s-��;a-��;d-��)");
            String answer = input.next();
            System.out.println(answer);
            if(answer.equalsIgnoreCase("w")) {
                //���һ����ǰ��û������ ������ǰ��û��Ŀ��
                if(!(ry-1==by&&rx==bx)&&!(ry-1==my&&rx==mx)&&ry!=0) {
                    System.out.println("1111111===="+ry);
                    //1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry-1;
                    a[ry][rx]=" ��";
                    System.out.println("22222==="+ry);
                }else if(!(ry-1!=by&&rx==bx)&&!(ry-1!=my&&rx==mx)&&ry>1){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry-1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    by--;
                    a[by][bx]=" ��";
                }else if(by!=my&&!(by-1==my)&&ry>1){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry-1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    by--;
                    a[by][bx]=" ��";
                    
                }else if(by-1==my&&ry>1){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry-1;
                    a[ry][rx]=" ��";
                    System.out.println("��ϲ��Ӯ�ˣ�����");
                    break;
                }else{
                	System.out.println("���в�������");
                }
            }else if(answer.equalsIgnoreCase("s")) {
            	//���һ����ǰ��û������ ������ǰ��û��Ŀ��
                if(!(ry+1==by&&rx==bx)&&!(ry+1==my&&rx==mx)&&ry!=8) {
                    System.out.println("1111111===="+ry);
                    //1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry+1;
                    a[ry][rx]=" ��";
                    System.out.println("22222==="+ry);
                }else if(!(ry+1!=by&&rx==bx)&&!(ry+1!=my&&rx==mx)&&ry<7){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry+1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    by++;
                    a[by][bx]=" ��";
                }else if(by!=my&&!(by+1==my)&&ry<7){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry+1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    by++;
                    a[by][bx]=" ��";
                    
                }else if(by+1==my&&ry<7){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    ry=ry+1;
                    a[ry][rx]=" ��";
                    System.out.println("��ϲ��Ӯ�ˣ�����");
                    break;
                }
            }else if(answer.equalsIgnoreCase("a")) {
            	//���һ����ǰ��û������ ������ǰ��û��Ŀ��
                if(!(rx-1==bx&&ry==by)&&!(rx-1==mx&&ry==my)&&rx!=0) {
                    System.out.println("1111111===="+rx);
                    //1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx-1;
                    a[ry][rx]=" ��";
                    System.out.println("22222==="+rx);
                }else if(!(rx-1!=bx&&ry==by)&&!(rx-1!=mx&&ry==my)&&rx>1){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx-1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    bx--;
                    a[by][bx]=" ��";
                }else if(bx!=my&&!(bx-1==my)&&rx>1){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx-1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    bx--;
                    a[by][bx]=" ��";
                    
                }else if(bx-1==mx&&rx>1){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx-1;
                    a[ry][rx]=" ��";
                    System.out.println("��ϲ��Ӯ�ˣ�����");
                    break;
                }
            }else if(answer.equalsIgnoreCase("d")){
            	//���һ����ǰ��û������ ������ǰ��û��Ŀ��
                if(!(rx+1==bx&&ry==by)&&!(rx+1==mx&&ry==my)&&rx!=8) {
                    System.out.println("1111111===="+rx);
                    //1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx+1;
                    a[ry][rx]=" ��";
                    System.out.println("22222==="+rx);
                }else if(!(rx+1!=bx&&ry==by)&&!(rx+1!=mx&&ry==my)&&rx<7){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx+1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    bx++;
                    a[by][bx]=" ��";
                }else if(bx!=my&&!(bx+1==mx)&&rx<7){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx+1;
                    a[ry][rx]=" ��";
                    //3.���������ƶ�1
                    bx++;
                    a[by][bx]=" ��";
                    
                }else if(bx+1==mx&&rx<7){
                	//1.�����ԭ��ԭֵ
                    a[ry][rx]="��";
                    //2.��y�������ƶ�1
                    rx=rx+1;
                    a[ry][rx]=" ��";
                    System.out.println("��ϲ��Ӯ�ˣ�����");
                    break;
                }
            }else {
               System.out.println("���в�������");
            }
            
          //�ػ��Ƶ�ͼ
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
