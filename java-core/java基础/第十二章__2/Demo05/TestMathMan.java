package chapter12_2;

public class TestMathMan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathMan mm = new MathMan();
		int[] arr = {1,5,12,30,8};
		System.out.println("最大值"+mm.getMax(arr));
		System.out.println("和为："+mm.getSum(arr));
	}

}
