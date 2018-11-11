public class DivisionOperarions extends Operations {
    double countDivideInt(){
        int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i <= ITER_COUNT; i++) {
            b1 = i % 3; if (b1 == 0) b1 = i%250+10;
            b2 = i % 11; if (b2 == 0) b2 = i%250+10;

            b3 = b1 / b2; if (b3 == 0) b3 = i%250+10;
            b4 = b2 / b3; if (b4 == 0) b4 = i%250+10;
            b5 = b3 / b4; if (b5 == 0) b5 = i%250+10;
            b6 = b5 / b4; if (b6 == 0) b6 = i%250+10;
            b7 = b6 / b5; if (b7 == 0) b7 = i%250+10;
            b8 = b6 / b7; if (b8 == 0) b8 = i%250+10;
            b9 = b7 / b8; if (b9 == 0) b9 = i%250+10;
            b10 = b8 / b9; if (b10 == 0) b10 = i%250+10;
            b11 = b9 / b10; if (b11 == 0) b11 = i%250+10;
            b12 = b10 / b11; if (b12 == 0) b12 = i%250+10;
            b13 = b11 / b12; if (b13 == 0) b13 = i%250+10;
            b14 = b12 / b13; if (b14 == 0) b14 = i%250+10;
            b15 = b13 / b14; if (b15 == 0) b15 = i%250+10;
            b16 = b14 / b15; if (b16 == 0) b16 = i%250+10;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countDivideDouble(){
        double b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i <= ITER_COUNT; i++) {
            b1 = i % 3; if (b1 == 0) b1 = i%250+10;
            b2 = i % 11; if (b2 == 0) b2 = i%250+10;

            b3 = b1 / b2; if (b3 == 0) b3 = i%250+10;
            b4 = b2 / b3; if (b4 == 0) b4 = i%250+10;
            b5 = b3 / b4; if (b5 == 0) b5 = i%250+10;
            b6 = b5 / b4; if (b6 == 0) b6 = i%250+10;
            b7 = b6 / b5; if (b7 == 0) b7 = i%250+10;
            b8 = b6 / b7; if (b8 == 0) b8 = i%250+10;
            b9 = b7 / b8; if (b9 == 0) b9 = i%250+10;
            b10 = b8 / b9; if (b10 == 0) b10 = i%250+10;
            b11 = b9 / b10; if (b11 == 0) b11 = i%250+10;
            b12 = b10 / b11; if (b12 == 0) b12 = i%250+10;
            b13 = b11 / b12; if (b13 == 0) b13 = i%250+10;
            b14 = b12 / b13; if (b14 == 0) b14 = i%250+10;
            b15 = b13 / b14; if (b15 == 0) b15 = i%250+10;
            b16 = b14 / b15; if (b16 == 0) b16 = i%250+10;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countDivideLong(){
        long b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i <= ITER_COUNT; i++) {
            b1 = i % 3; if (b1 == 0) b1 = i%250+10;
            b2 = i % 11; if (b2 == 0) b2 = i%250+10;

            b3 = b1 / b2; if (b3 == 0) b3 = i%250+10;
            b4 = b2 / b3; if (b4 == 0) b4 = i%250+10;
            b5 = b3 / b4; if (b5 == 0) b5 = i%250+10;
            b6 = b5 / b4; if (b6 == 0) b6 = i%250+10;
            b7 = b6 / b5; if (b7 == 0) b7 = i%250+10;
            b8 = b6 / b7; if (b8 == 0) b8 = i%250+10;
            b9 = b7 / b8; if (b9 == 0) b9 = i%250+10;
            b10 = b8 / b9; if (b10 == 0) b10 = i%250+10;
            b11 = b9 / b10; if (b11 == 0) b11 = i%250+10;
            b12 = b10 / b11; if (b12 == 0) b12 = i%250+10;
            b13 = b11 / b12; if (b13 == 0) b13 = i%250+10;
            b14 = b12 / b13; if (b14 == 0) b14 = i%250+10;
            b15 = b13 / b14; if (b15 == 0) b15 = i%250+10;
            b16 = b14 / b15; if (b16 == 0) b16 = i%250+10;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countDivideFloat(){
        float b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i <= ITER_COUNT; i++) {
            b1 = i % 3; if (b1 == 0) b1 = i%250+10;
            b2 = i % 11; if (b2 == 0) b2 = i%250+10;

            b3 = b1 / b2; if (b3 == 0) b3 = i%250+10;
            b4 = b2 / b3; if (b4 == 0) b4 = i%250+10;
            b5 = b3 / b4; if (b5 == 0) b5 = i%250+10;
            b6 = b5 / b4; if (b6 == 0) b6 = i%250+10;
            b7 = b6 / b5; if (b7 == 0) b7 = i%250+10;
            b8 = b6 / b7; if (b8 == 0) b8 = i%250+10;
            b9 = b7 / b8; if (b9 == 0) b9 = i%250+10;
            b10 = b8 / b9; if (b10 == 0) b10 = i%250+10;
            b11 = b9 / b10; if (b11 == 0) b11 = i%250+10;
            b12 = b10 / b11; if (b12 == 0) b12 = i%250+10;
            b13 = b11 / b12; if (b13 == 0) b13 = i%250+10;
            b14 = b12 / b13; if (b14 == 0) b14 = i%250+10;
            b15 = b13 / b14; if (b15 == 0) b15 = i%250+10;
            b16 = b14 / b15; if (b16 == 0) b16 = i%250+10;
        }
        timer.end();
        return timer.getTotalTime();
    }
    double countDivideShort(){
        short b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        timer.start();
        for (int i = 1; i <= ITER_COUNT; i++) {
            b1 = (short) (i % 3); if (b1 == 0) b1 = (short) (i%250+10);
            b2 = (short) (i % 11); if (b2 == 0) b2 = (short) (i%250+10);

            b3 = (short) (b1 / b2); if (b3 == 0) b3 = (short) (i%250+10);
            b4 = (short) (b2 / b3); if (b4 == 0) b4 = (short) (i%250+10);
            b5 = (short) (b3 / b4); if (b5 == 0) b5 = (short) (i%250+10);
            b6 = (short) (b5 / b4); if (b6 == 0) b6 = (short) (i%250+10);
            b7 = (short) (b6 / b5); if (b7 == 0) b7 = (short) (i%250+10);
            b8 = (short) (b6 / b7); if (b8 == 0) b8 = (short) (i%250+10);
            b9 = (short) (b7 / b8); if (b9 == 0) b9 = (short) (i%250+10);
            b10 = (short) (b8 / b9); if (b10 == 0) b10 = (short) (i%250+10);
            b11 = (short) (b9 / b10); if (b11 == 0) b11 = (short) (i%250+10);
            b12 = (short) (b10 / b11); if (b12 == 0) b12 = (short) (i%250+10);
            b13 = (short) (b11 / b12); if (b13 == 0) b13 = (short) (i%250+10);
            b14 = (short) (b12 / b13); if (b14 == 0) b14 = (short) (i%250+10);
            b15 = (short) (b13 / b14); if (b15 == 0) b15 = (short) (i%250+10);
            b16 = (short) (b14 / b15); if (b16 == 0) b16 = (short) (i%250+10);
        }
        timer.end();
        return timer.getTotalTime();
    }
}
