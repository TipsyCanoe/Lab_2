/* Mitsy.java: <description>
 * Author: Richard Jefferson  
 * Collaborators: Thomas
 * Date: 1/18/2023
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList; 
public class Mitsy {
public static void main(String[] args) {
  
    // load data from file into array
    try {
      Scanner scanner = new Scanner(new File("terrier_weights.txt"));
      public static void ArrayList<Double> dog_weights(double n){
          ArrayList<Double> dog_weights = new ArrayList<Double>();
          for(i = 0: i <100; i++) {
              double weight = scanner.nextDouble();
              dog_weights.add(weight);
    }
    return dog_weights;
}
      // work here
     
      scanner.close();
    } catch (FileNotFoundException e) {
e.printStackTrace();
}
double sum = 0
for(int j = 0; i < dog_weights.size(); j++){
  sum += dog_weights.get(j);
  double avg = sum / dog_weights.length();
}
return avg;
    // compute average here
}
}