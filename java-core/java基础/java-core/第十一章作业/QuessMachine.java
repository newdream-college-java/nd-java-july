package chapter_11;
import java.util.*;
public class QuessMachine {
	public void initial(){
		Scanner input=new Scanner(System.in);
		String[] shangping={"摩托车","华为p30","不锈钢脸盆"};
		double[] jiage={8888,9999,5};
		Random rd=new Random();
		int a=rd.nextInt(3)+1;
		int i=1;
		do{
			System.out.print("请猜测"+shangping[a]+"的价格：");
			double cai=input.nextDouble();
			if(cai==jiage[a]){
				System.out.println("恭喜你获得"+shangping[a]);
				break;
			}else if(cai>jiage[a]){
				System.out.println("再小点");
			}else {
				System.out.println("再大点");
			}
			i++;
			
		}while(i<=4);
		if(i==5){
			System.out.println("4次内没有猜对，下次努力吧！");
		}
	}
	public static void main(String[] args) {
		QuessMachine a=new QuessMachine();
		a.initial();
	}
}
