// Java program to print diamond pattern using recursion
 
class DiamondRecursion{
     
    static void gotonextLine(int k, int i, int z)
    {
        if (k == i) // base case
            return;
        System.out.print("* ");
        gotonextLine(k + z, i, z);
    }
    static void addblankSpaceInDiamond(int j, int i, int z) // print blank space of diamond
    {
        if (j == i)
            return;
        System.out.print(" ");
        addblankSpaceInDiamond(j + z, i, z);
    } 
    static void upperDiamond(int row, int i)
    {
        if (i > row) // base case
            return;
        addblankSpaceInDiamond(row, i, -1);
        gotonextLine(0, i, 1);
        System.out.print("\n");
        upperDiamond(row, i + 1); // recursive call
    }

    static void lowerDiamond(int row, int i) // print the next line of diamond
    {
        if (i > row) // base case
            return;
        addblankSpaceInDiamond(0, i, 1);
        gotonextLine(row, i, -1);
        System.out.print("\n");
        lowerDiamond(row, i + 1);
    }

    public static void main(String[] args)
    {
        int row;
        row = 6;
        upperDiamond(row, 0);
        lowerDiamond(row, 1);
    }
}
