public class Demo04{
	public static void main(String[] args){
		/*1.6、 打印如下图形
		1. **************
		    **************
		    **************
		    **************
		*/
		for(int i=1;i<=4;i++){
			for(int j=1;j<=14;j++){
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*2. **************
		        **************
		         **************
		          **************
		*/
		for(int i=1;i<=4;i++){
			for(int k=0;k<i;k++){
				if(k!=0){
				System.out.print(" ");
				}
			}
			
			for(int j=1;j<=14;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*3. ****
		       ***
   		       **
    		       *
		*/
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		4. *******
		    *****
		     ***
 		      *
		*/
		for(int i=1;i<=4;i++){
			for(int k=0;k<i;k++){
				if(k!=0){
					System.out.print(" ");
				}
				
			}
			for(int j=7;j>=i+i-1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		5. *******
		    *   *
             * *
              *
		*/
		for(int i=1;i<=4;i++){
			if(i!=1){

			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=7;k>=i+i-1;k--){
				if(k==i*2-1){
					System.out.print("*");
				}else if(k==7){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			}else{
				for(int j=1;j<=7;j++)
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
}