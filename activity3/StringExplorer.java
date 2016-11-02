/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
//         boolean x = true;
//         boolean y = false;
//         System.out.println(x&&y);
//         System.out.println(x||y);
//         System.out.println(!(x&&y));
//         System.out.println(!(x||y));
//         
//         int a = 3;
//         int b = 7;
//         if(a>5 && b>5)
//             System.out.println("both are >5");
//         System.out.println("testing");
//         
//         int c = 9;
//         int d =10;
//         if(c>5 && d>5)
//             System.out.println("both are >5");
//         System.out.println("testing");
//         
//         int e =8;
//         int f = 6;
//         do{
//             e--;
//             f--;
//         }while(e>5 && f>5);
//         System.out.println(e + " - " + f);
//         
//         int g = 14;
//         int h = 12;
//         do{
//             g--;
//             h--;
//         }while(g>5 || h>5);
//         System.out.println(g + " - " + h);

    String pStr = "I Like Puppies";
    String cStr = "Cats are useless";
    if(pStr.indexOf("Puppies") >= 0 && cStr.indexOf("Cats") >= 0)
        System.out.println("I Like cats");
    else
        System.out.println("I Like puppies");
    }

}
