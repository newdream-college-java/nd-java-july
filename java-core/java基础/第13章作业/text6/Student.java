package job02.text6;

import java.util.Scanner;

public class Student {
	static String name;
	int age;
	static String sex;
	Scanner scanner=new Scanner(System.in);
	/**
	 *1.���ҽ���
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return "������"+name+"\t���䣺"+age+"\t�Ա�"+sex;
	}
	
	/**
	 *2.�õ����� 
	 */
	public String getName() {
		return name;
	}
	
	/** 
	 *3.��������
	 */
	public String settingName() {
		System.out.print("�������������");
		name=scanner.next();
		return name;
	}
	
	/** 
	 *4.�õ��Ա� 
	 */
	public String getSex() {
		return sex;
	}
	
	/** 
	 *5.�����Ա� 
	 */
	public String settingSex() {
		System.out.print("��������Ա�");
		sex=scanner.next();
		return sex;
	}
	
	/** 
	 *6.����һ�����͵����飬���������������͵ķ��� 
	 */
	public int sumArr(int[]arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	/** 
	 *7.����һ������ n,���� 1*2*3*...*n ���ķ���
	 */
	public int numJi(int n) {
		int a = 0;
		if(n==1) {
			a=1;
		}else if (n > 1) {
			a = n * numJi(n - 1);
		}else {
			System.out.println("�������");
		}
		return a;
	}
	
	/** 
	 *8.����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻� false
	 */
	public boolean isZhi(int n) {
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
			}
		}
		return flag;
	}
	
	/** 
	 *9.������������,������С�������ķ���
	 */
	public int minGbs(int a,int b) {
		int gbs=0;
		int max=a>b?a:b;
		for(int i=max;i<=a*b;i++) {
			if(i%a==0&&i%b==0) {
				gbs=i;
				break;
			}
		}
		return gbs;
	}
	
	/** 
	 *10.������������,�������Լ���ķ���
	 */
	public int maxGys(int a,int b) {
		int gys=0;
		int min=a<b?a:b;
		for(int i=min;i>0;i--) {
			if(a%i==0&&b%i==0) {
				gys=i;
				break;
			}
		}
		return gys;
	}
	
	/** 
	 *11.����һ������ n,���ص� n ���Ѳ��������� 1,1,2,3,5,... ��:n=4,�򷵻� 3
	 */
	public int fib(int n) {
		int sum=0;
		if(n==1||n==2) {
			sum=1;
		}else {
			sum=fib(n-1)+fib(n-2);
		}
		return sum;
	}
	
	/** 
	 *12.����һ�����飬������������ķ���
	 */
	public String[] sortArr(String[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int re=arr[j].compareTo(arr[j+1]);
				if(re>0) {
					String tempString=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tempString;
					continue;
				}
			}
		}
		return arr;
	}
	
	/** 
	 *13.����һֻ��������һֻѼ�ķ���
	 */
	public String getAnimal(String ani) {
		if(ani.equals("��")) {
			ani= "Ѽ";
		}else if(ani.equals("Ѽ")) {
			ani="��";
		}
		else {
			ani="�������ֻ�����뼦����Ѽ��";
		}
		return ani;
	}
}
