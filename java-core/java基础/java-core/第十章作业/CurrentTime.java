/*1.5�����赱ǰʱ���� 2015 �� 5 �� 12 �� 10 �� 11 �� 00 �룬��дһ�� CurrentTime
�࣬��������Ϊ�� ʱ�䣬���� show()������ʾ��ʱ��*/
package chapter_10;

public class CurrentTime {
	String time;
	public void show(){
		System.out.println("��ǰʱ��Ϊ��"+time);
	}
	public static void main(String[] args) {
		CurrentTime a=new CurrentTime();
		a.time="2015 �� 5 �� 12 �� 10 �� 11 �� 00 ��";
		a.show();
	}

}
