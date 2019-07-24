package chapter_13_2;
/*1.5、写一个学生类，有属性:姓名，年龄，性别,类中有方法：*/
import java.util.*;
public class Student1 {
	String name;
	int age;
	String sex;
	//(1)自我介绍的方法。toString()
	public String toString(){
		return "姓名："+name+"\t年龄："+age+"\t性别："+sex;
	}
	//(2)得到姓名的方法。
	public String getName(){
		return "姓名："+name;
	}
	//(3)设置姓名的方法
	public void updateName(){
		System.out.print("请输入新的姓名：");
		Scanner sc=new Scanner(System.in);
		String newName=sc.next();
		name=newName;
		System.out.println("姓名："+name+"\t年龄："+age+"\t性别："+sex);
	}
	//(4)得到性别的方法
	public String getSex(){
		return "性别："+sex;
	}
	//(5)设置性别的方法
	public void updateSex(){
		System.out.print("请输入新的性别：");
		Scanner sc=new Scanner(System.in);
		String newSex=sc.next();
		sex=newSex;
		System.out.println("姓名："+name+"\t年龄："+age+"\t性别："+sex);
	}
	//(6)传入一个整形的数组，返回这个整形数组和的方法
	public int sum(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	//(7)传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
	public int jiechen(int n){
		int jiechen=1;
		for (int i = 1; i <=n; i++) {
			jiechen*=i;
		}
		return jiechen;
	}
	//(8)传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
	public boolean panduan(int n){
		boolean a=true;
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0){
				a=false;
			}
		}
		return a;
	}
	//(9)传入两个整数,返回最小公倍数的方法
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
	//(10)传入两个整数，返回最大公约数的方法
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
	//(11)传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
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
	//(12)挑战题:传入一个数组，返回有序数组的方法
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
	//(13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
	public String huan(String old){
		if(old.equals("鸡")){
			old="鸭";
		}else{
			old="鸡";
		}
		return old;
	}
	public static void main(String[] args) {
		Student1 stu1=new Student1();
		stu1.name="陈良财";
		stu1.age=19;
		stu1.sex="男";
		System.out.println(stu1.toString());//1
		System.out.println(stu1.getName());//2
		stu1.updateName();//3
		System.out.println(stu1.getSex());//4
		stu1.updateSex();//5
		int[] arr={1,3,5,3,1};
		System.out.println("数组的和为："+stu1.sum(arr));//6
		System.out.println("5的阶乘为："+stu1.jiechen(5));//7
		System.out.println("17是质数吗？（true表示是，false表示否）："+stu1.panduan(17));//8
		System.out.println("6和8的最小公倍数是："+stu1.gongbeishu(6, 8));//9
		System.out.println("9和6的最大公约数是："+stu1.gongyueshu(9, 6));//10
		System.out.println("第8个斐波那契数是："+stu1.feibo(8));//11
		System.out.println("排序后的数组为：");//12
		stu1.paixu(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("鸡变成了："+stu1.huan("鸡"));//13
	}

}
