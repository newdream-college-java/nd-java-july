/*1.5��дһ��ѧ���࣬������:���������䣬�Ա�,�����з�����
(1)���ҽ��ܵķ�����toString()
(2)�õ������ķ�����
(3)���������ķ���
(4)�õ��Ա�ķ���
(5)�����Ա�ķ���
(6)����һ�����ε����飬���������������͵ķ���
(7)����һ������ n,���� 1*2*3*...*n ���ķ��� (n ��Ҫ��̫��<10)
(8)����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻� false
(9)������������,������С�������ķ���
(10)���������������������Լ���ķ���
(11)����һ������ n,���ص� n ���Ѳ��������� 1,1,2,3,5,... ��:n=4,�򷵻� 3
(12)��ս��:����һ�����飬������������ķ���
(13)��ս��:����һֻ��������һֻѼ�ķ��� Ѽ �Լ���Ѽ(��)*/
package demo06;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	Scanner input=new Scanner(System.in);
	String name;
	int age;
	String sex;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	//�õ������ķ�����
	public String getName(){
		return name;
	}
	//���������ķ���
	public void setName(){
		name=input.next();
	}
	//�õ��Ա�ķ�����
	public String getSex(){
		return sex;
	}
	//�����Ա�ķ���
	public void setSex(){
		sex=input.next();
	}
	//����һ�����ε����飬���������������͵ķ���
	public int add(int a[]){
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count +=a[i];
		}
		return count;
	}
	//����һ������ n,���� 1*2*3*...*n ���ķ��� (n ��Ҫ��̫��<10)
	public int jiechen(int n){
		int count=1;
			for(int i=1;i<=n;i++){
				count*=i;
			}
		return count;
	} 
	//����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻� false
	public boolean testIsPrime3(int n){
	       if (n <= 3) {
	            return n > 1;
	        }
	        
	       for(int i=2;i<n;i++){
	           if(n%i == 0)
	               return false;
	       }
	       return true;
	   }
	//������������,������С�������ķ���
	public int minGbs(int a,int b){
		int m=0;
		int max=a>b?a:b;
		for(int i=max;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				m=i;
				break;
			}
		}
		return m;
	}
	//���������������������Լ���ķ���
	public int maxGys(int a,int b){
		int m=0;
		int min=a<b?a:b;
		for(int i=min;i>=1;i--){
			if(a%i==0&&b%i==0){
				m=i;
				break;
			}
		}
		return m;
	}
	//����һ������ n,���ص� n ���Ѳ��������� 1,1,2,3,5,... ��:n=4,�򷵻� 3
	public int fblq(int n){
		int a=0;
		int b=1;
		int c=1;
		if(n==1||n==2){
			return 1;
		}
		for (int i = 3; i <= n; i++) {
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}
	//����һ�����飬������������ķ���
	public int[] sort(int a[]){
		Arrays.sort(a);
		return a;
	}
	//����һֻ��������һֻѼ�ķ��� Ѽ �Լ���Ѽ(��)
	public String jiya(String a){
		if(a.equals("��")){
			return "Ѽ";
		}else{
			return "��";
		}
	}
}
