package work;
/**
 * 1.3、 编写程序，向整型数组的指定位置插入元素，输出插入前后数组的值 提示:方法 insertArray()定义如下: public void
 * insertArray(int [] arr,int index,int value){ } 
 * 1.3.2、本学期期末学员共参加了 3门课的考试，即 Java、C、SQL，编写方法计算 每位学员 3 门课的平均分 提示:定义 Student 类，添加 3 门课的成绩属性;定义
 * StudentBiz 类，定义 getAvg() public Students getAvg(Student stu){ }
 */

public class Work3 {
	public void intsertArray(int[] arr, int index,int value) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < index; i++) {
			arr[i] = arr[i+1];
		}
		arr[index] = value;
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args) {
		//int [] arr = {0,1,2,3,4,7,9};
		//Work3 work3 = new Work3();
		//work3.intsertArray(arr, 3, 5);
		Student stu = new Student();
		stu.C = 89.0;
		stu.Java = 66.5;
		stu.SQL = 59.9;
		
		Student stu2 = new Student();
		stu2.C = 99.0;
		stu2.Java = 98.0;
		stu2.SQL = 70.5;
		
		StudentBiz sBiz = new StudentBiz();
		System.out.println(sBiz.getAvg(stu));
		System.out.println(sBiz.getAvg(stu2));
	}

}
