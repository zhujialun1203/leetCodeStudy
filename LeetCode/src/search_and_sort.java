import java.util.Arrays;

public class search_and_sort {

    /****************【题目】**************
     *
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     *
     * 说明:
     *
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     * 示例:
     *
     * 输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     *
     * 输出: [1,2,2,3,5,6]
      */

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }

        }

        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }


    /****************【 method 1 】**************
     *  for(int i=0;i<nums2.length;i++)
     *         {
     *
     *             nums1[nums1.length-i-1]=nums2[i];
     *
     *         }
     *         Arrays.sort(nums1);
     */

    }
}
