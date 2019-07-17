import java.io.*;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;

public class ParseXml {

  private Node absNodeVDD;
  private NodeList absVDDList;
  private int[] sentVal;
  private int[] recVal;

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

      NodeList torqCalList = doc.getElementsByTagName("States");
      System.out.println("----------------------------");

      for (int temp = 0; temp < torqCalList.getLength(); temp++) {
        Node nNode = torqCalList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          // System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
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

      for (int temp = 0; temp < statusList.getLength(); temp++) {
        Node nNode = statusList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
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

}
