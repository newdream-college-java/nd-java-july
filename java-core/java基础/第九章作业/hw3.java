import java.util.Arrays;
public class hw3{
	public static void main(String[]args){
		char a[]={'a','c','u','b','e','p','f','z'};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		char b;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]<a[j+1]){
					b=a[j];a[j]=a[j+1];a[j+1]=b;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++){
			System.out.print(a[i]+"\t");
		}
	}
}