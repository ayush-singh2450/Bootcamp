package Algorithm;

public class MaxProdSubArray {
    public static void main(String[] args) {

        int arr[] = {2, 3, -2, 4};

        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {

            int a = arr[i];

            // if negative, max and min swap
            if(a < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(a, max * a);
            min = Math.min(a, min * a);

            ans = Math.max(ans, max);
        }

        System.out.println(ans);
    }
}
