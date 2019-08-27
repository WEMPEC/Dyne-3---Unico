import java.io.*;

public class backendParse {

  private String fileinfo;
  
  public backendParse(String execStr) {
 try {
      // run process and capture stdout
      Process p = Runtime.getRuntime().exec(execStr);
      InputStream s = p.getInputStream();

      // convert stdout to a string
      BufferedReader bufferReader = new BufferedReader(new InputStreamReader(s));
      StringBuffer stringBuffer = new StringBuffer();
      String line;
      while ((line = bufferReader.readLine()) != null) {
        stringBuffer.append(line).append("\n");
      }
      String output = stringBuffer.toString();

      p.destroy();
      fileinfo = output.toString();

    } catch (Exception e) {
      // actually handle the error here
      e.printStackTrace();
      fileinfo = String.format("*** Running \"%s\" failed. ***", execStr);
    }
  }

}
