package chapter_10;
/*1.7��ʹ����ķ�ʽ���������:������ĸ����ֿ�����Ϊ������ԣ�showInfo()��
��������ʾ �����������������Ϣ�����������Ҫ�������� CPU�����塢��ʾ����
Ӳ�̡��ڴ��*/
public class Computer {
	String CPU;
	String zb;
	String xsq;
	String cp;
	String nc;
	public void show(){
		System.out.println("�������CPU�ǣ�"+CPU+"\n�����ǣ�"+zb+"\n��ʾ���ǣ�"+xsq+"\n�����ǣ�"+cp+"\n�ڴ��ǣ�"+nc);
	}
	public static void main(String[] args) {
		Computer computer1=new Computer();
		computer1.CPU="(Ӣ�ض�)Intel(R) Core(TM) i5-6300HQ CPU @ 2.30GHz(2304 MHz)";
		computer1.zb="���� Lenovo ideapad 700-15ISK";
		computer1.xsq="BOEHF 1920*1080(32λ���ɫ@60Hz)";
		computer1.cp="SAMSUNG MZVLV128HCGR-000L2 130GB";
		computer1.nc="4.00GB(2133MHz)";
		computer1.show();
	}

}
