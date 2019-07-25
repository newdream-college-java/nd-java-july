package chapter12_1;

public class Print {
	public void printTriangle(int row,String ch){
		for(int i = 0;i<row;i++){
			for (int j = 0; j <= i; j++) {
				if(j == i){
					System.out.println(ch);
				}
				else{
					System.out.print(ch);
				}
			}
		}
	}

}
