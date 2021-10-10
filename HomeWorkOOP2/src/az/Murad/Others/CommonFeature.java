package az.Murad.Others;

public interface CommonFeature {

	public default void add(String className) {
		System.out.println(className + "'s add method !");
	}

	public default void update(String className) {
		System.out.println(className + "'s update method !");
	}

	public default void delete(String className) {
		System.out.println(className + "'s delete method !");
	}

	public default void search(String className) {
		System.out.println(className + "'s search method !");
	}

}
