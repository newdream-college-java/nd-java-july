/*��ӡ����ͼ��*/
public class Work6{
	public static void main(String[] args){
		//��һ��
		for(int i =1; i<=4 ; i++){
			System.out.println("**************");
		}
		System.out.println();
		//�ڶ���
		for(int i =1; i<=4 ; i++){
			for(int j = 1 ; j<i ;j++){
				System.out.print(" ");
			}
			System.out.println("**************");
		}
		System.out.println();
		//������
		for(int i = 0; i<=3 ; i++){
			for(int j =4-i ; j>0 ; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//���ĸ���ʵ�ĵ�����
		for(int i =3; i>=0 ; i--){
			for(int k =3-i ; k>0 ; k-- ){
				System.out.print(" ");
			}
			for(int j = 2*i+1; j>0 ; j--){
				System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println();
		//����������ĵ�����
		int n = 4;
		for(int i =1; i<=n ; i++){
			for(int j = 1; j<i ; j++ ){
				System.out.print(" ");
			}
			for(int k = 1; k<=2*(n-i)+1 ; k++){
				if(i==1 || i==n){
					System.out .print("*");
				}else if(k==1 || k==2*(n-i)+1){
					System.out .print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}










