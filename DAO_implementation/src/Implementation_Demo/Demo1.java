package Implementation_Demo;

public class Demo1 implements Menu {

	@Override
	public void add(int a, int b) {
		int c;
		c=a+b;
		System.out.println(c);

	}

	@Override
	public void substract(int a, int b) {
		// TODO Auto-generated method stub

		int c;
		c=a-b;
		System.out.println(c);
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub

		int c;
		c=a*b;
		System.out.println(c);
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub

		int c;
		c=a/b;
		System.out.println(c);
	}

}
