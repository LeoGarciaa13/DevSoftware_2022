package com.mayab.desarrollo.parcial1.problema4;

public class AdapterDataBaseA implements IDataBase{
	private DataBaseA dbA;
	
	public AdapterDataBaseA(DataBaseA dbA) {
		this.dbA = dbA; 
	}

	@Override
	public String getConnection() {
		// TODO Auto-generated method stub
		return dbA.getConnection();
	}

	@Override
	public String createStatement() {
		// TODO Auto-generated method stub
		return dbA.getTableName().toLowerCase() + dbA.getColName().toLowerCase();
	}

	@Override
	public String executeStatement() {
		// TODO Auto-generated method stub
		return dbA.executeStatement();
	}

}
