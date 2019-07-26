package 十三章_2;

public class TestNewStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewStudent test1 = new NewStudent();
		test1.name = "hh";
		test1.sno = 1;
		test1.age = 11;
		test1.sex = "男";
		test1.getName(1);
		test1.getName(2);
		System.out.println(test1.jiecheng(4));
		System.out.println(test1.judge(15));
		System.out.println(test1.returnMin(4, 6));
		System.out.println(test1.returnMax(3, 6));
		System.out.println(test1.returnFeibo(5));
		int arr[] = { 5, 4, 3, 8, 7, 2 };
		test1.returnarr(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
