
public class Clock {

    public static void main(String[] args) {

        int time = 18;
        int minute = 32;
        int second = 47;

        int total = cal(time,minute,second);

        System.out.println(total);

    }

    public static int cal(int num1, int num2, int num3) {
        int total = (num1 * 60 * 60) + (num2 * 60) + num3;
        return total;
    }

}
