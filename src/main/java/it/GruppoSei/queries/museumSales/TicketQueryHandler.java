package it.GruppoSei.queries.museumSales;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Types;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import it.GruppoSei.code.museumUsers.Visitor;
import it.GruppoSei.code.museumUtil.Utilities;

public class TicketQueryHandler {
	
	//Adding a ticket to the database
	public static boolean addTicketQuery(String ticketType, LocalDate visitDate, boolean isUsable, BigDecimal ticketPrice, int visitorId){
		try {
			int ticketId = Utilities.generateId();
			String url = "jdbc:mysql://localhost/museum?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			Connection conn = DriverManager.getConnection(url, "root","password");
			Statement stmn = conn.createStatement();
			int i = stmn.executeUpdate("INSERT INTO ticket (tickedId, ticketType, visitDate, purchaseDate, isUsable, visitorId, ticketPrice)" +
									   "VALUES ("+ticketId+" , \""+ticketType+"\" , \'"+ Date.valueOf(visitDate) +"\', \'"+ Date.valueOf(LocalDate.now()) +"\' , \""+(isUsable== true ? 1:0)+"\" , "+visitorId+" , "+ticketPrice+");");
			stmn.close();
			return true;
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return false;
		}
	}
	
	//Showing the tickets of a visitor
	public static boolean showTicketsQuery(int visitorId){
		try {
			String url = "jdbc:mysql://localhost/museum?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			Connection conn = DriverManager.getConnection(url, "root","password");
			Statement stmn = conn.createStatement();
			ResultSet rs = stmn.executeQuery("SELECT * FROM ticket WHERE visitorId = "+visitorId);
			while(rs.next()) {
				String ticketId = rs.getString("ticketId");
				String ticketType = rs.getString("ticketType");
				String visitDate = rs.getString("visitDate");
				String purchaseDate = rs.getString("dateOfSignUp");
				String isUsable = rs.getString("isUsable");
				String ticketPrice = rs.getString("ticketPrice");
				System.out.println(ticketId+" - "+ticketType+" - "+visitDate+" - "+purchaseDate+" - "+isUsable+" - "+ticketPrice);
			}
			stmn.close();
			return true;
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return false;
		}
	}
	
	//Starting a visit
	public static boolean startVisitQuery(int ticketId, int visitorId){
		try {
			String url = "jdbc:mysql://localhost/museum?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			Connection conn = DriverManager.getConnection(url, "root","password");
			Statement stmn = conn.createStatement();
			int i = stmn.executeUpdate("UPDATE ticket SET isUsable = \""+false + "\";");
			stmn.close();
			return true;
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return false;
		}
	}
	
}
