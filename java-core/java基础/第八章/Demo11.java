
public class Demo11{
	public static void main (String [] args) {
		int xx =1;
		int kg =3;
		for(int i =1;i<=7;i++){
			//�ȴ�ո�
			for(int j =1;j<=kg;j++){
				System.out.print(" ");
			}
			// ���м䣨��βһ��*�м��ǿո�
			for(int j=1;j<=xx;j++){
				if(i==1||i==4||i==7){
					System.out.print("*");
				}else{
					if(j==1||j==xx){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			if(i<4){
				kg--;
				xx+=2;
			}else{
				kg++;
				xx-=2;
			}
		}
	}
}