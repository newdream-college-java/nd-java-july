/*
5. *******
      *   *
       * *
        *
*/
public class Work7 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
 			for(int j=1;j<=n-i;j++) { 			//����ÿ����ǰ��Ŀո�
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k  ++) { 		//�����ܵ��ǺźͿո�
				if(i==1||i==n) { 
   					System.out.print("*");
  				}else if(k==1||k==2*i-1) { 		//���Ƶڶ��е�n-1�е��Ǻŵ����
   					System.out.print("*");
   				}else { 				//���Ƶڶ��е�n-1�еĿո�����
   					System.out.print(" ");
  					}	
  			}
  			System.out.println(); 			//ÿ�������Ϻ���л��в���
		}
 	}
}