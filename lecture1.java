public class lecture1 {
    // public static int  sumdigit(int n){
    //     int sumdigit= 0;
    //     while(n>0){
    //         int lastdigit = n % 10; 
    //         sumdigit += lastdigit;
    //         n = n/10;

            
    //     }

    //   return sumdigit;

       
    // }
   
    public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    //  int n  = sc.nextInt();
    //  int oddsum = 0; 
    //  int evensum = 0;
    //  for(int i= 1; i<= n; i++){
    //     System.out.println("please provide the number " + i);
    //     int num = sc.nextInt();
        // System.out.println("the number you have provide is " +  num);
        // if(num % 2==0){
        //     evensum += num;
        // } else{
        //     oddsum += num;
        // }

        // System.out.println("the sum of odd number is " + oddsum);
        // System.out.println("the sum even number " + evensum);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("input integer");
        // int digit = sc.nextInt();
        // System.out.println("the sum of digit " + sumdigit(digit));
        // int [][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        // int sum = 0;
        // // sum of 2nd row elements

        // for(int i=0; i<nums.length; i++){
        //     sum += nums[1][i];
        // }
        // System.out.println("sum is " + sum);
        int row = 2, column = 3;
        int [][] matrix = {{2,3,7}, {5,6,7}};
         
        // dispaly original matrix
        printMatrix(matrix);

        // transpose the matrix
        int [][] transpose = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);

        
     }
      public static void printMatrix(int[][] matrix ){
        System.out.println("the matrix is ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " " );
            }
        }
        System.out.println();
    }
    }

