
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
		computer1.CPU="Intel(R) Core(TM) i7-4510U CPU @ 2.00GHz (4 CPUs), ~2.6GHz";
		computer1.zb="ASUSTeK COMPUTER INC.";
		computer1.xsq="1366 x 768 (32 bit) (60Hz)";
		computer1.cp="SAMSUNG MZVLV128HCGR-000L2 130GB";
		computer1.nc="4.00GB";
		computer1.show();
	}

}