package Day_2.Post_Lunch;

public class Two_DimensionArray {
        public static void main(String[] args) {
        
            int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            System.out.println("Elements of the 2D array:");
    
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.print(twoDArray[i][j] + " ");
                }
                System.out.println(); 
            }
        }
    }
    
    

