public class ThreeMethods {
    public static void main(String[] args) {
        System.out.println("Целое число при деление: " + div(2, 1));
        System.out.println("Длина массива: " + arrayLength(new int[]{1,7,9}, 2));
    }


    public static int div(int a , int b) {
        if (b == 0) {
            throw new RuntimeException( "Нельзя делить на 0" );
        }
        return a/b;
    }

    public static int arrayLength (int[] arr, int limit){
        if (arr == null){
            throw new RuntimeException("Массив не задан");
        } else {
            if (arr.length < limit) {
            throw new RuntimeException("Длина массива меньше лимита");
            }
            return arr.length;
        }
    }


}