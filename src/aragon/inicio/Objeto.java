package aragon.inicio;

public class Objeto {
	private String redSocial;
	private String concepto;
	private String año;
	private String enero;
	private String febrero;
	private String marzo;
	private String abril;
	private String mayo;
	private String junio;

	public Objeto(String redSocial, String concepto, String año, String enero, String febrero, String marzo,
			String abril, String mayo, String junio) {
		super();
		this.redSocial = redSocial;
		this.concepto = concepto;
		this.año = año;
		this.enero = enero;
		this.febrero = febrero;
		this.marzo = marzo;
		this.abril = abril;
		this.mayo = mayo;
		this.junio = junio;
	}

	public String getRedSocial() {
		return redSocial;
	}

	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getEnero() {
		return enero;
	}

	public void setEnero(String enero) {
		this.enero = enero;
	}

	public String getFebrero() {
		return febrero;
	}

	public void setFebrero(String febrero) {
		this.febrero = febrero;
	}

	public String getMarzo() {
		return marzo;
	}

	public void setMarzo(String marzo) {
		this.marzo = marzo;
	}

	public String getAbril() {
		return abril;
	}

	public void setAbril(String abril) {
		this.abril = abril;
	}

	public String getMayo() {
		return mayo;
	}

	public void setMayo(String mayo) {
		this.mayo = mayo;
	}

	public String getJunio() {
		return junio;
	}

	public void setJunio(String junio) {
		this.junio = junio;
	}

	@Override
	public String toString() {
		return "Objeto [redSocial=" + redSocial + ", concepto=" + concepto + ", año=" + año + ", enero=" + enero
				+ ", febrero=" + febrero + ", marzo=" + marzo + ", abril=" + abril + ", mayo=" + mayo + ", junio="
				+ junio + "]";
	}

}
