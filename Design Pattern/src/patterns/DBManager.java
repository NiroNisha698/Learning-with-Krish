package patterns;



public class DBManager {
	
	private static volatile DBManager dbManager;// = new DBManager() ;
	
	//So can't create instance
	private DBManager() {
		if(dbManager != null) {
			throw new RuntimeException("please use dbManager");
			
		}
		
	}
	
	
	//double checking singleton
	public static DBManager getDbManager() {
		if(dbManager == null) {
			synchronized(DBManager.class) {
				if(dbManager == null) {
					dbManager = new DBManager();
				}
			}
			
		}
		return dbManager;
		
	}

	
	

}
