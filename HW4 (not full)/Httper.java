package Hm4;

public enum Httper {
	Er400 ("Bad Request-������������ �����"), Er401("Unauthorized-����������������� ������"),Er402("Payment Required-��������� ������"),Er403("Forbidden-����������"),Er404("Not Found-�� ��������"),Er405("Method Not Allowed-������������� �����"),Er406("Not Acceptable-������������ �����");
	private String er;
	Httper (String er){
		this.er=er;
	}
	public String getEr() {
		return er;
	}
	public void setEr(String er) {
		this.er = er;
	}

}
