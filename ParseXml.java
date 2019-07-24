import java.io.*;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;

public class ParseXml {

  private Node absNodeVDD;
  private NodeList absVDDList;
  private NodeList torqCalList;
  private int[] sentVal;
  private int[] recVal;
  private String[] states;
  private String[] torq;
private String [] configStatus;


  public ParseXml(File inputFile) throws ParserConfigurationException {
    // File inputFile = new File(fileName);

    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    try {
      Document doc = dBuilder.parse(inputFile);
      doc.getDocumentElement().normalize();
      System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

      absVDDList = doc.getElementsByTagName("values_to_Drive_Dsp");
      System.out.println("----------------------------");
      sentVal = new int[absVDDList.getLength()];
      recVal = new int[absVDDList.getLength()];

      for (int temp = 0; temp < absVDDList.getLength(); temp++) {
        Node nNode = absVDDList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          String name = eElement.getElementsByTagName("name").item(0).getTextContent();
          String sent = eElement.getElementsByTagName("sent").item(0).getTextContent();
          sentVal[temp] = Integer.parseInt(sent);

          String receive = eElement.getElementsByTagName("received").item(0).getTextContent();
          recVal[temp] = Integer.parseInt(receive);

          System.out
              .println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
          System.out
              .println("sent : " + eElement.getElementsByTagName("sent").item(0).getTextContent());
          System.out.println(
              "received  : " + eElement.getElementsByTagName("received").item(0).getTextContent());
          // System.out.println(
          // "Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
          // absNodeVDD.appendChild(eElement);


        }
        System.out.println("sentval in parse" + sentVal[2]);
      }

      NodeList torqDuo = doc.getElementsByTagName("Torq");
      System.out.println("----------------------------");
      torq = new String[torqDuo.getLength()];
      for (int temp = 0; temp < torqDuo.getLength(); temp++) {
        Node nNode = torqDuo.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          String torqVal = eElement.getElementsByTagName("value").item(0).getTextContent();
          torq[temp] = torqVal;
          System.out
              .println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
          System.out.println(
              "value : " + eElement.getElementsByTagName("value").item(0).getTextContent());
        }
      }


      NodeList limitList = doc.getElementsByTagName("Limits");
      System.out.println("----------------------------");

      for (int temp = 0; temp < limitList.getLength(); temp++) {
        Node nNode = limitList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          System.out
              .println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
          System.out.println(
              "value : " + eElement.getElementsByTagName("value").item(0).getTextContent());
        }
      }

      torqCalList = doc.getElementsByTagName("States");
      System.out.println("----------------------------");
      states = new String[torqCalList.getLength()];
      for (int temp = 0; temp < torqCalList.getLength(); temp++) {
        Node nNode = torqCalList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          String statesVal = eElement.getElementsByTagName("value").item(0).getTextContent();

          // System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
          states[temp] = statesVal;
          System.out
              .println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
          System.out.println(
              "value : " + eElement.getElementsByTagName("value").item(0).getTextContent());
          // System.out.println(
          // "Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
        }
      }

      NodeList statusList = doc.getElementsByTagName("Config_Status");
      System.out.println("----------------------------");
      configStatus = new String [statusList.getLength()];
      for (int temp = 0; temp < statusList.getLength(); temp++) {
        Node nNode = statusList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          
          Element eElement = (Element) nNode;
          String configVal = eElement.getElementsByTagName("status").item(0).getTextContent();
          configStatus [temp] = configVal;
          // System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
          System.out
              .println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
          System.out.println(
              "status : " + eElement.getElementsByTagName("status").item(0).getTextContent());
        }
      }



    } catch (Exception e) {
    }
  }

  /**
   * @return the configStatus
   */
  public String[] getConfigStatus() {
    return configStatus;
  }

  /**
   * @param configStatus the configStatus to set
   */
  public void setConfigStatus(String[] configStatus) {
    this.configStatus = configStatus;
  }

  /**
   * @return the absVDDList
   */
  public NodeList getAbsVDDList() {
    return absVDDList;
  }

  /**
   * @return the sentVal
   */
  public int[] getSentVal() {
    return sentVal;
  }

  /**
   * @param sentVal the sentVal to set
   */
  public void setSentVal(int[] sentVal) {
    this.sentVal = sentVal;
  }

  /**
   * @return the recVal
   */
  public int[] getRecVal() {
    return recVal;
  }

  /**
   * @param recVal the recVal to set
   */
  public void setRecVal(int[] recVal) {
    this.recVal = recVal;
  }

  /**
   * @return the states
   */
  public String[] getStates() {
    return states;
  }

  /**
   * @param states the states to set
   */
  public void setStates(String[] states) {
    this.states = states;
  }

  /**
   * @return the torq
   */
  public String[] getTorq() {
    return torq;
  }

  /**
   * @param torq the torq to set
   */
  public void setTorq(String[] torq) {
    this.torq = torq;
  }
}
