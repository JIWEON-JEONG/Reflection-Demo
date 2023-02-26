import java.util.List;

import di.Autowired;

public class IntroduceService {

	@Autowired
	private BackendDeveloper backendDeveloper;

	public IntroduceService() {
	}

	public boolean checkAutowiredFieldIsNotNull() {
		if (backendDeveloper == null) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	public void introduce() {
		System.out.println("안녕하세요. 백엔드 개발자 " + backendDeveloper.readName() + " 입니다.");
	}

	public void coding() {
		String stack = handleTechStackToPrint(backendDeveloper.readTechStacks());
		System.out.println(stack + " 을 활용하여 개발 할 수 있습니다, 새로운 기술을 배우고 적용할 수 있습니다.");
	}

	public void communicate() {
		System.out.println("명확한 근거를 토대로 협업 및 토의 합니다. 동료의 말에 귀기울이고 피드백에 대한 감사함을 표현합니다.");
	}

	private String handleTechStackToPrint(List<String> techStacks) {
		StringBuilder builder = new StringBuilder();
		int size = techStacks.size();
		for (int i = 0; i < size; i++) {
			builder.append(techStacks.get(i));
			if (i < size - 1) {
				builder.append(", ");
			}
		}
		return builder.toString();
	}
}
