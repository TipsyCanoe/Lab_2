/* Mitsy.java: <description>
 * Author: Richard Jefferson  
 * Collaborators: Thomas
 * Date: 1/18/2023
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// import java.util.ArrayList; 

public class Mitsy {

	public static void main(String[] args) {
    // load data from file into array
    int line = 0;
    double weight_total = 0;
    double[] dog_weights = new double[line];

    
    try{
      Scanner scanner = new Scanner(new File("terrier_weights.txt"));
      while(scanner.hasNextLine()){
        line++;
      }
      scanner.close();
      System.out.println(line);
    }
    catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    try {
      int i = 0;
      Scanner scanner = new Scanner(new File("terrier_weights.txt"));
      while(scanner.hasNextLine()){
        dog_weights[i] = scanner.nextDouble();
        weight_total = scanner.nextDouble();
        i++;
      }
      System.out.println(dog_weights);
      
      // work here
     
      scanner.close();

      

    } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  Scanner keyboard_input = new Scanner(System.in);
  System.out.println("What is Misty's wight?");
  String their_wight = keyboard_input.nextLine();
  keyboard_input.close();
  // compute average here
  double avg = weight_total / line;
  System.out.println(their_wight);
  System.out.println(avg);
  


	}

}
