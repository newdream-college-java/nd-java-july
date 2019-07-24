package chapter_13_2;
/*1.5��дһ��ѧ���࣬������:���������䣬�Ա�,�����з�����*/
import java.util.*;
public class Student1 {
	String name;
	int age;
	String sex;
	//(1)���ҽ��ܵķ�����toString()
	public String toString(){
		return "������"+name+"\t���䣺"+age+"\t�Ա�"+sex;
	}
	//(2)�õ������ķ�����
	public String getName(){
		return "������"+name;
	}
	//(3)���������ķ���
	public void updateName(){
		System.out.print("�������µ�������");
		Scanner sc=new Scanner(System.in);
		String newName=sc.next();
		name=newName;
		System.out.println("������"+name+"\t���䣺"+age+"\t�Ա�"+sex);
	}
	//(4)�õ��Ա�ķ���
	public String getSex(){
		return "�Ա�"+sex;
	}
	//(5)�����Ա�ķ���
	public void updateSex(){
		System.out.print("�������µ��Ա�");
		Scanner sc=new Scanner(System.in);
		String newSex=sc.next();
		sex=newSex;
		System.out.println("������"+name+"\t���䣺"+age+"\t�Ա�"+sex);
	}
	//(6)����һ�����ε����飬���������������͵ķ���
	public int sum(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	//(7)����һ������ n,���� 1*2*3*...*n ���ķ��� (n ��Ҫ��̫��<10)
	public int jiechen(int n){
		int jiechen=1;
		for (int i = 1; i <=n; i++) {
			jiechen*=i;
		}
		return jiechen;
	}
	//(8)����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻� false
	public boolean panduan(int n){
		boolean a=true;
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0){
				a=false;
			}
		}
		return a;
	}
	//(9)������������,������С�������ķ���
	public int gongbeishu(int a,int b){
		int gongbeishu = 0;
		int max=a>b?a:b;
		for(int i=max;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				gongbeishu=i;
				break;
			}
		}
		return gongbeishu;
	}
	//(10)���������������������Լ���ķ���
	public int gongyueshu(int a,int b){
		int gongyueshu = 0;
		int min=a<b?a:b;
		for (int i=min;i>=1;i--) {
			if(a%i==0&&b%i==0){
				gongyueshu=i;
				break;
			}
		}
		return gongyueshu;
	}
	//(11)����һ������ n,���ص� n ���Ѳ��������� 1,1,2,3,5,... ��:n=4,�򷵻� 3
	public int feibo(int n){
		int feibo;
		int []feiboArr=new int[n];
		for (int i = 2; i <feiboArr.length; i++) {
			feiboArr[0]=1;
			feiboArr[1]=1;
			feiboArr[i]=feiboArr[i-1]+feiboArr[i-2];
		}
		feibo=feiboArr[n-1];
		return feibo;
	}
	//(12)��ս��:����һ�����飬������������ķ���
	public int[] paixu(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>(arr[j])){
					int tmp;
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		return arr;
	}
	//(13)��ս��:����һֻ��������һֻѼ�ķ��� Ѽ �Լ���Ѽ(��)
	public String huan(String old){
		if(old.equals("��")){
			old="Ѽ";
		}else{
			old="��";
		}
		return old;
	}
	public static void main(String[] args) {
		Student1 stu1=new Student1();
		stu1.name="������";
		stu1.age=19;
		stu1.sex="��";
		System.out.println(stu1.toString());//1
		System.out.println(stu1.getName());//2
		stu1.updateName();//3
		System.out.println(stu1.getSex());//4
		stu1.updateSex();//5
		int[] arr={1,3,5,3,1};
		System.out.println("����ĺ�Ϊ��"+stu1.sum(arr));//6
		System.out.println("5�Ľ׳�Ϊ��"+stu1.jiechen(5));//7
		System.out.println("17�������𣿣�true��ʾ�ǣ�false��ʾ�񣩣�"+stu1.panduan(17));//8
		System.out.println("6��8����С�������ǣ�"+stu1.gongbeishu(6, 8));//9
		System.out.println("9��6�����Լ���ǣ�"+stu1.gongyueshu(9, 6));//10
		System.out.println("��8��쳲��������ǣ�"+stu1.feibo(8));//11
		System.out.println("����������Ϊ��");//12
		stu1.paixu(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("������ˣ�"+stu1.huan("��"));//13
	}

}
