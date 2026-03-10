public class UC6{

	public static String[] getO()
	{
		String a[]={" *****  ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                " *****  "};
        return a;
	}
	public static String[] getP()
	{
		String b[]={"****** ",
                "**  ** ",
                "****** ",
                "**     ",
                "**     " };
                return b;
	}
		
	public static String[] getS()
	{
		String c[]={"****** ",
                "**     ",
                "****** ",
                "    ** ",
                "****** "};
        return c;
	}
    

    public static void main(String[] args) 
	{
        String[][] OOPSPattern={getO(),getO(),getP(),getS()};
            for (int i=0;i<5;i++)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print(OOPSPattern[j][i]+" ");
                }
                System.out.println(" ");
            }
     }
}