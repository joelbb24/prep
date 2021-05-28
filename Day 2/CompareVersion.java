


public class CompareVersion
{

    public static int compareVersion(String version1, String version2)
    {
        String[] s1 = version1.split(".");
        String[] s2 = version2.split(".");
        
        int n = Math.min(s1.length, s2.length);
        
        for(int i=0; i<n; i++) 
        {
            int ver1 = Integer.parseInt(s1[i]);
            int ver2 = Integer.parseInt(s2[i]);
            System.out.print(ver1+" "+ver2); 
            if(ver1 < ver2)
                return -1;
            else if (ver1 > ver2)
                return 1;
            else
                continue;
        }
        
        
        return 0;
        
    }

    public static void main(String[] args)
    {
        String version1 = "7.5.3.4";
        String version2 = "2.5.3";
        String[] s1 = version1.split(".");
        String[] s2 = version2.split(".");
        for(int i=0; i<s1.length;i++);
        {
            System.out.println(s1[i]); 
        }
       // System.out.println(compareVersion(version1, version2));
    }
}
