package chapter_11;
import java.util.*;
public class QuessMachine {
	public void initial(){
		Scanner input=new Scanner(System.in);
		String[] shangping={"Ħ�г�","��Ϊp30","���������"};
		double[] jiage={8888,9999,5};
		Random rd=new Random();
		int a=rd.nextInt(3)+1;
		int i=1;
		do{
			System.out.print("��²�"+shangping[a]+"�ļ۸�");
			double cai=input.nextDouble();
			if(cai==jiage[a]){
				System.out.println("��ϲ����"+shangping[a]);
				break;
			}else if(cai>jiage[a]){
				System.out.println("��С��");
			}else {
				System.out.println("�ٴ��");
			}
			i++;
			
		}while(i<=4);
		if(i==5){
			System.out.println("4����û�в¶ԣ��´�Ŭ���ɣ�");
		}
	}
	public static void main(String[] args) {
		QuessMachine a=new QuessMachine();
		a.initial();
	}
}
