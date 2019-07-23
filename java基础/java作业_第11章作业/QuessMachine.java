import java.util.*;


public class QuessMachine{
	int b;
	public void initial(){
		String[] g = {"公主电动车","抱歉没有摇到"};
		Random rd = new Random();
		
		for(int i=0;i<g.length;i++){
			int a = rd.nextInt(g.length);
		if(a==1){
			System.out.println("请猜测"+g[0]+"的价格：");
			 break;
		}else {
			System.out.println(g[1]);
			break;
		}	
		}
	}	
		public String guess(){
			String a="猜对了！";
			String d="在大些！";
			String c="在小些！";
			String k="";
			initial();
			Scanner input = new Scanner(System.in);
			int b = input.nextInt();
			if(b==2000){
				k=a;
				
			}else if(b>2000){
				k=c;
			}else {
				k=d;
			}
		return k;
		}
			
		
	
}
