public class Block{

	static {
		System.out.println("Hi, I'm Static Block");
	}
	
	{
		System.out.println("Hi, I'm EmptyBlock");
	}
	
	public Block(){
		System.out.println("Hi, I'm Constructor Block");
	}
	
	
	public static void main(String args[]){
		Block obj = new Block();
		Block obj1 = new Block();
	}
	
}
