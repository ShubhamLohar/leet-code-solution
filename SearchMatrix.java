public class SearchMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        int target = 50;
        boolean res = searchMatrix(matrix, target);
        System.out.println("res is : "+ res);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            int midValue = matrix[mid/col][mid%col];
            if(midValue < target) {
                left = mid+1;
            }else if (midValue > target) {
                right = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }

}
