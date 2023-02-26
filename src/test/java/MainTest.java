import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import di.ApplicationContext;

class MainTest {

	@Test
	@DisplayName("DI 정상 동작 테스트")
	void DITest() throws Exception {
		//when
		IntroduceService introduceService = ApplicationContext.getInstance(IntroduceService.class);
		//then
		Assertions.assertTrue(introduceService.checkAutowiredFieldIsNotNull());
	}
}