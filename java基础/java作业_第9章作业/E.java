import java.util.Scanner;
public class E{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double sum=0;
		double[] a= new double[10];
		double max = 0;
	
		int c=0;
		int l=0;
		int y=0;
		for(int i=0;i<a.length;i++){
		System.out.println("�������"+(i+1)+"��ͬѧ�ĳɼ���");
		a[i] = input.nextDouble();
		sum+=a[i];
		
		
		if(a[i]<60){
			c++;
		}else if(a[i]>=60&&a[i]<80){
			l++;
		}else {
			y++;
		}
		}
		double min = a[0];		
		for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max = a[i];
		}		
			if(a[i]<min){
			min = a[i];
			}
		}
		System.out.println("�ɼ���60�����µ�����Ϊ��"+c);
		System.out.println("�ɼ���60������80�����µ�����Ϊ��"+l);
		System.out.println("�ɼ���80�����ϵ�����Ϊ��"+y);
		System.out.println("ƽ���֣�"+sum/a.length+"���ֵ��"+max+"��Сֵ��"+min);
}
}