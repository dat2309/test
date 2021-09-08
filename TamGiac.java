package bai03;

public class TamGiac {
	private float ma;
	private float mb;
	private float mc;

	// constructor mac dinh
	public TamGiac() {

	}

	public TamGiac(float a, float b, float c) {
		if (a < 0 || b<0||c<0|| a+b<c || a+c<b ||b+c<a)
		{
			this.ma=0;
			this.mb=0;
			this.mc=0;
		}
		else
		{
		setCanhA(a);
		setCanhB(b);
		setCanhC(c);
		}
	}

// cac phuong thuc get set
	public float getCanhA() {
		return ma;
	}

	public void setCanhA(float a) {
		if (a> 0)
		ma = a;
	}

	public float getCanhB() {
		return mb;
	}

	public void setCanhB(float b) {
		if(b>0)
		mb = b;
	}

	public float getCanhC() {
		return mc;
	}

	public void setCanhC(float c) {
		if(c>0)
		mc = c;
	}

	public float getChuVi() {
		return ma + mb + mc;
	}

	public double getDienTich() {
		double p = (double) (ma + mb + mc) / 2;
		return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public String getLoaiTamGiac() {
		String chuoi;

		if (ma + mb > mc && mb + mc > ma && ma + mc > mb) {

			if (ma == mb && mb == mc)
				chuoi = "Tam giac deu";
			else if (ma == mb || mb == mc || ma == mc)
				chuoi = "Tam giac can";
			else
				chuoi = "Tam giac thuong";
		} else
			chuoi = "Khong phai la tam giac";
		return chuoi;
	}
	public String toString() {
		return String.format("%.2f %6.2f %6.2f %-28s %.2f %6.2f", ma, mb, mc, getLoaiTamGiac(),
				getChuVi(), getDienTich());
	}
	public static String setTieuDe(){
		return String.format("%s %3s %2s %-25s %7s %3s", "Canh A", "Canh B", "Canh C", "Loai","Chu Vi", "Dien Tich");

	}
}