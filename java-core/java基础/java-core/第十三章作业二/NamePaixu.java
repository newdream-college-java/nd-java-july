package chapter_13_2;
/*1.1、需求说明 编写方法，实现对客户姓名的排序*/
public class NamePaixu {
	public void namePaixu(String [] name){
		for (int i = 0; i < name.length; i++) {
			for (int j = 1; j < name.length; j++) {
				if(name[i].compareToIgnoreCase(name[j])>0){
					String tmp;
					tmp=name[i];
					name[i]=name[j];
					name[j]=tmp;
				}
			}
		}
		System.out.println("排序后的姓名为：");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		
	}
	public static void main(String[] args) {
		NamePaixu n=new NamePaixu();
		String[] names={"g","d","f","a",};
		System.out.println("排序前的姓名为：");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println();
		n.namePaixu(names);
	}
}
