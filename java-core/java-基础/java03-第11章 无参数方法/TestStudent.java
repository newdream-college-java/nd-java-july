//测试类----测试我们定义的类，方法，属性是否正确。
public class TestStudent{
	public static void main(String[] args){
		//1.通过类new出对象（根据模型得到个体）
		Student stu = new Student();
		//2.调用方法----本质就是执行方法体
		//2.1无返回(void)的方法的调用 对象名.方法名();
		//stu.input();
		//stu.input();

		//2.2有返回的方法的调用
		//方式一：对象名.方法名();  不能得到方法返回值
		//stu.rand();
		//方式二：定义一个变量接收返回值  数据类型 变量名=对象名.方法名();
		int re = stu.rand();
		System.out.println("随机数为："+re);
		//简写
		System.out.println("随机数为："+stu.rand());
	}
}