import java.util.Scanner;


public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("1、存款\t2、取款\t0、退出");
		System.out.println("请输入您要办理的业务：");
		int a = input.nextInt();
		D p = new D();
		p.show(a);
	
		
		
	}
	public void show(int yw){
		Scanner input = new Scanner(System.in);
		int ye=0;
		for(int i=1;i>0;i++){
			if(yw==1){
				System.out.print("请输入存款金额：");
				int ck = input.nextInt();
				ye+=ck;
				System.out.println("存款成功\b");
				System.out.println("***当前余额为："+ye);
			}else if(yw==2){
				System.out.print("请输入取款金额：");
				int qk = input.nextInt();
				if(qk<=ye){
					ye-=qk;
					System.out.println("取款成功");
					System.out.println("***当前余额为："+ye);
				}else {
					System.out.println("余额不足");
				}
				
			}else if(yw==0){
				System.out.println("谢谢使用");
				break;
		}
			System.out.println("1、存款\t2、取款\t0、退出");
			System.out.print("请输入您要办理的业务：");
			 yw = input.nextInt();
		
	}

}
}
