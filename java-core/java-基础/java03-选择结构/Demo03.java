/*练习2，输入球星的性别 如果是女，就是球星是娘们，
如果是男 就输出球星是爷们！。*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入球星的性别：");
		String sex = input.next();
		if(sex.equals("男")){
			System.out.println("星球是男");
		}
		if("女".equals(sex)){
			System.out.println("星球是女");
		}


	}
}