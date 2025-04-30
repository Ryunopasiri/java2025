package j0430;

public class Main3 {
    public static void main(String[] args) {
        final double pi = 3.14; //円周率
        int pie = 5; //食べれるアップルパイの半径

        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * pi);
        System.out.println("パイの半径を倍にします");
        pie = 10; // 誤り！代入すべき変数「pie」
        System.out.println("半径" + pie + "cmのパイの面積は");
        System.out.println(pie * pie * pi);
    }
}
