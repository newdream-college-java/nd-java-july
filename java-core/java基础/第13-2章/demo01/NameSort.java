/*编写方法，实现对客户姓名的排序*/
package demo01;

public class NameSort {
	public void sort(String names[]){
		String tmp;
		 for (int i = 0; i < names.length-1; i++) {
			 for (int j = 0; j < names.length-1-i; j++) {
				 if(names[j].compareToIgnoreCase(names[j+1])>0){
						tmp=names[j];
						names[j]=names[j+1];
						names[j+1]=tmp;
					}
			}
		}
		 for (int i = 0; i < names.length; i++) {
			 System.out.print(names[i]+"\t");
		}
	}
}