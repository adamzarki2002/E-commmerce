package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

import metier.Clients;


public class listeclient {

			public static ArrayList<Clients> listeClients() {
				ArrayList<Clients> client = new ArrayList<Clients>();
				Connection connection= Connexion.getConnection();
				
				try {
					PreparedStatement ps = connection.prepareStatement("select * from client Where numCli NOT IN(1) \r\n;");
					ResultSet rs = ps.executeQuery();
					Iterator it= client.iterator();
					while (rs.next()) {
						Clients em = new Clients();
						em.setNumCli(rs.getInt("numCli"));
						em.setAdrCli(rs.getString("adrcli"));
						em.setNomCli(rs.getString("nomcli"));
						em.setPrenomCli(rs.getString("prenomcli"));
						em.setPass(rs.getString("pass"));
						em.setEmail(rs.getString("email"));
						em.setNumtel(rs.getString("numtel"));
						
						client.add(em);
					}
					ps.close();
					System.out.println(client.toString());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("error");
				}
				return client;
			}
		


}
