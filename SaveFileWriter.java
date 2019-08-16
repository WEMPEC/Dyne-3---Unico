import java.util.EventObject;

public class SaveFileWriter {

  private String volt, cur, spd, torq;



  public SaveFileWriter(String volt, String cur, String spd, String torq) {

    this.volt = volt;
    this.spd = spd;
    this.cur = cur;
    this.torq = torq;
  }

  /**
   * @return the gender
   */
  public String getvolt() {
    return volt;
  }

  /**
   * @return the name
   */
  public String getspd() {
    return spd;
  }



  public String getcur() {
    return cur;
  }

  public String gettorq() {
    return torq;
  }

  public String getXMLinfo() {


    String info = "   <bar>\r\n" + "        <name>Volt</name>\r\n" + "        <value>" + volt
        + "</value>\r\n" + "    </bar>\r\n" + "    \r\n" + "    <bar>\r\n"
        + "        <name>Curr</name>\r\n" + "        <value>" + cur + "</value>\r\n"
        + "    </bar>\r\n" + "    \r\n" + "    <bar>\r\n" + "        <name>Speed</name>\r\n"
        + "        <value>" + spd + "</value>\r\n" + "    </bar>\r\n" + "    \r\n" + "    <bar>\r\n"
        + "        <name>Torq</name>\r\n" + "        <value>" + torq + "</value>\r\n"
        + "    </bar>\r\n" + "</PIU>";
return info;
  }
}
