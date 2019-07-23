/**
 * 1.7、编写一个 Student 类，其中包括(姓名，学号，班级，性别，年龄，家庭住址)，
 *再增加一 个 sayHello()方法，输出学生信息
 * @author 54975
 *
 */
public class Student {
	String name="张三";
	int id=001;
	String banji="j3";
	String sex="男";
	int niamling=2;
	String address="五一新干线";
	public void sayHello(){
		System.out.println("姓名:"+name+"学号"+id+"班级"+banji+"性别"+sex+"年龄"+niamling+"家庭住址"+address);
	}
}
