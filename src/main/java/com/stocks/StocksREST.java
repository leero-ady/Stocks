package com.stocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;

@Path("/StocksAPI")
public class StocksREST{

//	@GET
//	@Path("/{parameter}")
//	public Response responseMsg( @PathParam("parameter") String parameter,
//			@DefaultValue("Nothing to say") @QueryParam("value") String value) {
//
//		String output = "Hello from: " + parameter + " : " + value;
//
//		return Response.status(200).entity(output).build();
//
//	}
	

	@GET
	@Path("/getStocks")
	@Produces("application/json")  	
	public ArrayList<Stock> getStocks() throws SQLException {
			
		StocksDao dao = new StocksDao();
		ArrayList<Stock> stockList =dao.getStocks();
		return stockList ;
	}
	
	@GET
	@Path("/login")
	@Produces("application/json")  	
	public User loginUser(@QueryParam("username") String username , @QueryParam("password") String password) throws SQLException {
		StocksDao dao = new StocksDao();
		User user = dao.loginUser(username, password);
				
		return user;
	}
	
	@GET
	@Path("/signup")
	@Produces("application/json")  	
	public int signUp(@QueryParam("username") String username , @QueryParam("password") String password) throws SQLException {
		StocksDao dao = new StocksDao();
		int usercreated = dao.signUp(username, password);
		
		return usercreated;
	}
	


}
