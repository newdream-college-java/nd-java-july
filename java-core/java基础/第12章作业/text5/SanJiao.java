package job01.text5;

public class SanJiao {
	public void show(int n,char zf) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {				
				System.out.print(zf);
			}
			System.out.println();
		}
	}
}
