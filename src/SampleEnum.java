
public class SampleEnum {
    // 列挙型xxxの定義
    public static enum Abc {
        男性,
        女性
    }

    public static void main (String[] args) {
        
        // xxx型の変数の宣言と初期化
        Abc xxx0 = Abc.男性;
        Abc xxx1 = Abc.女性;
        
        // xxxの利用
        System.out.println(xxx0);
        System.out.println(xxx1);

        // 採番された数値を取得したい場合は 変数名.ordinal() と書く
        System.out.println(xxx0.ordinal());
        System.out.println(xxx1.ordinal());
    }
}