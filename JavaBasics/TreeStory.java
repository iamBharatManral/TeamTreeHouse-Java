import java.io.Console;

public class TreeStory {
  public static void main(String[] args) {
    Console console = System.console();
    // __Name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
    
    String ageAString = console.readLine("Enter your age: ");
    int age = Integer.parseInt(ageAString);
    if (age < 13) {
      console.printf("Sorry you must be at least 13 years old to use this program\n");
      System.exit(0);
    }
    String name = console.readLine("Enter your name: ");
    String adjective = console.readLine("Enter an adjective: ");
    String noun = console.readLine("Enter a noun: ");
    String adverb = console.readLine("Enter an adverb: ");
    String verb = console.readLine("Enter a verb ending in -ing: ");
    console.printf("\nYour TreeStory:\n---------------\n");
    console.printf("%s is a %s %s. They are always %s %s.\n", name, adjective, noun, adverb, verb);
  }
}
