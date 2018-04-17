package com.stocks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class StocksDao {
	OracleCon jdbcConnection = new OracleCon();

	
	public User loginUser(String username,String password) {
		Connection connection = jdbcConnection.getDBConnection();	
		User user=null;
		try {
			
			 PreparedStatement ps = connection.prepareStatement("select * from usr where username='"+username+"' and password='"+password+"'");

			 ResultSet rs = ps.executeQuery();
			  user = new User();
			 while (rs.next()) {
				 	user.setUsername(rs.getString("username"));
				 	user.setPassword(rs.getString("password"));
				 	user.setAccount_creation_date(rs.getDate("account_creation_date"));
				 	user.setLoginTime(rs.getTimestamp("loginTime"));
			 }
		}catch(Exception e) {
			
		}
		return user;
	}
	
	public ArrayList<Stock> getStocks() {
		ArrayList<Stock> stockList = new ArrayList<Stock>();

		try {
			Connection connection = jdbcConnection.getDBConnection();	
			 PreparedStatement ps = connection.prepareStatement("select * from stocks where symbol in ('b', 'c', 'd', 'e', 'f', 'g', 'z') and dt = '20-DEC-16'");
			 ResultSet rs = ps.executeQuery();
				Stock stock = null;
			 while (rs.next()) {
				  stock = new Stock();
				 
				 stock.setDt(rs.getDate("DT"));
				 stock.setStock_id(rs.getInt("stock_id"));
				 stock.setOpening(rs.getFloat("opening"));
				 stock.setHigh(rs.getFloat("high"));
				 stock.setLow(rs.getFloat("low"));
				 stock.setClosing(rs.getFloat("closing"));
				 stock.setVolume(rs.getInt("volume"));
				 stock.setSymbol(rs.getString("symbol"));
				 
				 stockList.add(stock);

				}		

		}catch(Exception e) {
			e.printStackTrace(System.out);

		}
		return stockList;
		
	}
	
	
	public void signUp(String username, String password ) {
		
		
		
		
	}

		
		
	}



