package backtracking;

import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] board = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j] = -1;
        
    
        int move_x[] = {2,1,-1,-2,-2,-1,1,2}; //types of moves in the x direction
        int move_y[] = {1,2,2,1,-1,-2,-2,-1}; //types of moves in the y direction. Moves are in 2D, but separately
        board[0][0]=0; // position []0[0] has already been visited hence mark it with 0. 
        int pos = 1; // 1 based counter for moves (1 to 25)
    
        if(!knightTour(board,n,move_x, move_y,0,0,pos)) //if final returned value is false, then no solution present
            System.out.println("No solution");
        else{
            for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++){
                     System.out.print(board[i][j]+" "); // Otherwise if true, Print the board
                }
                System.out.println();
            }   
        }
        
                   
    }

    private static boolean knightTour(int[][] board,int n, int[] move_x, int[] move_y, int curr_x, int curr_y, int pos) {
        
        if(pos==n*n)
            return true;
            for(int i=0;i<8;i++){ //8 is the max number of possible moves
                int new_x = curr_x + move_x[i]; //new x coordinate after move
                int new_y = curr_y + move_y[i]; //new y coordinate after move
                if(isValid(board,n,new_x, new_y)){ //check if move is valid and if yes find more moves recursibvely.  
                    board[new_x][new_y] = pos;
                    if(knightTour(board, n, move_x, move_y, new_x, new_y, pos+1)) // If the recursion calls complete, return true,
                        return true;
                    board[new_x][new_y]= -1; // otherwise remove previously added and backtrack- mark it as unvisited
                }
            }
        return false;
    }

    private static boolean isValid(int[][] board, int n, int x, int y) {
        if(x>=0 && y>=0 && x<n && y<n && board[x][y]==-1){ //constraints as per question statement
            return true;
        }
        return false;
    }
}
