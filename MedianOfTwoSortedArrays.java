public class MedianOfTwoSortedArrays {
   public double findMedian(int[] nums1, int[] nums2) {
      int i = 0, j = 0, index = 0, start, take = 1, m = nums1.length, n = nums2.length, len = m + n;
      double median = -1;
      if (len % 2 != 0) {
         start = len / 2;
      } else {
         start = len / 2;
         take = 2;
      }

      while (i < m && j < n) {
         index++;
         if (nums1[i] > nums2[j]) {
            j++;
         } else if (nums1[i] < nums2[j]) {
            i++;
         } else {
            i++;
            j++;
            index++;
         }

         if (start == index) {
            if (take == 1) {
               if (index == i - 1) {
                  median = nums1[index];
               } else if (index == j - 1) {
                  median = nums2[index];
               }
            } else {
               if (index == i - 1) {
                  median = (nums1[index] + nums1[index + 1]) / 2; // check if index + 1 is present
               } else if (index == j - 1) {
                  median = (nums2[index] + nums1[index + 1]) / 2;
               }
            }
         }
      }

      return median;
   }
}
