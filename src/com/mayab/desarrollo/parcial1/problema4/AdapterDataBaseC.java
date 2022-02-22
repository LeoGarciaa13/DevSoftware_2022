package com.mayab.desarrollo.parcial1.problema4;

public class AdapterDataBaseC implements IDataBase{
	private DataBaseC dbC;
	
	public AdapterDataBaseC(DataBaseC dbC) {
		this.dbC = dbC; 
	}

	@Override
	public String getConnection() {
		// TODO Auto-generated method stub
		return dbC.getConnection();
	}

	@Override
	public String createStatement() {
		// TODO Auto-generated method stub
		return dbC.getTableName().toLowerCase() + dbC.getColName().toLowerCase();
	}

	@Override
	public String executeStatement() {
		// TODO Auto-generated method stub
		return dbC.executeStatement();
	}
}
