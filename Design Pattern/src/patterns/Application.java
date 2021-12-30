package patterns;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBManager dbManager =  DBManager.getDbManager();
		System.out.println(dbManager.getDbManager());

		
		DBManager dbManager1 =  DBManager.getDbManager();
		System.out.println(dbManager1.getDbManager());
		
		// when you run this, it gives 2 instances with same. bcz its singleton
	}

}
