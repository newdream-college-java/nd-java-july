
	/**
	 * 1.7、使用类的方式描述计算机:计算机的各部分可以作为类的属性，showInfo()方
		法用于显示 输出计算机相关配置信息，计算机的主要部件包括 CPU、主板、显示器、
		硬盘、内存等
	 */
public class Work6 {
	String CPU = "Intel i5标准电压版";
	String 主板 = "华硕";
	String 显示器 = "未知";
	String 硬盘 = "金士顿256GSSD";
	String 内存 = "16G";
	public void showInfo() {
		System.out.println("CPU：\t"+CPU+"\n主板：\t"+主板+"\n显示器：\t"+显示器+"\n硬盘：\t"+硬盘+"\n内存：\t"+内存);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work6 computer = new Work6();
		computer.showInfo();
	}

}
