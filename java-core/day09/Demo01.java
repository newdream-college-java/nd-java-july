import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
	/*	String[] a={"Nike背包","Adides运动衫","李宁运动鞋","Kappa外套","360腰包"};
	for(int i=0;i<=a.length;i++){
		System.out.println(a[i]);
	}*/
		int[] a={5,3,11,6,66,89,90};
		getChaRu(a);
		getChaRuShuJu(a);
		for(int k=0;k<a.length;k++){
			
			System.out.println(a[k]);
		}
	}
	//插入排序
	public static void getChaRu(int[] a){
		for(int i=1;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
					int c=a[j];
					a[j]=a[j-1];
					a[j-1]=c;
				}else{
					break;
				}
			}
		}
	}
	//冒号排序
	public static void getshengxu(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int k=0;k<a.length-1;k++){
				if(a[k]>a[k+1]){
					int c=a[k];
					a[k]=a[k+1];
					a[k+1]=c;
				}
			}
		}
	}
	public static void getinput(int[] b,int c){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<c;i++){
			System.out.println("请输入一个数到数组");
			int oneinput=input.nextInt();
			b[i]=oneinput;
		}
	}
	public static void getChaRuShuJu(int[] a){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要插入的数据");
		int chaZhao=input.nextInt();
		int index=0;//下标
		boolean fals=false;
		for(int i=1;i<a.length;i++){
			if(chaZhao<a[i]){
				fals=true;
				index=i-1;
				break;
			}
		}
		//System.out.println(index);
		if(!fals){
			index=a.length-1;
		}
		for(int j=0;j<index;j++){
			a[j]=a[j+1];
		}
		a[index]=chaZhao;
	}
}