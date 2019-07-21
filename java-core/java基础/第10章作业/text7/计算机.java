package text7.praJob10;

import javax.print.DocFlavor.STRING;

public class 计算机 {
	String CPU="(英特尔)Intel(R) Core(TM) i5-7300HQ CPU @ 2.50GHz(2501 MHz)";
	String zb="华硕 FX503VD";
	String xsq="友达 AUO 32位真彩色 60Hz";
	String yp="130 GB (  173565801443 已使用时间: 4422小时)";
	String nc="8.00 GB (   2400 MHz)";
	
	
	public void show() {
		System.out.println("CPU："+CPU);
		System.out.println("主板："+zb);
		System.out.println("显示器："+xsq);
		System.out.println("硬盘："+yp);
		System.out.println("内存："+nc);
	}
}
