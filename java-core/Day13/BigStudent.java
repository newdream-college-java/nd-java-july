import java.util.Arrays;

/**
 * 1.5、写一个学生类，有属性:姓名，年龄，性别,类中有方法：
 * @author 54975
 *
 */
public class BigStudent {
	String name;
	int age;
	String sex;
	/**
	 * (1)自我介绍的方法。toString()
	 */
	public String toString() {
		return "BigStudent [age=" + age + ", name=" + name + ", sex=" + sex
				+ "]";
	}
	/**
	 * (2)得到姓名的方法。
		(3)设置姓名的方法
		(4)得到性别的方法
		(5)设置性别的方法
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * (6)传入一个整形的数组，返回这个整形数组和的方法
	 */
	public int ArraySum(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	/**
	 * (7)传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
	 */
	public int product(int n){
		int pt=1;
		for (int i = 1; i <=n; i++) {
			pt*=i;
		}
		return pt;
	}
	/**
	 * (8)传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
	 */
	public boolean Prime(int n){
		boolean fase=false;
		for(int i=2;i<=n;i++){
			if(i<n){
				if(n%i==0&&i==n){
					break;
				}
			}else{
					fase=true;
			}
			
		}
		return fase;
	}
	/**
	 * (9)传入两个整数,返回最小公倍数的方法
	 */
	public int Common(int a,int b){
		int sum=0;
		if(a<b){
			sum=a;
			a=b;
			b=sum;
		}
		for(int i=2;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				sum=i;
				break;
			}
		}
		return sum;
	}
	/**
	 * (10)传入两个整数，返回最大公约数的方法
	 */
	public int setdivisor(int a,int b){
		int sum=0;
		if(a<b){
			sum=a;
			a=b;
			b=sum;
		}
		for(int i=2;i<a;i++){
			if(a%i==0&&b%i==0){
				sum=i;
			}
		}
		return sum;
	}
	/**
	 * (11)传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
	 */
	public int getqiebola(int n){
		int i=1;
		int sum=2;
		if(n==1||n==2){
			return 1;
		}
		for(;;){
			if(sum>n){
				break;
			}
			int q=sum;
			sum=sum+i;
			i=q;
			
		}
		return i;
	}
	/**
	 * (12)挑战题:传入一个数组，返回有序数组的方法
	 */
	public int[] shor(int[] a){
		/*
		 * 方法一
		 * Arrays.sort(a);
		return a;*/
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				
			
			if(a[i]>a[j]){
				int aa=a[i];
				a[i]=a[j];
				a[j]=aa;
			}
			}
		}
		return a;
	}
	/**
	 * (13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
	 */
	public String jiaoHuan(String name){
		String nam=name;
			if(name.equals("鸡")){
				nam="鸭";
			}else if(name.equals("鸭")){
				name="鸡";
			}
		return nam;
	}
	/**
	 * 测试
	 */
	public static void main(String[] args) {
		BigStudent s=new BigStudent();
		System.out.println(s.Prime(3));
		System.out.println(s.Common(3, 5));
		System.out.println(s.setdivisor(15, 9));
		System.out.println(s.getqiebola(4));
		int[] a={10,5,8,6,4,1,3,7};
		s.shor(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
