import java.util.Scanner;


public class Demo08 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������鳤�ȣ�");
		int n=input.nextInt();
		String songs[]=new String[n+1];
		for(int i=0;i<songs.length;i++){
			if(i==0){
				songs[songs.length-1]=" ";
			}else{
				System.out.print("�������"+i+"�׸�����ƣ�");
				songs[i]=input.next();
			}
		}
		paiXu(songs);
		System.out.print("������������ƣ�");
		String song=input.next();
		chaRu(songs,song);
		
	}
	public static void shuChu(String songs[]){
		for(int i=0;i<songs.length;i++){
			if(songs[i]!=null){
				System.out.print(songs[i]+"\t");
			}else{
				System.out.print(" \t");
			}
		}
		System.out.println();
	} 
	
	public static void paiXu(String songs[]){
		int result=0;
		int k=1;
		for(int i=0;i<songs.length;i++){
			for(int j=1;j<(songs.length-k);j++){
				result=songs[j].compareToIgnoreCase(songs[j+1]);
				if(result>0){
					String temp=songs[j];
					songs[j]=songs[j+1];
					songs[j+1]=temp;
				}
				else{
					continue;
				}
			}
			k++;
		}
		System.out.print("����ǰ������Ϊ��");
		shuChu(songs);
	}
	
	public static void chaRu(String songs[],String song){
		int result=0;
		boolean flag=false;
		int index=0;
		for(int i=1;i<songs.length;i++){
			result=song.compareToIgnoreCase(songs[i]);
			if(result<=0){//���±�
				index=i;
				flag=true;
				break;
			}
		}
		if(!flag){
			index=songs.length-1;
		}
		for(int i=0;i<index;i++){//���±�����Ԫ�������
			songs[i]=songs[i+1];
		}
		songs[index]=song;
		System.out.print("����������Ϊ��");
		shuChu(songs);
	}
}
