package Practice;

public class Practice01 {

    //定数
    private static final String _2KETA = "  ";
    private static final String _3KETA = "   ";

    public static void main(String[] args) {
        nineNine();
    }

    public static void nineNine() {
        for (int col = 0; col <= 9; col++) {
            for (int row = 0; row <= 9; row++) {
                if (col == 0) {
                    if (row == 0) {
                        System.out.print(_3KETA);
                    } else {
                        System.out.print(row + _2KETA);
                    }
                } else {
                    if (row == 0) {
                        System.out.print(col);
                    } else {
                        String result = String.valueOf(row * col);
                        String show = format(result);
                        System.out.print(show);
                    }
                }


            }
            System.out.println();

        }
    }


    public static String format(String target) {
        String changeFour = target.replace("4", "*");
        return String.format("%3s", changeFour);
    }

}



