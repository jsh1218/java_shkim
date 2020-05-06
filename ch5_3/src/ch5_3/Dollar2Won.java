package ch5_3;
import java.util.Scanner;

abstract class Converter{

	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio;

	

	public void run() {

		Scanner scanner = new Scanner(System.in);

		System.out.println(getDestString()+"�� "+getSrcString()+"�� �ٲߴϴ�.");

		System.out.print(getDestString()+"�� �Է��ϼ���>> ");

		double val = scanner.nextDouble();

		double res = convert(val);

		System.out.println("��ȯ ���: "+res+getSrcString()+"�Դϴ�.");

		scanner.close();

	}

}
class Dollar2Won extends Converter{
	private int price;
	public Dollar2Won(int price){this.price = price;}
	
	
	@Override

	protected double convert(double src) {

		double res = src * 1200;

		return res;

	}



	@Override

	protected String getSrcString() {

		return "��";

	}



	@Override

	protected String getDestString() {

		return "�޷�";

	}
	public static void main(String[] args) {
		Dollar2Won toWon = new Dollar2Won(1200);
		toWon.run();

	}

}
