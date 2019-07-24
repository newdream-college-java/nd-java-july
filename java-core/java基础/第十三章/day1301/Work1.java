package work;

/**
 * 1.1、需求说明 编写方法，实现对客户姓名的排序
 */

public class Work1 {

	public String[] sortName(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j+1])>0) {
					String temp = "";
					temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Work1 work1 = new Work1();
		String[] a = {"A阿里斯塔","B芭芭拉","C成龙","D带带大师兄","EGALI"};
		work1.sortName(a);
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);			
		}
	}

}
