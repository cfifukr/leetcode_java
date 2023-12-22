import java.util.Arrays;

public class TaskFour {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;


        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) {
                    m1 = nums2[j++];
                } else {
                    m1 = nums1[i++];
                }
            } else if (i < n) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
            System.out.println(m1 +" " +   m2);
        }

        if ((n + m) % 2 == 1) {
            return (double) m1;
        } else {
            double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
    }

    public static void main(String[] args){
        System.out.println("Result - " + findMedianSortedArrays(new int[] {1,2,3,4,5,6,7,9,0}, new int[] {2, 4, 6, 8,10, 12, 14, 16}));
    }
}
