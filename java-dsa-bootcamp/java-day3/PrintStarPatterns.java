public class PrintStarPatterns {
    public static void main(String[] args){
        int n = 5;
        System.out.println("1. print right triangle of stars ");
        printRightTriangle(n);

        System.out.println("1. print left triangle of stars ");
        printLeftTriangle(n);

        System.out.println("3. print pyramid of stars ");
        pyramidOfStars(n);

        System.out.println(" print inverted triange of stars");
        invertedStars(n);

    }

    //pattern1 : print right triangle of stars
   public static void printRightTriangle(int n){
    for(int i=1; i <= n; i++){
        for(int j=1 ; j<= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
   }

    // Pattern 2: print left triangle of stars
    public static void printLeftTriangle(int n) {
        System.out.println("Logic: row i has (n-i) spaces + i stars");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern 3: print pyramid of stars
    public static void pyramidOfStars(int n){
        System.out.println("Logic: row i has (n-i) spaces + (2*i-1) stars");
        for(int i=1; i<= n ; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int j = 1; j <= 2*i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //pattern4: inverted triange of stars
    public static void invertedStars(int n){
        for(int i=n; i >= 1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
