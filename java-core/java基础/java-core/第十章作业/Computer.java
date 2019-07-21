package chapter_10;
/*1.7、使用类的方式描述计算机:计算机的各部分可以作为类的属性，showInfo()方
法用于显示 输出计算机相关配置信息，计算机的主要部件包括 CPU、主板、显示器、
硬盘、内存等*/
public class Computer {
	String CPU;
	String zb;
	String xsq;
	String cp;
	String nc;
	public void show(){
		System.out.println("计算机的CPU是："+CPU+"\n主板是："+zb+"\n显示器是："+xsq+"\n磁盘是："+cp+"\n内存是："+nc);
	}
	public static void main(String[] args) {
		Computer computer1=new Computer();
		computer1.CPU="(英特尔)Intel(R) Core(TM) i5-6300HQ CPU @ 2.30GHz(2304 MHz)";
		computer1.zb="联想 Lenovo ideapad 700-15ISK";
		computer1.xsq="BOEHF 1920*1080(32位真彩色@60Hz)";
		computer1.cp="SAMSUNG MZVLV128HCGR-000L2 130GB";
		computer1.nc="4.00GB(2133MHz)";
		computer1.show();
	}

}
