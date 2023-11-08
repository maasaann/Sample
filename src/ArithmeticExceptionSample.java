public class ArithmeticExceptionSample {

    public static void main(String[] args) {

        //宣言と初期化
        int[] score = new int[5];

        //代入処理
        score[0] = 20;
        score[1] = 30;
        score[2] = 40;
        score[3] = 50;
        score[4] = 10;

    }


    public static int sumMethod2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}