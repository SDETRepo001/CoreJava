package test.install;

public class NestedLoops {

	public static void main(String[] args) {
		for (int out = 1; out <= 5; out++) {
			for (int in = 1; in <= out; in++) {
				System.out.print(in + " ");
			}
			System.out.println();
		}
	}

}
