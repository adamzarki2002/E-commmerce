package metier;

public class produit {
	private int numPro;
	private double puProd;
	private String nomPro;
	private String famPro;
	private String photoP;
	public produit(int numPro, double puProd, String nomPro, String famPro, String photoP) {
		super();
		this.numPro = numPro;
		this.puProd = puProd;
		this.nomPro = nomPro;
		this.famPro = famPro;
		this.photoP = photoP;
	}
	public produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumPro() {
		return numPro;
	}
	public void setNumPro(int numPro) {
		this.numPro = numPro;
	}
	public double getPuProd() {
		return puProd;
	}
	public void setPuProd(double puProd) {
		this.puProd = puProd;
	}
	public String getNomPro() {
		return nomPro;
	}
	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}
	public String getFamPro() {
		return famPro;
	}
	public void setFamPro(String famPro) {
		this.famPro = famPro;
	}
	public String getPhotoP() {
		return photoP;
	}
	public void setPhotoP(String photoP) {
		this.photoP = photoP;
	}
	@Override
	public String toString() {
		return "produit [numPro=" + numPro + ", puProd=" + puProd + ", nomPro=" + nomPro + ", famPro=" + famPro
				+ ", photoP=" + photoP + "]";
	}
		

}
