public class Reality {

    String[] arr = new String[]{"abc", "abd", "def", "acf", "abc", "afx"};
    private Main.ISum<String> callback;

    public Reality(Main.ISum<String> callback) {

        this.callback = callback;
    }

    public void execute() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = i;


        }
        System.out.println(count);

        callback.sum("abc",arr[3]);

        }

    }

}
