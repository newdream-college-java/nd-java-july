package work;

/**
 * 1.1������˵�� ��д������ʵ�ֶԿͻ�����������
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
		String[] a = {"A����˹��","B�Ű���","C����","D������ʦ��","EGALI"};
		work1.sortName(a);
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);			
		}
	}

}
