package bai03;



public class test {
	public static void main(String[] args) {
		TamGiac abc = new TamGiac(0, 0, 0);
		TamGiac a1 = new TamGiac(2, 0, -5);
		TamGiac a2 = new TamGiac(3, 3, 6);
		TamGiac a3 = new TamGiac(3, 3, 3);
		TamGiac a4 = new TamGiac(3, 5, 3);
		System.out.println(TamGiac.setTieuDe());
		System.out.println(abc.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());

	}
}
