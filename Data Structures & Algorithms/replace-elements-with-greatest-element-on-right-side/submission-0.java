class Solution {
    public int[] replaceElements(int[] arr) {
        int[] results = new int[arr.length];

        for(int x = 0; x < arr.length; x++){
            results[x] = rightSideMax(x+1, arr.length-1, arr);
        }

        return results;
    }

    public int rightSideMax(int start, int end, int[] array) {
        int max = -1;

        for(int x = start; x <= end; x++){
            if(array[x] > max){
                max = array[x];
            }
        }

        return max;
    }
}