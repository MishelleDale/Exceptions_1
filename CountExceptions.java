public class CountExceptions {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "1", "8", "4"}, {"1", "0", "0", "3"}, {"3", "2", "1", "2"},{"1", "1", "8", "4"}};
        System.out.println(sum2d(arr));
    }
    
    public static int sum2d(String[][] arr){
        if (arr == null){
            throw new RuntimeException("Array is nor initialized");
        }

        if (arr.length != arr[0].length){
            throw new RuntimeException("Array is not square");
        }

        if (arr.length < 5){
            throw new RuntimeException("Array is less than 5");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum +=val;
            }
        }
        return sum;
    }
}
