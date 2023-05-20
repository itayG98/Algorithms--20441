import java.util.Arrays;

public class DiscoLight {

    static class Disco {

        public static boolean disco(boolean[] origin, boolean[] target) {
            return disco(origin, target, 0);
        }

        private static boolean disco(boolean[] origin, boolean[] target, int i) {
            if (equalsArrays(origin, target))
                return true;
            if (i == origin.length)
                return false;
            press(origin, i);
            if (disco(origin, target, i + 1))
                return true;
            press(origin, i);
            return disco(origin, target, i + 1);

        }

        private static void press(boolean[] origin, int i) {
            if (origin.length > i && i >= 0)
                origin[i] = !origin[i];
            if (i > 0)
                origin[i - 1] = !origin[i - 1];
            if (i < origin.length - 1)
                origin[i + 1] = !origin[i + 1];
        }

        public static boolean equalsArrays(boolean[] arr1 , boolean[] arr2){
            return arr1.length == arr2.length && equalsArrays(arr1,arr2,0);
        }

        private static boolean equalsArrays(boolean[] arr1, boolean[] arr2, int i) {
            if( i == arr1.length )
                return true;
            if (arr1[i] != arr2[i])
                return false;
            return equalsArrays(arr1,arr2,i+1);
        }
    }
}
