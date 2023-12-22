/*
21.12.2023
1637 Widest Vertical Area Between Two Points Containing No Point (Medium)
Companies
Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that nopoints are inside the area.
A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
Note that points on the edge of a vertical area are not considered included in the area.
*/

import java.util.Arrays;

public class Task1637 {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] valuesX = new int[points.length];
        for (int i =0;  i < points.length; i ++ ){
            valuesX[i] = points[i][0];
        }
        Arrays.sort(valuesX);
        int max = 0 ;

        for (int i =0;  i < valuesX.length - 1; i++ ){
            max = Math.max(max, valuesX[i + 1] - valuesX[i]);

        }
        System.out.println(Arrays.toString(valuesX));
        return max;
    }


    public static void main(String[] args ){


        System.out.println(maxWidthOfVerticalArea (new int[][] {{1,2},{3,6}, {8,4}, {6, 2}}));

    }
}
