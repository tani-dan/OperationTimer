import java.util.Random;

public class CycleOperations extends Operations {
    double countCycle() {
        int b1, b2;
        timer.start();
        for (int i = 1; i < ITER_COUNT; i++) {
            b1 = i % 3;
            b2 = i % 7;
        }
        timer.end();
        return timer.getTotalTime();
    }

    double countCycleDivide() {
        int b1, b2, b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0, b9 = 0, b10 = 0, b11 = 0, b12 = 0, b13 = 0, b14 = 0, b15 = 0, b16 = 0;
        timer.start();
        for (int i = 1; i <= ITER_COUNT; i++) {
            b1 = i % 3; if (b1 == 0) b1 = i%250+10;
            b2 = i % 7; if (b2 == 0) b2 = i%250+10;
            if (b3 == 0) b3 = i%250+10;
            if (b4 == 0) b4 = i%250+10;
            if (b5 == 0) b5 = i%250+10;
            if (b6 == 0) b6 = i%250+10;
            if (b7 == 0) b7 = i%250+10;
            if (b8 == 0) b8 = i%250+10;
            if (b9 == 0) b9 = i%250+10;
            if (b10 == 0) b10 = i%250+10;
            if (b11 == 0) b11 = i%250+10;
            if (b12 == 0) b12 = i%250+10;
            if (b13 == 0) b13 = i%250+10;
            if (b14 == 0) b14 = i%250+10;
            if (b15 == 0) b15 = i%250+10;
            if (b16 == 0) b16 = i%250+10;
        }
        timer.end();
        return timer.getTotalTime();
    }

}
