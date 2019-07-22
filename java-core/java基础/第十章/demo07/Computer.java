package Jul22;
/*
 * 1.7、使用类的方式描述计算机:计算机的各部分可以作为类的属性，showInfo()方
法用于显示 输出计算机相关配置信息，计算机的主要部件包括 CPU、主板、显示器、
硬盘、内存等*/
public class Computer {
	String CPU;
	String 主板;
	String 显示器;
	String 硬盘;
	String 内存;
	
	public void showInfo(){
		System.out.println("CPU:"+CPU);
		System.out.println("主板:"+主板);
		System.out.println("显示器:"+显示器);
		System.out.println("硬盘:"+硬盘);
		System.out.println("内存:"+内存);
	}
	
	
}
