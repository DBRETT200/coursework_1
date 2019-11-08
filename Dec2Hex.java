import java.util.Scanner;

class Dec2Hex
{

    public static final Integer UserInput;

    public static void main(String args[])
    {
        if (args.length > 0) 
        {
            try 
            {
                UserInput = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

    if (UserInput != null)
    {
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                Integer rem;
                Integer num;
	num = UserInput;
	String hexadecimal=""; 
                System.out.println("Converting the Decimal Value " + num + " to Hex...");
     
                while(num != 0)
                {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
                    num= num/16;
               }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);
   }
   else
   {
     System.out.println("Error: No value to convert! Please enter a value");
   }
 }
}

