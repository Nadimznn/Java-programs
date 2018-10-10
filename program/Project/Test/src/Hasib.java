/*
    private String name ;
    private int age ;
    private double salary ; 
    private float height;
    private String address;

    // Encapsulations
    private double taka = 9000000.0 ;
    
    public double getTaka( ){ // read 
        return taka ;
    }
    public void setTaka( int t ){ // write or update 
        taka = t ;
    }

*/

class Human 
{
    public void married(){
        System.out.println("Married - Jorina");
    }
}
public class Hasib extends Human 
{
    public static void main(String[] args) 
    {
        Hasib h = new Hasib();
        h.married();
    }
    public void married()
    {
        System.out.println("Married - Nusrat");
    }
}

/* 

        //System.out.println( h.taka );
         // h.getTaka();
        //System.out.println( h.getTaka() + "\n");
         
        //h.setTaka( 5000 );
        //System.out.println( h.getTaka() );
   
       //System.out.println( h.name +"\n"+ h.age +"\n" + h.height + "\n" + h.salary );

    //==========================
    int []x =new int []{7,6,5,4,3,2,1};
    int humpty =0;

    for (int i=0; i<x.length-1;i++)
    {
        System.out.println("x ["+i+"]= " +x[i]+i); //  "  ooo  "+	
        if (x[i]>x[i+1]) humpty = x[i];
    }

    System.out.println("Humpty says: " + humpty);
       


*/
