package chapter_13_2;
/*1.1������˵�� ��д������ʵ�ֶԿͻ�����������*/
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
		System.out.println("����������Ϊ��");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		
	}
	public static void main(String[] args) {
		NamePaixu n=new NamePaixu();
		String[] names={"g","d","f","a",};
		System.out.println("����ǰ������Ϊ��");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println();
		n.namePaixu(names);
	}
}
