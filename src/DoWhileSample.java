
public class DoWhileSample {

    public static void main(String[] args) {

        //最初の1回目はtrue・falseに関係なく実行される
        //while文では、繰り返し処理が1度も実行されない可能性がある
        //do～while文は、最低でも必ず1度は繰り返し処理が実行される

        int num = 1; // 初期値設定

        do {
            // 2の倍数を計算
            num = num * 2;

            // 結果を出力
            System.out.println(num);
        } while (num < 1024); // 繰り返しの条件（numが1024より小さい間）

    }

}
