import di.ApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		IntroduceService introduceService = ApplicationContext.getInstance(IntroduceService.class);
		introduceService.introduce();
		introduceService.coding();
		introduceService.communicate();
		introduceService.checkAutowiredFieldIsNotNull();
	}
}
