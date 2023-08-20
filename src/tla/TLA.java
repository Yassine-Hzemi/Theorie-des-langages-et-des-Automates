import java.util.Scanner;
public class TLA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    boolean[] E = {false,true,false,true}; 
     for (boolean k: E) {
            System.out.println(k);
    int[][] T = new int[4][3];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(String.format("Entrez [%d][%d] : ", i, j));
        T[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < T.length; i++) {
      for (int j = 0; j < T[0].length; j++) {
        System.out.print(T[i][j] + "\t");
      }
      System.out.println();
    }

  }
}