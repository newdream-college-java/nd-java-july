package 第十章;

public class Computer {
	String CPU;
	String 主板;
	String 显示器;
	String 硬盘;
	String 内存;

	public void showInfo() {
		System.out.println("CPU：" + CPU + "\t主板：" + 主板 + "\t显示器：" + 显示器 + "\t硬盘："
				+ 硬盘 + "\t内存：" + 内存);
	}
}
