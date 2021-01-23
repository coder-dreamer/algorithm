package sort;

/**
 * 冒泡排序
 *
 * @author 53137
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {9, 3, 4, 7, 2, 1, 0, 8, 6};
        BubbleSort.sort(arr);
        BubbleSort.print(arr);
    }

    public static void sort(Comparable[] arr) {
        System.out.println("原始值");
        BubbleSort.print(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "次");
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.println("待比较值");
                System.out.println("值1:" + arr[j]);
                System.out.println("值2:" + arr[j + 1]);
                if (BubbleSort.compare(arr[j], arr[j + 1])) {
                    BubbleSort.exchange(j, j + 1, arr);
                }
                System.out.println("比较后结果");
                BubbleSort.print(arr);
            }
            System.out.println("第" + (i + 1) + "次排序结果");
            BubbleSort.print(arr);
        }
    }

    private static boolean compare(Comparable o1, Comparable o2) {
        return o1.compareTo(o2) > 0;
    }

    private static void exchange(int cur, int next, Comparable[] arr) {
        Comparable temp = arr[cur];
        arr[cur] = arr[next];
        arr[next] = temp;
    }

    private static void print(Comparable[] arr) {
        for (Comparable comparable : arr) {
            System.out.print(comparable + "_");
        }
        System.out.println();
    }
}
