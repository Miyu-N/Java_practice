public class Main {
  public static void main(String[] args) {
    int a;
    int b;
    a = 20;
    b = a + 5;
    System.out.println(a);
    System.out.println(b);

    // System.out.println("私の好きな記号は二重引用符(")です");
    // エスケープシーケンスを用いないと「私の好きな記号は二重引用符("」だけが文字列とみなされてしまいエラー
    System.out.println("私の好きな記号は二重引用符(\")です");
    a = 100;
    a++;
    System.out.println(a);

    float f =3;//float = 少しあいまいでもいい少数
    double d = f;//double = 普通の少数
    System.out.println(f); //3.0
    System.out.println(d); //3.0
    // 代入時の自動型変換が行われる

    //int i = 3.2;
    //int=普通の整数なので、「大きな型」の値を「小さな型」の変数に代入することはできない

    // 異なる型同士の算術演算
    double e = 8.5 / 2;
    long l = 5 + 2L;
    System.out.println(e);//2(int型)を2.0(double型)に変換
    System.out.println(l);//5(int型)を5L(long型)に変更
  }
}
