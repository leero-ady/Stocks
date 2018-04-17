package com.stocks;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  

class OracleCon{  
	public Connection getDBConnection() {
		 Connection con = null;
			try{  
				//step1 load the driver class  
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();  
				  
				//step2 create  the connection object  
				 con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","mantha","Endirababu99$");  
				  
				//step3 create the statement object  
//				Statement stmt=con.createStatement();  
//				  
//				//step4 execute query  
//				ResultSet rs=stmt.executeQuery("select * from stocks");  
//				while(rs.next())  
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				  
				
				//step5 close the connection object  
			  
			}catch(Exception e){
				System.out.println(e);
				}  
			
				return con;
			}  
		}    
