package metier;

import java.sql.Date;

public class commande {
	private int numCde;
	private Date date;
	private String nv;
	public commande(int numCde, Date date, String nv) {
		super();
		this.numCde = numCde;
		this.date = date;
		this.nv = nv;
	}
	public commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumCde() {
		return numCde;
	}
	public void setNumCde(int numCde) {
		this.numCde = numCde;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNv() {
		return nv;
	}
	public void setNv(String nv) {
		this.nv = nv;
	}
	@Override
	public String toString() {
		return "commande [numCde=" + numCde + ", date=" + date + ", nv=" + nv + "]";
	}
	
	
}
