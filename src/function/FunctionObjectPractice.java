package function;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;

public class FunctionObjectPractice {
    public static void main(String[] args) {

        //奇数か偶数を判定
//        Predicate<Integer> KisuGusu = a -> a % 2 == 0;
//        System.out.println(KisuGusu.test(3));

        //与えられた文字列を反転させる
//        Function<String, String> hanten = b -> new StringBuilder(b).reverse().toString();
//        String str = "abcdefg";
//        System.out.println(hanten.apply(str));

        //与えられた文字列を指定した区切り文字で分割し、分割後の文字列の配列を返す
//        String scp1 = "apple,banana,grape";
//        String scp2 = ",";
//        Function<String, String[]> splitter = c -> c.split(scp2);
//        String[] result = splitter.apply(scp1);
//        System.out.println(Arrays.toString(result));

        //与えられた整数値を指定された回数分だけ2倍にする
//        var ap = 8;
//        var pp = 3;
//
//        UnaryOperator<Integer> ppap = x -> x * 2;
//
//        for (var i = 0; i < pp; i++){
//            ap = ppap.apply(ap);
//        }
//        System.out.println(ap);

        //与えられた文字列を指定された数だけ繰り返し連結する
        var d4c = "dirty";
        var stand = 4;

        BiFunction<String, Integer, String> love = (d, e) -> {
            StringBuilder f = new StringBuilder();
            for (var i = 0; i < e; i++) {
                f.append(d);
            }
            return f.toString();
        };
        String train = love.apply(d4c, stand);
        System.out.println(train);
    }

}
