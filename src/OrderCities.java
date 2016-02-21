import java.util.Scanner;

public class OrderCities {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
    System.out.print("Enter the first city: ");
    String city1 = input.nextLine();
    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();
    System.out.print("Enter the third city: ");
    String city3 = input.nextLine();
    
    if (city1.compareTo(city2) > 0){
      String temp = city1;
      city1 = city2; 
      city2 = temp;
    } // if
    
    if (city2.compareTo(city3) > 0){
      String temp2 = city2;
      city2 = city3;
      city3 = temp2;
    } // if
    
    if (city1.compareTo(city2) > 0){
      String temp3 = city1;
      city1 = city2;
      city2 = temp3;
    } // if
    
    System.out.println("The three cities in alphabetical order are " + 
            city1 + " " + city2 + " " + city3);
  } // main   
} // OrderCities
