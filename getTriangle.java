public class getTriangle
{  
  public static void main(String[] args)
  {   
      String ch = "*";
      int n = 6;
      getline( ch , n );
      int linecount = 6;
      printTriangle(linecount);
  
  }
    public static String getline( String ch , int n )
    {   
        String qstr = "";  
 
        for(int i = 1; i <= n; i++)
        {
            qstr = qstr + ch; 
        }
        return qstr;
    }
       
 
    
    public static void printTriangle(int linecount) 
    {
        int spacecount = linecount - 1;
        int starcount = 1;
        for(int j = 0; j < linecount; j++)
        {
            String space = " ";
            String star = "*";
            System.out.println( getline(space , spacecount) + getline(star , starcount) + getline(space , spacecount) );
            spacecount = spacecount - 1;
            starcount = starcount + 2;
        }
    }
}

