
public class Calculator {
	int one;
	int two;
	public void jia(int one,int two){
		one+=two;
		System.out.println("相加等于"+one);
	}
	public void jian(int one,int two){
		one-=two;
		System.out.println("相减等于"+one);
	}
	public void Cheng(int one,int two){
		int cheng;
		cheng=one*two;
		System.out.println("相乘等于"+cheng);
	}
	public void chu(int one,int two){
		one/=two;
		System.out.println("相除等于"+one);
	}
	
}
