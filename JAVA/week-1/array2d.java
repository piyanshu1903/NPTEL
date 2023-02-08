public class array2d {
    public static void main(String[] args) {
        int arr[][][] = new int [5][5][5];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int k=0;k<5;k++)
                {
                    arr[i][j][k]=k;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }


    }
    
}
