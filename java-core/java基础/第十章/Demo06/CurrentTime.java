/*1.5�����赱ǰʱ���� 2015 �� 5 �� 12 �� 10 �� 11 �� 00 �룬
��дһ�� CurrentTime�࣬��������Ϊ�� ʱ�䣬���� show()������ʾ��ʱ��*/
package Demo06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy��MM��dd�� HH��mm��ss��");// ���Է�����޸����ڸ�ʽ
	String time= dateFormat.format(now);
	public void show(){
		System.out.println(time);
	}
}
