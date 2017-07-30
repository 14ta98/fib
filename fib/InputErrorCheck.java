// java.ioパッケージに含まれている全てのクラスとインターフェイスをimportする。
import java.io.*;
public class InputErrorCheck {

  public int check(String inputStr) {
      int inputNum = 0;
      if (inputStr == null || "".equals(inputStr)) {
      }
      else{
      	try{
      		inputNum = Integer.parseInt(inputStr);
      	}catch(Exception e){
      	}
      }
      return inputNum;
  }
}
