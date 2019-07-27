package chapter12_2;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 1.5、写一个学生类，有属性:姓名，年龄，性别,类中有方法：
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
(13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
 * */
public class Student5 {

	Scanner input = new Scanner(System.in);
	String name;
	String age;
	String sex;
	
	@Override
	//toString()
	public String toString() {
		return "姓名：" + name + ", 年龄：" + age + ", 性别：" + sex + "。";
	}
	//得到姓名
	public String getName(){ 
		return name;
	}
	//设置姓名
	public void setName(){
		name = input.next();
	}
	//得到性别
	public String getSex(){
		return sex;
	}
	//设置性别
	public void setSex(){
		sex = input.next();
	}
	//传入一个整形数组，返回这个整形数组的和
	public int array(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}
	//传入一个整数，返回积
	public int product(int i){
		int prt = 1;
		for (int j = 1; j <= i; j++) {
			prt *=j;
		}
		return prt;
	}
	//判断是否为质数
	public boolean prime(int num){
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if(num%i == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	//求最小公倍数
	public int min(int num1,int num2){
		int min = 0;
		for (int i = (num1>num2?num1:num2); i <= num1*num2; i++) {
			if(i%num1 == 0&&i%num2 == 0){
				min = i;
				break;
			}
		}
		return min;
	}
	//求最大公约数
	public int max(int num1,int num2){
		int max = 0;
		for (int i = (num1<num2?num1:num2); i >0; i--) {
			if(num1%i == 0&&num2%i == 0){
				max = i;
				break;
			}
			
		}
		return max;
	}
	//)传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
	public int fb(int num){
		if(num == 1|| num == 2){
			return 1;
		}
		return fb(num - 1) + fb(num - 2);
	}
	//挑战题:传入一个数组，返回有序数组的方法
	public int[] sortArray(int[] arr){
		Arrays.sort(arr);
		return arr;
	}
	//(13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
	public String duck(String animal){
		String a = "动物";
		if(animal.equals("鸡")){
			a = "鸭";
		}
		if(animal.equals("鸭")){
			a = "鸡";
		}
		return a;
	}

	
}
