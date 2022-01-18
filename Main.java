public class Main
{
  public static void main(String[] args)
  {
    //EX2
    System.out.println ("HelloWorld");

    //EX3
    String module = "CSC1009";   
        switch(module)   
        {   
            case "CSC1009":   
                System.out.println("Object oriented programming"); 
                break;   
            case "CSC1006":
                System.out.println("Math2"); 
                break; 
            default:    
                System.out.println("Unknown module"); 
                break;   
        }   
        System.out.println("After switch");

        //EX4
        for(int i = 102; i >= 66; i-=1)
        {
          if(i%2>0)
          System.out.print(i+",");
        }
  }
};