public class CurrentTime {
	/*
	 * 1.5�����赱ǰʱ���� 2015 �� 5 �� 12 �� 10 �� 11 �� 00 �룬��дһ�� CurrentTime �࣬��������Ϊ��
	 * ʱ�䣬���� show()������ʾ��ʱ�� 
	 * 1.6���Ľ���һ�⣬����ǰʱ���Ϊ 2015 �� 5 �� 12 �� 10 �� 11 �� 30 �롣��дһ��
	 * Demo �࣬�ı� CurrentTime �����趨��ʱ�䣬����ӡ���
	 */

	int year = 2015;
	int month = 5;
	int day = 12;
	int point = 10;
	int points = 11;
	int seconds = 30;

	public void show() {
		System.out.println(year + "��" + month + "��" + day + "��" + point + "ʱ"
				+ points + "��" + seconds + "��");
	}
}
