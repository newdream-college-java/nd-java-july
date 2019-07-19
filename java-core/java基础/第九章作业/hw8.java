import java.util.Scanner;
public class hw8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您需要保存的歌曲数目");
		int num=sc.nextInt();
		String a[]=new String[num];
		for(int i=1;i<=num;i++){
			System.out.print("请输入第"+i+"首歌曲名:");
			String name=sc.next();
			a[i-1]=name;
		}
		int k=1;
		String b;
		for(int i=0;i<=num-1;i++){
			for(int j=k;j<=num-1;j++){
				if(a[i].compareTo(a[j])>0){
					b=a[i];a[i]=a[j];a[j]=b;
				}
			}
			k++;
		}			
		for(int i=0;i<=num-1;i++){
			System.out.print(a[i]+"\t");
		}
	}
}
			