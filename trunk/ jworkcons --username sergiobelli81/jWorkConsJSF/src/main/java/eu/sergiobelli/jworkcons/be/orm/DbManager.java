package eu.sergiobelli.jworkcons.be.orm;

import java.sql.SQLException;

import org.apache.log4j.Logger;

public class DbManager {
	private static final Logger logger = Logger.getLogger(DbManager.class);
	
	private static DataBaseDao dataBaseDao;
	public DataBaseDao getDataBaseDao() {return dataBaseDao;}
	public void setDataBaseDao(DataBaseDao dbdao) {dataBaseDao = dbdao;}
	
	public void ping() throws Exception {
		try {
			String message = "DataBase not reachable ! ";
			if (null == getDataBaseDao().getSqlMapClient()) {
				throw new Exception(message);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("Database not reachable !!! ",ex);
			throw ex;
		}
	}
	
	protected void startTransaction() throws SQLException {
		getDataBaseDao().getSqlMapClient().startTransaction();
	}
	protected void commitTransaction() throws SQLException {
		getDataBaseDao().getSqlMapClient().commitTransaction();
	}
	protected static void endTransaction() {
		try {
			dataBaseDao.getSqlMapClient().endTransaction();
			dataBaseDao.getDataSource().getConnection().close();
		} catch (SQLException e) {
			logger.warn("Connection not properly closed or just closed connection = " + e.getMessage());
		} catch (Exception e) {
			logger.error("System error in closing connection = " + e.getMessage());
		}
	}
	
}

