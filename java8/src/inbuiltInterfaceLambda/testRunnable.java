package inbuiltInterfaceLambda;

public class testRunnable {

	public static void main(String v[]) throws InterruptedException {

		/*Runnable r = () -> {
			for (int i = 10; i > 0; i--) {
				System.out.println(i);

			}
		}; */

		Thread t = new Thread(() -> {
			for (int i = 10; i > 0; i--) {
				System.out.println(i);

			}
		});
		t.start();
		t.join(3000);
		for (int i = 0; i < 10; i++)
			System.out.println(i);
	}
}
