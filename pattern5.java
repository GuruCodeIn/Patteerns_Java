public class pattern5 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<5;i++){
            // for print space
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
