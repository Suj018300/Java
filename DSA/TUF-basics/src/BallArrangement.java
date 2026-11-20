import java.util.Scanner;

public class BallArrangement {

    static int count = 0;

    static void arrange(int g, int y, int r, char last) {

            // Base case: all balls are placed
        if (g == 0 && y == 0 && r == 0) {
            count++;
            return;
        }

        // Place Green ball
        if (g > 0 && last != 'G') {
            arrange(g - 1, y, r, 'G');
        }

        // Place Yellow ball
        if (y > 0 && last != 'Y') {
            arrange(g, y - 1, r, 'Y');
        }

        // Place Red ball
        if (r > 0 && last != 'R') {
            arrange(g, y, r - 1, 'R');
        }
    }

}

