public class Circle {
    public static void main(String[] args) {
        // x^2 + y^2 = radius ^ 2

        int radius = 20;
        int frame = 3;

        int size = radius + frame;

        for (int y = size; y >= -size; y--) {
            for (int x = - size; x <= size; x++) {
                if((Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(radius, 2)){
                    System.out.print("MM");
                } else{
                    System.out.print("..");
                }
            }
            System.out.println();
        }
    }
}
