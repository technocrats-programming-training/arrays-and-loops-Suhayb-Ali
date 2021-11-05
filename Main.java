public class Main {
    public static void main(String[] args) {
      for(int i =1; i <= 100; i++) {
        System.out.print(i + ": ");
      for(int j = 1; j <= i; j++) {
        if(i % j == 0){
          System.out.print(j);
          if(j != i) {
            System.out.print(", ");
          }
        }
      }
      System.out.println("");
    }
  }
}

