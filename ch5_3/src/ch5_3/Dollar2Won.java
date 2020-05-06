package ch5_3;
import java.util.Scanner;

abstract class Converter{

	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio;

	

	public void run() {

		Scanner scanner = new Scanner(System.in);

		System.out.println(getDestString()+"을 "+getSrcString()+"로 바꿉니다.");

		System.out.print(getDestString()+"을 입력하세요>> ");

		double val = scanner.nextDouble();

		double res = convert(val);

		System.out.println("변환 결과: "+res+getSrcString()+"입니다.");

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

		return "원";

	}



	@Override

	protected String getDestString() {

		return "달러";

	}
	public static void main(String[] args) {
		Dollar2Won toWon = new Dollar2Won(1200);
		toWon.run();

	}

}
