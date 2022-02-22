package com.mayab.desarrollo.parcial1.problema4;

public class AdapterDataBaseB implements IDataBase{
	private DataBaseB dbB;
	
	public AdapterDataBaseB(DataBaseB dbB) {
		this.dbB = dbB; 
	}

	@Override
	public String getConnection() {
		// TODO Auto-generated method stub
		return dbB.getConnection();
	}

	@Override
	public String createStatement() {
		// TODO Auto-generated method stub
		return dbB.getTableName().toLowerCase() + dbB.getColName().toLowerCase();
	}

	@Override
	public String executeStatement() {
		// TODO Auto-generated method stub
		return dbB.executeStatement();
	}
}
