public class App {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100000;
        }
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thuat toan chay: " + stopWatch.getElapsedTime());
    }

    public static void swap(double n1, double n2) {
        double temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void selectionSort(double[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                    swap(arr[min], arr[i]);
                }
            }
        }
    }
}
