package metier;

import java.sql.Date;

public class cmnd {
	private int numcli;
	private int numcde;
	private int numpro;
	private Date date;
	private int qte;
	private String nv;
	private String fampro;
	private double puPro;
	private String nomPro;
	private String photoP;
	private String nomcli;
	private String prenomcli;
	private String adrcli;
	private String numtel;
	public cmnd(int numcli, int numcde, int numpro, Date date, int qte, String nv, String fampro, double puPro,
			String nomPro, String photoP, String nomcli, String prenomcli, String adrcli, String numtel) {
		super();
		this.numcli = numcli;
		this.numcde = numcde;
		this.numpro = numpro;
		this.date = date;
		this.qte = qte;
		this.nv = nv;
		this.fampro = fampro;
		this.puPro = puPro;
		this.nomPro = nomPro;
		this.photoP = photoP;
		this.nomcli = nomcli;
		this.prenomcli = prenomcli;
		this.adrcli = adrcli;
		this.numtel = numtel;
	}
	public cmnd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumcli() {
		return numcli;
	}
	public void setNumcli(int numcli) {
		this.numcli = numcli;
	}
	public int getNumcde() {
		return numcde;
	}
	public void setNumcde(int numcde) {
		this.numcde = numcde;
	}
	public int getNumpro() {
		return numpro;
	}
	public void setNumpro(int numpro) {
		this.numpro = numpro;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getNv() {
		return nv;
	}
	public void setNv(String nv) {
		this.nv = nv;
	}
	public String getFampro() {
		return fampro;
	}
	public void setFampro(String fampro) {
		this.fampro = fampro;
	}
	public double getPuPro() {
		return puPro;
	}
	public void setPuPro(double puPro) {
		this.puPro = puPro;
	}
	public String getNomPro() {
		return nomPro;
	}
	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}
	public String getPhotoP() {
		return photoP;
	}
	public void setPhotoP(String photoP) {
		this.photoP = photoP;
	}
	public String getNomcli() {
		return nomcli;
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	public String getPrenomcli() {
		return prenomcli;
	}
	public void setPrenomcli(String prenomcli) {
		this.prenomcli = prenomcli;
	}
	public String getAdrcli() {
		return adrcli;
	}
	public void setAdrcli(String adrcli) {
		this.adrcli = adrcli;
	}
	public String getNumtel() {
		return numtel;
	}
	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	@Override
	public String toString() {
		return "cmnd [numcli=" + numcli + ", numcde=" + numcde + ", numpro=" + numpro + ", date=" + date + ", qte="
				+ qte + ", nv=" + nv + ", fampro=" + fampro + ", puPro=" + puPro + ", nomPro=" + nomPro + ", photoP="
				+ photoP + ", nomcli=" + nomcli + ", prenomcli=" + prenomcli + ", adrcli=" + adrcli + ", numtel="
				+ numtel + "]";
	}
	
	
	
		
	
	
}
