/*
1.6�� ��ӡ����ͼ��
1.
**************
**************
**************
**************
2.
**************
 **************
  **************
    **************
3.
****
***
**
*
4.
*******
  *****
   ***
     *
5.
*******
   *   *
    * *
     *
6.
      *
   *   *
 *       *
*******
 *       *
   *   *
     *	
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("*********һά���ܴ�ӡϵͳ**********");
		System.out.print("��������1~6��ӡͼ�����䡰0���˳�����");
		int n = input.nextInt();
		switch(n){
			case 1:
				for(int i = 1;i<=4;i++){
					for(int j =1; j<=10;j++){
						if(j == 10){
							System.out.println("*");
						}
						else{
							System.out.print("*");
						}	
					}
				}
				break ;
			case 2:
				for(int i = 1;i <=4;i++){
					for(int k = 1;k<i;k++){
						System.out.print(" ");
					}
					for(int j = 1;j<=10;j++){
						if(j == 10){
							System.out.println("*");
						}
						else{
							System.out.print("*");
						}	
					}
				}
				break ;
			case 3:
				int a3 = 4;
				for(int i = 1;i<=4;i++){
					for(int j =1;j<=a3;j++){
						if(j == a3){
							System.out.println("*");
						}
						else{
							System.out.print("*");
						}
					}
					a3--;
				}
				break ;
			case 4:
				{int b4 = 7;
				for(int i = 1;i<=4;i++){
					//����ո�
					for(int k = 1;k<i;k++){
						System.out.print(" ");
					}
					//�ݼ������*��
					for(int j =1;j<=b4;j++){
						System.out.print("*");
					}
					System.out.println();
					b4-=2;
				}
				break ;}
			case 5:
				int b5 = 7;
				for(int i = 1;i<=4;i++){
					//����ո�
					for(int k = 1;k<i;k++){
						System.out.print(" ");
					}
					//�ݼ������*��
					for(int j =1;j<=b5;j++){	
						if(i == 4||i ==1){
							System.out.print("*");
						}
						else{
							if(j == 1||j == b5){
								System.out.print("*");
							}
							else{
								System.out.print(" ");
							}
						}
						}
					System.out.println();
					b5-=2;
				}
				break ;

			case 6:
		
				int b6 = 1;
				int kg6 = 3;
				for(int i = 1;i<=7;i++){
					//����ո�
					for(int k = 1;k<=kg6;k++){
						System.out.print(" ");
					}
					//�ݼ������*��
					for(int j =1;j<=b6;j++){	
						if(i == 4||i ==1||i == 7){
							System.out.print("*");
						}
					//��һ�������һ�������*���м��䡰 ��
						else{
							if(j == 1||j == b6){
								System.out.print("*");
							}
							else{
								System.out.print(" ");
							}
						}
					}
				System.out.println();
				//ǰ���пո�ݼ�����ӡ�����������ſո��������ӡ�ݼ�
				if(i<4){
					kg6--;
					b6+=2;
					continue ;
					}
					kg6++;
					b6-=2;
				}
				break ;
			default :
				break;
		}
	}
}