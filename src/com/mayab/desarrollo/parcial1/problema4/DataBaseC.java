package com.mayab.desarrollo.parcial1.problema4;

public class DataBaseC {
	String conn; 
	String tableName;
	String colName;
	String res; 

	
	public DataBaseC(String conn, String table, String col, String res) {
		this.conn = conn; 
		this.colName = col; 
		this.tableName = table;
		this.res = res;

	}

	public String getConnection() {
		// Get connection to db
		return conn;
	} 
	
	
	public String getTableName() {
		return tableName;
	}


	public String getColName() {
		return colName;
	}
	
	public String executeStatement() {
		// Execute stmt
		return res;
	}

}
