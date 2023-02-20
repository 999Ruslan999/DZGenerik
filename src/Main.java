public class Main {
    public static void main(String[] args) {



            String[] arr = new String[]{"abc", "abd", "def", "acf", "abc", "afx"};

             ISum iSum = (v) -> System.out.println(v);
             Reality reality = new Reality(iSum);
             reality.execute();

    }

@FunctionalInterface
     interface ISum <T> {
     int sum  (T abc, T arr);
    }
}

