
public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "My Name is Zannatul Naim Nadim";
        System.out.println("s1 = "+s1);
        
        String s2 = s1.replace('N', 'S');
        System.out.println("s2 = "+s2);
        
        String [] s3 = s1.split(" ");
        for(String x : s3){
            System.out.println(x);
        }
    }
}
