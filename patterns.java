public class patterns {
    public static void main(String args[]){
        /////////rectangle///////////////
        int n = 4;
        int m = 5;
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        ///////hollow rectangle////////////////////////
        int n =4;
        int m = 5;
        for(int i = 1 ; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i == 1 || j == 1|| i == n || j == m ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        ////////////////////////////////////////////////
        int n = 5;
        for (int i = 1; i<=5 ; i++){
            for(int j = 1 ; j <=i; j++ ){
                System.out.print("*");
            }System.out.println();
        }
        /////////////////////////above pattern invert//////////
        int n = 5;
        for( int i =n ; i>=1; i--){
            for(int j=1; j<=i ; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        /////////////pattern rotatted by 180degree /////////////////////////////
        int n = 5;
        for(int i=1; i<=n; i++){ 

            for(int j=1; j<=n-i ;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
