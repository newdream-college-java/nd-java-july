public class I{
	public static void main(String [] args){
		int a=1;
		int b=4;
		for(int i =1;i<5;i++){
		for(int j =b;j<4;j++){
			System.out.print(" ");
		}
		for(int j =a;j<8;j++){
		System.out.print("*");
		}
		System.out.println();
		a=a+2;
		b--;
		}
}
}