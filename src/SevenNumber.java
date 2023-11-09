
public class SevenNumber {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            String i_str = Integer.valueOf(i).toString();

                   if (i % 7 == 0) {
                System.out.println("clap!");
            } else if (i_str.matches(".*" + 7 + ".*")) {
                System.out.println("clap!");
            } else {
                System.out.println("i = " + i);
            }

        }
    }
}

/*
public class SevenNumber {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("clap!");
            } else {
                System.out.println(i);
            }

        }
    }
}
*/