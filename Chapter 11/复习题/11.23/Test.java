public class Test {
	public static void main(String[] args) {
		new A();
		new B();
	}
}
	class A {
		int i = 7;

		public A() {
			setI(20);
			System.out.println("I from A is " + i);
		}

		public void setI(int i) {
			this.i = i * 2;
		}
	}

	class B extends A {
		public B() {
			System.out.println("I from B is " + i);
		}

		public void setI(int i) {
			this.i = i * 3;
		}
	}


