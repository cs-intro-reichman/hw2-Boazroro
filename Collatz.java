// Collatz by Boaz Roro
public class Collatz {
	public static void main(String args[]) {

		
		int number = Integer.parseInt(args[0]);
		String letter = args[1];
		for(int i = 1; i <= number; i++){
			int zmani = i;
			if(letter.equals("v")){
				System.out.print(zmani +" ");
			}
			int counter = 1;
			while( counter == 1||zmani != 1){
				if(zmani% 2 == 0){ 
					zmani /= 2;
				}
				else{
					zmani= zmani * 3 + 1;
				}
				if(letter.equals("v")){
					System.out.print(zmani +" ");
				}
				counter ++;
			}
			if(letter.equals("v")){	
				System.out.println("(" + counter + ")");
			}		
		}
		if (letter.equals("c" )) {
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
			
		}
		else
		{
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
		}
	}
}



