package day_12_05_356p;

public class Ex {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setService(new MemberService());
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();
	
	}
}
