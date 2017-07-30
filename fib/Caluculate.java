// package fib.fibo02;
public class Caluculate {
  // フィボナッチ数列の処理
  public static void calFib(int inputNum) {
    int a = 0;
    int b = 1;
    int c = 0;
    int[] resultNums = new int[inputNum];
    for (int i = 0; i < inputNum;  i++) {
      resultNums[i] = a;
      c = a + b;
      a = b;
      b = c;
    }
    String totalNum = "";
    for (int j : resultNums) {
      totalNum += j + " ";
    }
      System.out.println(inputNum + " 番目のフィボナッチ数: " + resultNums[resultNums.length - 1]);
      System.out.println(inputNum + " 番目までのフィボナッチ数列: " + totalNum);
    }
  // システムエラーで落ちないようにする
  // try {
  //   //
  //   if (args == null || args.length == 0) {
  //     System.out.println("引数を渡してください。");
  //     return;
  //   }
  //   //
  //   int inputNum = translate(args[0]);
  //   if(inputNum == 0){
  //     return;
  //   }
  //   //
  //   Caluculate calc = new Caluculate();
  //   calc.fib(inputNum);
  //
  // } catch(Exception e) {
  //   System.out.println("システムエラーが生じました。");
  // }
  // public static int translate(String str){
  //     int result = 0;
  //     try{
  //       result = Integer.parseInt(str);
  //     }catch(Exception e){
  //       System.out.println("引数に整数を入力してください");
  //     }
  //
  //     return result;
  // }

}
