/*输入一个变量保存正方形的边长，计算此正方形的周长，及面积。 */

public  class  B{
	public static void main(String[] args) {
		int length=2;
		int perimeter,area;
		perimeter=length*4;
		area=length*length;
		System.out.println("周长\t面积");
		System.out.println(perimeter+"\t"+area);
	}
}