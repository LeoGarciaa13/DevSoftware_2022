package com.mayab.desarrollo.parcial1.problema4;

public class DataBase implements IDataBase{
	String conn; 
	String stmt; 
	String result; 
	
	public DataBase(String conn, String stmt, String result) {
		this.conn = conn; 
		this.stmt = stmt; 
		this.result = result;
	}

	@Override
	public String getConnection() {
		// Get connection to db
		return conn;
	}

	@Override
	public String createStatement() {
		// Create Statement 
		return stmt;
	}

	@Override
	public String executeStatement() {
		// Execute stmt
		return result;
	}

}
