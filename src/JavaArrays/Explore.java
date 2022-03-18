public class Explore {
  public static void main(String[] args) {
    String[] friends = { "Ben", "Alena", "Pasan" };

    int[][] scoreCards = {
      {1,2,3,4,5,2,3,2,5,7,8,1,2,3,4,4,3,3},
      {1,2,4,6,7,2,1,8,4,3,2,6,7,3,1,1,3,3},
      {1,4,5,6,7,2,1,4,4,6,7,3,3,2,25,6,7,8}
    };

    for (int i = 0; i < friends.length; ++i) {
      System.out.printf("%s %n----------------%n", friends[i]);
      for (int j = 0; j < scoreCards[i].length; ++j) {
        System.out.printf("Hole #%d: %d %n", j + 1, scoreCards[i][j]);
      }
      System.out.println();
    }
  }
}