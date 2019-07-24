package 第10章作业;

/*
	使用类的方式描述计算机:计算机的各部分可以作为类的属性，showInfo()方
	法用于显示 输出计算机相关配置信息，计算机的主要部件包括 CPU、主板、显示器、
	硬盘、内存等
*/

public class Computer {
	String CPU="i7";
	String 主板="华硕大板";
	String 显示器="4k高清";
	String 硬盘="1T";
	String 内存="16G";
	
	public void showTnfo(){
		System.out.println("CPU:"+CPU+"，主板："+主板+"，显示器："+显示器+"，硬盘："+硬盘+",内存:"+内存);
	}
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.showTnfo();
	}

}
