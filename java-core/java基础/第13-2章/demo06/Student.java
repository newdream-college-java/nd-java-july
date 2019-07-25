/*1.5、写一个学生类，有属性:姓名，年龄，性别,类中有方法：
(1)自我介绍的方法。toString()
(2)得到姓名的方法。
(3)设置姓名的方法
(4)得到性别的方法
(5)设置性别的方法
(6)传入一个整形的数组，返回这个整形数组和的方法
(7)传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
(8)传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
(9)传入两个整数,返回最小公倍数的方法
(10)传入两个整数，返回最大公约数的方法
(11)传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
(12)挑战题:传入一个数组，返回有序数组的方法
(13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)*/
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
	//得到姓名的方法。
	public String getName(){
		return name;
	}
	//设置姓名的方法
	public void setName(){
		name=input.next();
	}
	//得到性别的方法。
	public String getSex(){
		return sex;
	}
	//设置性别的方法
	public void setSex(){
		sex=input.next();
	}
	//传入一个整形的数组，返回这个整形数组和的方法
	public int add(int a[]){
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count +=a[i];
		}
		return count;
	}
	//传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
	public int jiechen(int n){
		int count=1;
			for(int i=1;i<=n;i++){
				count*=i;
			}
		return count;
	} 
	//传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
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
	//传入两个整数,返回最小公倍数的方法
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
	//传入两个整数，返回最大公约数的方法
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
	//传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
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
	//传入一个数组，返回有序数组的方法
	public int[] sort(int a[]){
		Arrays.sort(a);
		return a;
	}
	//传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
	public String jiya(String a){
		if(a.equals("鸡")){
			return "鸭";
		}else{
			return "鸡";
		}
	}
}
