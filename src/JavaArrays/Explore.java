public class Explore {
  public static void main(String[] args) {
    String[] friends = { "Ben", "Alena", "Pasan" };

    // Enhanced for loop
    for (String friend : friends) {
      System.out.printf("Hey %s! The movie starts at 7, C U there! \n", friend);
    }
    System.out.println("\n");

    // Unenhanced for loop
    for (int i = 0; i < friends.length; ++i) {
      String friend = friends[i];
      System.out.printf("Hola %s, Please be there in time, maybe 10-15 mins before. Thanks\n", friend);
    }
  }
}