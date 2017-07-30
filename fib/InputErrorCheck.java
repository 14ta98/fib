import java.io.*;
public class InputErrorCheck {

  public int check(String inputStr) {

      int inputNum = 0;
      if (inputStr == null || "".equals(inputStr)) {
        // System.out.println("引数を渡してください。");
      }
      else{
      	try{
      		inputNum = Integer.parseInt(inputStr);
      	}catch(Exception e){
      		// System.out.println("引数に整数を入力してください。");
      	}
      }
      return inputNum;
  }
}
