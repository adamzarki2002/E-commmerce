package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import metier.produit;

public class listePF {
	public class listeProduit {
		public static ArrayList<produit> listeProduitF(String famPro) {
			ArrayList<produit> produit = new ArrayList<produit>();
			Connection connection= Connexion.getConnection();
			
			try {
				produit em = new produit();
				PreparedStatement ps = connection.prepareStatement("select * from produit where famPro=? \r\n;");
				ResultSet rs = ps.executeQuery();
				ps.setString(1, em.getFamPro());
				Iterator it= produit.iterator();
				while (rs.next()) {
					
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

	}}
