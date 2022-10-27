package homework_practices;

public class findTheBiggestDiagonal {
    public static void main(String[] args) {
        int [][] numbers = {
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };
        int firstDiagonal = numbers[0][0] + numbers[1][1] + numbers[2][2];
        int secondDiagonal = numbers[0][2] + numbers[1][1] + numbers[2][0];
        if(firstDiagonal>secondDiagonal){
            System.out.println("Biggest diagonal is: " + numbers[0][0] + "," + numbers[1][1] + "," + numbers[2][2]);
        }else{
            System.out.println("Biggest diagonal is: " + numbers[0][2] + "," + numbers[1][1] + "," + numbers[2][0]);
        }
    }
}
    /*
    Given a 2D array with values:
    {3, 5, 1}
    {1, 6, 10}
    {5, 21, 10}
    Calculate and find the biggest diagonal
    if an array was
    a b c
    d e f
    g h i
    aei and ceg would be the diagonals
     */