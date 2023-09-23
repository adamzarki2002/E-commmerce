package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import metier.produit;

public class viewP {
	public static ArrayList<produit> viewProduit(int numPro) {
		ArrayList<produit> produit = new ArrayList<produit>();
		Connection connection= Connexion.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from produit where numPro=? \r\n;");
			ps.setInt(1,numPro);
			ResultSet rs = ps.executeQuery();
			Iterator it= produit.iterator();
			while (rs.next()) {
				produit em = new produit();
				em.setNumPro(numPro);
				em.setPuProd(Integer.parseInt(rs.getString("puPro")));
				em.setNomPro(rs.getString("nomPro"));
				em.setFamPro(rs.getString("famPro"));
				em.setPhotoP(rs.getString("photoP"));

				
				produit.add(em);
			}
			ps.close();
			System.out.println(produit.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		return produit;
	}
}