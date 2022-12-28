package lambdaExpression;

class LambdaMultiThreading {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main thread");
		}
	}
}

class Run {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Child Thread");
			}
			;
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 5; i++)
			System.out.println("Parent Thread");

	}
}
