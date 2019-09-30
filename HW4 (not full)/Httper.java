package Hm4;

public enum Httper {
	Er400 ("Bad Request-Неправильний запит"), Er401("Unauthorized-Несанкційонований доступ"),Er402("Payment Required-Необхідна оплата"),Er403("Forbidden-Заборонено"),Er404("Not Found-Не знайдено"),Er405("Method Not Allowed-Неприпустимий метод"),Er406("Not Acceptable-Неприйнятний запит");
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
