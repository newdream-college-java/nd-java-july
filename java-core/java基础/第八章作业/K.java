
/*
           ��ӡ����ͼ��
	    *
	  *  *
	 *    *
	*******
	 *    *
	  *  *
	    *
*/


public class D{
	public static void main(String [ ] args){
		int kg=3,xx=1,hs=7;
		for(int i=1;i<=hs;i++){
			//�ȴ�kg���ո�
			for(int j=kg;j>0;j--){
				System.out.print(" ");
			}
			//�ٴ�xx��*
			for(int j=1;j<=xx;j++){
				if(i==4){
					System.out.print("*");
				}else{
					 if(j==1||j==xx){
						System.out.print("*");
					}else 
						System.out.print(" ");
				}
			}
			//ÿѭ��һ�ξͻ���
			System.out.println();
			//�Գ�
			if(i<4){
				kg--;
				xx+=2;
				continue;
			}
			kg++;
			xx-=2;
		}
	}
}