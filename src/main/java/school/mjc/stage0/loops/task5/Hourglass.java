package school.mjc.stage0.loops.task5;

public class Hourglass {
//   0 0123456
//   1  1234
//   2   23
//   3   23
//   4  1234
//   5 0123456
    public void printHourglassOfGivenSize(int height) {
        final int placeholder = 8;

        for (int i = 0; i < height; i++) {
            if (i >= height / 2) {
                final int bound = height - i;
                for (int j = 0; j < height; j++) {
                    if (j >= bound - 1 && j <= height - bound) {
                        System.out.print(placeholder);
                    } else {
                        System.out.print(' ');
                    }
                }
            } else {
                for (int j = 0; j < height; j++) {
                    if (j >= i && j <= height - i - 1) {
                        System.out.print(placeholder);
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
