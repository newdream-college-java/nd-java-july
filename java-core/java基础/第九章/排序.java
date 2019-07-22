import java.util.*;
public class Demo03{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int temp=0;
		int count=input.nextInt();
		int []a=new int[count];
		for(int i=0;i<count;i++){
			a[i]=input.nextInt();
		}
		//√∞≈›≈≈–Ú
		/*
		for(int i=0;i<count-1;i++){
			for(int j=0;j<count-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		*/
		//—°‘Ò≈≈–Ú
		/*
		for(int i=0;i<count-1;i++){
			for(int j=i+1;j<count;j++){
				if(a[i]>a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		*/
		//≤Â»Î≈≈–Ú
		for(int i=1;i<count;i++){
			for(i>0;i--){
				if(a[i]<a[i-1]){
					temp=a[i-1];
					a[i-1]=a[i];
					a[i]=temp;
				}else{
					break;
				}
			}
			
		}
		// ‰≥ˆ
		for(int i=0;i<count;i++){
			System.out.print(a[i]+" ");
		}
	}	
}