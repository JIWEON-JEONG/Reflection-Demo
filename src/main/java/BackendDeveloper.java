import java.util.List;

import di.Autowired;

public class BackendDeveloper {
	private String name = "정지원";
	private List<String> techStacks = List.of("JAVA", "SPRING", "JPA", "QUERYDSL", "MYSQL");

	public String readName() {
		return this.name;
	}

	public List<String> readTechStacks () {
		return this.techStacks;
	}
}
