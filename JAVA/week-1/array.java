public class array {
    public static void main(String[] args) {
    int a[]={10,20,30},sum=0;
    System.out.println("ARRAY Created");
    for(int i=0;i<3;i++)
    {
        System.out.print(a[i]+",");
        sum+=a[i];
    }
    System.out.println("\nsum is "+sum);
}

}
