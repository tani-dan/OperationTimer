public class SubstractionOperations extends Operations {
    double countSubstractInt() {
        int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i < ITER_COUNT; i++) {
            b1 = i % 3;
            b2 = i % 7;

            b3 = b1 - b2;
            b4 = b2 - b3;
            b5 = b3 - b4;
            b6 = b5 - b4;
            b7 = b6 - b5;
            b8 = b6 - b7;
            b9 = b7 - b8;
            b10 = b8 - b9;
            b11 = b9 - b10;
            b12 = b10 - b11;
            b13 = b11 - b12;
            b14 = b12 - b13;
            b15 = b13 - b14;
            b16 = b14 - b15;
        }
        timer.end();
        return timer.getTotalTime();
    }

    double countSubstractDouble() {
        double b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i < ITER_COUNT; i++) {
            b1 = i % 3;
            b2 = i % 7;

            b3 = b1 - b2;
            b4 = b2 - b3;
            b5 = b3 - b4;
            b6 = b5 - b4;
            b7 = b6 - b5;
            b8 = b6 - b7;
            b9 = b7 - b8;
            b10 = b8 - b9;
            b11 = b9 - b10;
            b12 = b10 - b11;
            b13 = b11 - b12;
            b14 = b12 - b13;
            b15 = b13 - b14;
            b16 = b14 - b15;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countSubstractLong() {
        long b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i < ITER_COUNT; i++) {
            b1 = i % 3;
            b2 = i % 7;

            b3 = b1 - b2;
            b4 = b2 - b3;
            b5 = b3 - b4;
            b6 = b5 - b4;
            b7 = b6 - b5;
            b8 = b6 - b7;
            b9 = b7 - b8;
            b10 = b8 - b9;
            b11 = b9 - b10;
            b12 = b10 - b11;
            b13 = b11 - b12;
            b14 = b12 - b13;
            b15 = b13 - b14;
            b16 = b14 - b15;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countSubstractFloat() {
        float b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i < ITER_COUNT; i++) {
            b1 = i % 3;
            b2 = i % 7;

            b3 = b1 - b2;
            b4 = b2 - b3;
            b5 = b3 - b4;
            b6 = b5 - b4;
            b7 = b6 - b5;
            b8 = b6 - b7;
            b9 = b7 - b8;
            b10 = b8 - b9;
            b11 = b9 - b10;
            b12 = b10 - b11;
            b13 = b11 - b12;
            b14 = b12 - b13;
            b15 = b13 - b14;
            b16 = b14 - b15;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countSubstractShort() {
        short b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i < ITER_COUNT; i++) {
            b1 = (short) (i % 3);
            b2 = (short) (i % 7);

            b3 = (short) (b1 - b2);
            b4 = (short) (b2 - b3);
            b5 = (short) (b3 - b4);
            b6 = (short) (b5 - b4);
            b7 = (short) (b6 - b5);
            b8 = (short) (b6 - b7);
            b9 = (short) (b7 - b8);
            b10 = (short) (b8 - b9);
            b11 = (short) (b9 - b10);
            b12 = (short) (b10 - b11);
            b13 = (short) (b11 - b12);
            b14 = (short) (b12 - b13);
            b15 = (short) (b13 - b14);
            b16 = (short) (b14 - b15);
        }
        timer.end();
        return timer.getTotalTime();
    }
}
