import java.util.*;
public class Student{
	//属性列表
	//方法列表
	/*练习1，定义一个Person类，在类中定义一个rand方法，
	这个方法作用：随机产生一个1~10之间整数，然后将这个整数返回。
	33~77之间的随机数？int num = rd.nextInt(45)+33;
	199~233之间的随机数？int num = rd.nextInt(35)+199;
	int num = rd.nextInt(个数)+第1个数;
	*/
	public int rand(){
		Random rd = new Random();
		int number = rd.nextInt(10)+1;

		return number;
	}
	/*练习2：再在这个类中定义input方法，该方法扫描一个你的名字，
	将名字输出到控制台。*/
	public void input(){
		Scanner input =new Scanner(System.in);
		//提示
		System.out.println("请输入你的名字");
		String name = input.next();
		System.out.println("你输入的名字为:"+name);

	}


}