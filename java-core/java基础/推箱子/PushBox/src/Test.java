import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Map m = new Map();
		Scanner scanner = new Scanner(System.in);
		m.inputMap();
		String s;
		while (m.flag) {
			System.out.println("W是向上走，S是向下走");
			System.out.println("A是向左走，D是向右走");
			System.out.println("请输入下一步操作：");
			s = scanner.next();
			if(s.equals("w")){
				m.toW(s);
			}else if(s.equals("s")){
				m.toS(s);
			}else if(s.equals("d")){
				m.toD(s);
			}else if (s.equals("a")) {
				m.toA(s);
			}else {
				System.out.println("没有这个操作！！！");
			}
			
			
			
		}
		
	}

}
