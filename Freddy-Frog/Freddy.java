import java.util.Scanner;
class Freddy{
	
public static void main(String[] args){
	
	System.out.println("niro");
	
	Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the distance");
			double distance= scanner.nextDouble();
			
			int jumps=0;
			int gap = 0;
			double time=0.0;
			if(distance > 0){
					while(distance > 0.0){
					if(gap ==0 && distance > 0.0){
						distance = distance- 5;
						jumps++;
						time = time + 1;
						gap++;
					}
					if(gap==1 && distance > 0.0){
						distance = distance - 3;
						jumps++;
						time  = time + 2;
						gap++;
					}
					if(gap==2 && distance > 0.0){
						distance = distance - 1;
						jumps++;
						time = time + 3.5;
						gap=0;
					}
				
				}
			System.out.println("How long it take "+ time + "s");
			System.out.println("How many jumps "+ jumps);
			}
			else {
				System.out.println("Input invalid");
			}
	
}
}