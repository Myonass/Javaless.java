package task.task1;


public class task1 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean positive = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    positive = false;
                    break;
                }
            }

            if (positive) {
                System.out.println(i);
            }
        }
    }
}

