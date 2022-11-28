/User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);

        int max=arr[0],temp=1;

        for(int i=1;i<arr.length;i++){

            if(max<arr[i] && temp<k){

                max=arr[i];

                temp++;

            }

        }

        return max;
}
}
