package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metier.produit;

public class modifierProduit {
	public produit chercherProduit(int numPro,produit em) {
		System.out.println(em);
        Connection conn=Connexion.getConnection();
		try {
			
			PreparedStatement ps = conn.prepareStatement(" select * from produit where numPro=?");
			ps.setInt(1,numPro);
			System.out.println(em);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
			
				
				em.setNumPro(rs.getInt("numPro"));
				
				em.setPuProd(rs.getDouble("puPro"));
				
				em.setNomPro(rs.getString("nomPro"));
				System.out.println(em);
				em.setFamPro(rs.getString("famPro"));
				System.out.println(em);
				em.setPhotoP(rs.getString("photoP"));
				System.out.println(em);
			}
			
			ps.close();


		} catch (SQLException e) {
			e.printStackTrace();
		}
		return em;
	}
	public void modifierProduit(produit em) {
		Connection connection= Connexion.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("update produit \r\n"
					+ "set  nomPro=? , famPro=?, photoP=? ,puPro=?,numPro=? \r\n"
					+ "where numPro=? ;");
			ps.setString(1, em.getNomPro());
			ps.setString(2, em.getFamPro());
			ps.setString(3, em.getPhotoP());
			ps.setDouble(4, em.getPuProd());	
			ps.setInt(5, em.getNumPro());
			ps.setInt(6, em.getNumPro());

			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}

	}



}
