import java.util.Arrays;

/**
 * 1.5��дһ��ѧ���࣬������:���������䣬�Ա�,�����з�����
 * @author 54975
 *
 */
public class BigStudent {
	String name;
	int age;
	String sex;
	/**
	 * (1)���ҽ��ܵķ�����toString()
	 */
	public String toString() {
		return "BigStudent [age=" + age + ", name=" + name + ", sex=" + sex
				+ "]";
	}
	/**
	 * (2)�õ������ķ�����
		(3)���������ķ���
		(4)�õ��Ա�ķ���
		(5)�����Ա�ķ���
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
	 * (6)����һ�����ε����飬���������������͵ķ���
	 */
	public int ArraySum(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	/**
	 * (7)����һ������ n,���� 1*2*3*...*n ���ķ��� (n ��Ҫ��̫��<10)
	 */
	public int product(int n){
		int pt=1;
		for (int i = 1; i <=n; i++) {
			pt*=i;
		}
		return pt;
	}
	/**
	 * (8)����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻� false
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
	 * (9)������������,������С�������ķ���
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
	 * (10)���������������������Լ���ķ���
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
	 * (11)����һ������ n,���ص� n ���Ѳ��������� 1,1,2,3,5,... ��:n=4,�򷵻� 3
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
	 * (12)��ս��:����һ�����飬������������ķ���
	 */
	public int[] shor(int[] a){
		/*
		 * ����һ
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
	 * (13)��ս��:����һֻ��������һֻѼ�ķ��� Ѽ �Լ���Ѽ(��)
	 */
	public String jiaoHuan(String name){
		String nam=name;
			if(name.equals("��")){
				nam="Ѽ";
			}else if(name.equals("Ѽ")){
				name="��";
			}
		return nam;
	}
	/**
	 * ����
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
