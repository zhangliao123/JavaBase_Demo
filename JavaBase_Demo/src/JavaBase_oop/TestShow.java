package JavaBase_oop;

public class TestShow {

	public static void main(String[] args) {

		Administrator administrator = new Administrator();
		administrator.name = "zhangsan";
		administrator.password = "123456";
		
		Customer customer = new Customer();
		customer.score = "100";
		customer.cardType = "VIP";
		
		administrator.show1();
		customer.show2();
	}
}
