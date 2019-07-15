public class A3{
	public static void main(String[] args ){
		int i = 100;
		while(i<=100){
			System.out.print(i+"\t");
			i-=5;
			if (i<5){
				System.exit(-1);
			}
		}
	}
}