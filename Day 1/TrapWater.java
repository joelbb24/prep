



public class TrapWater 
{
    public static int trap(int[] height)
    {
        int res = 0;
        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        if(n==0)
            return 0;
        
        lmax[0] = height[0];
        for(int i=1; i<n; i++)
            lmax[i] = Math.max(height[i], lmax[i-1]);

        rmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
            rmax[i] = Math.max(height[i], rmax[i+1]);

        for(int i=0; i<n; i++)
            res = res + (Math.min(lmax[i], rmax[i]) - height[i]);

        return res;

    }


    public static void main(String [] args)
    {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
