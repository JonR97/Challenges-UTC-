package challenge19;

public class Challenge19 {
    
public static void main(String[] args) {
    
    int grid [][] = {
        {5,7,4,8,9,7,5,5,4,3,8,5,7,9,8,3,7,4,5,9,8,4,3,7,9,8,4,5,7,3,9,8,7},
        {5,7,4,8,3,9,7,5,8,9,3,7,9,4,8,5,7,9,3,4,7,5,9,8,3,7,8,4,5,7,3,8,9},
        {7,5,8,4,9,3,7,5,8,9,3,7,4,8,9,5,7,3,4,8,9,7,5,9,8,3,4,7,5,8,9,5,7},
        {1,0,2,9,8,3,1,0,9,8,1,9,0,8,3,2,9,8,1,0,9,2,8,3,9,8,3,9,1,2,8,3,9},
        {4,9,0,2,3,8,9,0,3,4,8,0,9,9,9,8,9,0,4,3,2,8,9,0,8,4,8,9,0,4,3,8,9},
        {0,9,1,3,8,9,0,8,1,5,4,8,9,3,0,8,5,9,6,7,5,8,9,4,2,4,9,8,3,9,3,9,3},
        {7,5,4,3,7,5,8,9,7,3,8,4,5,7,3,6,8,1,7,2,2,5,3,6,1,5,7,8,1,9,0,5,3}
        };    
    
        int product = 0;
        int highest = 0;
        
        
        //x = horizontal
        //y = vertical
        for(int x = 0; x<30; x++){
            for(int y = 0; y<7; y++){
                product = grid[y][x] * grid[y][x + 1] * grid[y][x + 2] * grid[y][x + 3];
                highest = product;
        }
        }
        
        for(int y = 0; y<4; y++){
            for(int x = 0; x<33; x++){
                product = grid[y][x] * grid[y + 1][x] * grid[y + 2][x] * grid[y + 3][x];
                if(product > highest){
                    highest = product;
            }
        }
        }
        
        for (int x = 0; x<30; x++){
            for (int y = 0; y<4; y++){
                product = grid[y][x] * grid[y + 1][x + 1] * grid[y + 2][x + 2] * grid[y + 3][x + 3];
                if(product > highest){
                    highest = product;
                }
        
        }
        }
        
        
                for (int x = 3; x<33; x++){
                    for (int y = 0; y<4; y++){
                        product = grid[y][x] * grid[y + 1][x - 1] * grid[y + 2][x - 2] * grid[y + 3][x - 3];
                        if(product > highest){
                            highest = product;
                }
        
        }
        }
                
                
                for(int x = 3; x<33; x++){
            for(int y = 0; y<7; y++){
                product = grid[y][x] * grid[y][x - 1] * grid[y][x - 2] * grid[y][x - 3];
                if(product > highest){
                    highest = product;
            }
        }
        }
                
                for(int y = 3; y<7; y++){
            for(int x = 0; x<33; x++){
                product = grid[y][x] * grid[y - 1][x] * grid[y - 2][x] * grid[y - 3][x];
                if(product > highest){
                    highest = product;
            }
        }
        }
       
        
        System.out.println("The highest product in the grid is: " + highest);
    

    }
    
}