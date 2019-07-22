package Demo01;

public class AdministratorTest {
	public static void main(String[] args) {
		Administrator user1=new Administrator();
		user1.name="admin1";
		user1.passWord="111111";
		Administrator user2=new Administrator();
		user2.name="admin2";
		user2.passWord="222222";
		user1.show();
		user2.show();
		user1.gxpassword();
		user1.show();
	}

}
