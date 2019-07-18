public class J{
	public static void main(String [] args){
		int kg=3;
		int xx=7;
		for(int i=1;i<5;i++){
		for(int j=kg;j<3;j++){
		System.out.print(" ");
		}
		for(int j=xx;j>=1;j--){
		if(i==1||i==4){
		System.out.print("*");
		}else if(j==1||j==xx){
		System.out.print("*");
		}else {
		System.out.print(" ");
		}
		}
		System.out.println();
		kg--;
		xx-=2;
}
}
}