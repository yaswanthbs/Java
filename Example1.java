public class Example1 {
	static String name;

	Example1(String n) {
		name = n;
	}

	public boolean equals(Object o) {
		Example1 m = (Example1) o;
		if (m.name != null) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Example1 m1 = new Example1("guitar");
		Example1 m2 = new Example1("tv");
		Example1 m3 = new Example1(null);
		System.out.println(m1.equals(m2) + "," + m2.equals(m3) + "," + (m3 == m3)); //false, false, true
	}
}
