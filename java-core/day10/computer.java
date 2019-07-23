
public class computer {
	/*1.7、使用类的方式描述计算机:计算机的各部分可以作为类的属性，showInfo()方
	法用于显示 输出计算机相关配置信息，计算机的主要部件包括 CPU、主板、显示器、
	硬盘、内存等*/
	String cpu="Is-6300HQ";
	String 主板="indtel";
	String 显示器="华硕";
	String 硬盘="1TB";
	String 内存="8gb";
	public void showInfo(){
		System.out.print("cpu"+cpu+"主板"+主板+"显示器"+显示器+"硬盘"+硬盘+"内存"+内存);
	}
}
