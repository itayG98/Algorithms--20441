import java.util.Arrays;

public class DiscoLight {

    public static class Disco{

        public boolean disco(boolean[] origin , boolean target[]){
            return disco(origin , target ,0);
        }

        private boolean disco(boolean[] origin, boolean[] target, int i) {
            if (Arrays.equals(origin, target))
                return true;
            if (i == origin.length)
                return false;
            press(origin,i);
            if (disco(origin,target,i+1))
                return true;
            press(origin,i);
            return disco(origin,target,i+1);

        }

        private void press(boolean[] origin,int i) {
            if(origin.length>i && i>=0)
                origin[i] = !origin[i];
            if (i>0)
                origin[i-1] = !origin[i-1];
            if (origin.length-1>i)
                origin[i+1] = !origin[i+1];
        }
    }
}
