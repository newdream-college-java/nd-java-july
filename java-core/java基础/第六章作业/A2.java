public class A2{
	public static void main(String[] args){
		System.out.println("**********FlipFlop**********");
		for(int i=1;i<=100;i++){
			if(i%3==0 && i%5==0){
				System.out.print("FlipFlop\t");
			}else if(i%5==0){
				System.out.print("Flop\t");
			}else if(i%3==0){
				System.out.print("Flip\t");
			}else {
				System.out.print(i+"\t");
			}
		}
	}
}