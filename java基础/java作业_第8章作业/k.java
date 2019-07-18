public class K{
	public static void main(String [] args){
		int kg=3;
		int xx=1;
		int k=2;
		int x=5;
		for(int i=1;i<=4;i++){
		for(int j=1;j<=kg;j++){
		System.out.print(" ");
		}
		
		for(int j=1;j<=xx;j++){
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
		xx+=2;
		}
		for(int i=1;i<=3;i++){
		
		for(int j=k;j<3;j++){
		System.out.print(" ");
		}
		for(int j=x;j>=1;j--){
		if(i==3){
		System.out.print("*");
		}else if(j==1||j==x){
		System.out.print("*");
		}else {
		System.out.print(" ");
		}
		}
		System.out.println();
		
		x-=2;
		k--;
		}
}
}