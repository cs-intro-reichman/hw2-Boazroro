// Collatz by Boaz Roro
public class Collatz {
	public static void main(String args[]) {

		
		int number = Integer.parseInt(args[0]);
		String letter = args[1];
		for(int i = 1; i <= number; i++){
			int x = i;
			if(letter.equals("v")){
				System.out.print(x +" ");
			}
			int counter = 1;
			while(x != 1 || counter == 1){
				if(x % 2 == 0){ 
					x /= 2;
				}
				else{
					x = x * 3 + 1;
				}
				if(letter.equals("v")){
					System.out.print(x +" ");
				}
				counter ++;
			}
			if(letter.equals("v")){	
				System.out.println("(" + counter + ")");
			}		
		}
		if (letter.equals("c")) {
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
			
		}
		else
		{
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
		}
	}
}



