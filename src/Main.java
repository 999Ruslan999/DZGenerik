public class Main {
    public static void main(String[] args) {

        String[] array = {"abc", "abd", "def", "acf", "afx", "abc"};
        Integer[] arrayInt = {34, 56, 78, 34, 3, 34, 34};


        ISum search = ((arr, str) -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == str) {
                    count++;
                }
            }
            return count;
        });
        int count = search.sum(array, "abc");
        System.out.println(count);

        ISum number = ((arr, str) -> {
            int count1 = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i] == str) {
                    count1++;
                }
            }
            return count1;
        });

        int count1 = number.sum(arrayInt, 34);
        System.out.println(count1);
    }

    @FunctionalInterface
    interface ISum<T> {
        int sum(T abc, T array);
    }
}

