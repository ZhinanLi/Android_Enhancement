package com.learn.enhancement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void integerTest() {
        // initialize
        String s1 = "Hello World";
        System.out.println("s1 is \"" + s1 + "\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1.");
        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int i = binarySearch(arr, 4);
        System.out.println(i);

    }

    private static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) return target;
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (left < right) {
            mid = (right - left) / 2 + left;

            if (target == arr[mid]) return mid;

            if (target < arr[left] && left < right) {
                if (target < arr[mid] && target > arr[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target < arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return mid;
    }


}