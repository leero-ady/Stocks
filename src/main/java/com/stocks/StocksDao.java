package com.stocks;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;


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
				 if(rs.getString("username")!=null) {
				 	user.setUsername(rs.getString("username"));
				 	user.setPassword(rs.getString("password"));
				 	user.setAccount_creation_date(rs.getDate("account_creation_date"));
				 	user.setLoginTime(rs.getTimestamp("loginTime"));
				 }
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
	
	
	public int signUp(String username, String password ) {
		int recordInserted=0;
		try {
			Connection connection = jdbcConnection.getDBConnection();	
			Date sqlDate = new Date(Calendar.getInstance().getTimeInMillis());

			 PreparedStatement ps = connection.prepareStatement("insert into usr(account_creation_date,username,lastlogintime,password) values (?, ?,?,?)");
			 
			 ps.setDate(1, sqlDate);//1 specifies the first parameter in the query i.e. name  
			 ps.setString(2,username); 
			 ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
			 ps.setString(4,password);
			 ResultSet rs = ps.executeQuery();
			 
			 recordInserted=1;

		}catch(Exception e) {
			e.printStackTrace(System.out);

		}
		return recordInserted;
		
	}

		
		
	}



