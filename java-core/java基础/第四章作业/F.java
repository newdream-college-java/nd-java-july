/*��������� 1 �� 1 �յ��������������
 */

import java.util.Scanner;

public class F{
	public static void main(String[ ] args){

	Scanner input=new Scanner(System.in);
	System.out.println("��֪��������Ϊƽ�꣬����2�·�Ϊ28��");
	System.out.print("�������·�");
	int i=input.nextInt();
	System.out.print("����������");
	int y=input.nextInt();

	int day=0,sum=0,x;
	for(int z=1;i>z;i--){
		switch(i){
		   	 case 1:
    		 	 case 3:
     		 	 case 5:
      	 		 case 7:
        	                	 case 8:
        			 case 10:
        	    		 case 12:
               		  	        day = 31;
            		 	        break;
       			 case 2:
            	  		         day = 28;
           			         break;
        			 default:
           	 	       	         day = 30;
           		        	         break;
		}
		sum=sum+day;
	}
	x=y+sum;
	System.out.println("���� 1 �� 1 �յ������������Ϊ��"+x);
	}

}