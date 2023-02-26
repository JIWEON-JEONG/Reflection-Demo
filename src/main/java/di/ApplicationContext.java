package di;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ApplicationContext {
	public static <T> T getInstance(Class<T> clazz) throws Exception {
		T instance = createInstance(clazz);
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.getAnnotation(Autowired.class) != null) {
				Object fieldInstance = createInstance(field.getType());
				field.setAccessible(Boolean.TRUE);
				field.set(instance, fieldInstance);
			}
		}
		return instance;
	}

	/**
	 * 기본 생성자 불러와 Instance 생성
	 */
	private static <T> T createInstance(Class<T> clazz) throws Exception {
		return clazz.getConstructor().newInstance();
	}

}
