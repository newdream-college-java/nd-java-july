/*1.2�� ����һ������Ϊ��FlipFlop������ϷӦ�ó������� 1 ������ 100������ 3 �ı�����������ʡ�Flip�������� 5 �ı�����������ʡ�Flop������Ϊ 3 �ı���ҲΪ 5 �ı����������FlipFlop����������������ǰ���֡�*/
public class Work2{
	public static void main(String[] args){
		for(int i = 1;i<=100;i++){
			if(i%3==0 && i%5==0){
				System.out.println("\tFlipFlop");
			}else if(i%3==0){
				System.out.println("Flip");				
			}else if(i%5==0){
				System.out.println("\t\tFlop");
			}else
				System.out.println("\t"+i);
		}
	}
}