package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        final int placeholder = 8;
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (sideLength / 2 == i) {
                    System.out.print(placeholder);
                } else if (sideLength / 2 == j) {
                    System.out.print(placeholder);
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
}
