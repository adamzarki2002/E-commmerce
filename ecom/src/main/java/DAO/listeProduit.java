package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import metier.*;

public class listeProduit {
	public static ArrayList<produit> listeProduit() {
		ArrayList<produit> produit = new ArrayList<produit>();
		Connection connection= Connexion.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("select * from produit\r\n;");
			ResultSet rs = ps.executeQuery();
			Iterator it= produit.iterator();
			while (rs.next()) {
				produit em = new produit();
				em.setNumPro(rs.getInt("numPro"));
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
