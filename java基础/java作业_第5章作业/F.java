import java.util.*;
public class F{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("请出拳：(0：石头；1：剪刀；2：布)");
		int a = input.nextInt();
		do{
		
		switch(a){
		case 0:
			System.out.println("人出的是：石头");
			break;
		case 1:
			System.out.println("人出的是：剪刀");
			break;
		case 2:
			System.out.println("人出的是：布");
			break;
		default :
			System.out.println("输入错误！请重新出拳：");
			a = input.nextInt();
		}
		}while(a<0 || a>=3);
		int dn = rd.nextInt(3);
		switch(dn){
		case 0:
			System.out.println("电脑出的是：石头");
			break;
		case 1:
			System.out.println("电脑出的是：剪刀");
			break;
		default:
			System.out.println("电脑出的是：布");
			break;
		}
		if((a-dn) == -1 || (a-dn)==2){
			System.out.println("人赢");
		}else if((a-dn)==0){
			System.out.println("平局");
		}else {
			System.out.println("电脑赢");
		}
		
	}
}

			