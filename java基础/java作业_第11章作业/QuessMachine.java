import java.util.*;


public class QuessMachine{
	int b;
	public void initial(){
		String[] g = {"�����綯��","��Ǹû��ҡ��"};
		Random rd = new Random();
		
		for(int i=0;i<g.length;i++){
			int a = rd.nextInt(g.length);
		if(a==1){
			System.out.println("��²�"+g[0]+"�ļ۸�");
			 break;
		}else {
			System.out.println(g[1]);
			break;
		}	
		}
	}	
		public String guess(){
			String a="�¶��ˣ�";
			String d="�ڴ�Щ��";
			String c="��СЩ��";
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
