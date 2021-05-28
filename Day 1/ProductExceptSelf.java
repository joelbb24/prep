



public class ProductExceptSelf
{


    public static int[] productExceptSelf(int[] nums)
    {
        int product = 1;
        int[] res = new int[nums.length];

        for(int i=0; i<nums.length;i++)
        {
            product = product * nums[i];
        }

        for(int i=0; i<res.length;i++)
        {
            res[i] = product/nums[i];
        }

        return res;
    }

    public static void main(String [] args)
    {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        for(int i = 0; i < res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
    }

}
