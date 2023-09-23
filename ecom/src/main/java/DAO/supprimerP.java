package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class supprimerP {
	public void supprimerP(int numPro) {
		Connection connection= Connexion.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("delete  from produit where  numPro=? ; ");
			ps.setInt(1, numPro);
			ps.executeUpdate();
			ps.close();
			System.out.println(11);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}

	}

}
