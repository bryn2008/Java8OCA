import java.util.Random; // tells java to import the Random package and where to find it

public class ImportExample {
	public static void main(String[] args){
		Random r = new Random();
		System.out.println(r.nextInt(10)); //prints a number between 0 and 9
	}
}