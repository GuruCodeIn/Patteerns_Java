public class pattern6 {
    public static void main(String[] args) {
        int n=5;
      // upper half of the diamond
        for(int i=0;i<n;i++){
            // for print space
            for(int j=n-1;j>i;j--){
              System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half of the diamond
        for(int i=1;i<n;i++){
            // for spacing
            for(int j=0;j<i;j++){
             System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
