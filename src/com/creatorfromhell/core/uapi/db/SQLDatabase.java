package com.creatorfromhell.core.uapi.db;

import java.sql.Connection;
import java.sql.ResultSet;

public abstract class SQLDatabase extends Database {

	@Override
	public abstract void connect();

	@Override
	public abstract Connection connection();
	
	public abstract void executeQuery(String query);
	
	public void executePreparedQuery(String query, Object[] variables) {
		executePreparedQuery(query, variables, true);
	}
	
	public abstract void executePreparedQuery(String query, Object[] variables, boolean overwrite);
	
	public abstract void executeUpdate(String query);
	
	public abstract void executePreparedUpdate(String query, Object[] variables);
	
	public abstract ResultSet results();
}