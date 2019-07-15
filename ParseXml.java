import java.io.*;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;

public class ParseXml {

  public ParseXml(File inputFile) throws ParserConfigurationException {
    // File inputFile = new File(fileName);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    try {
      Document doc = dBuilder.parse(inputFile);
      doc.getDocumentElement().normalize();
      System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
      NodeList nList = doc.getElementsByTagName("values_to_Drive_Dsp");
      System.out.println("----------------------------");

      for (int temp = 0; temp < nList.getLength(); temp++) {
        Node nNode = nList.item(temp);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          System.out
              .println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
          System.out
              .println("sent : " + eElement.getElementsByTagName("sent").item(0).getTextContent());
          System.out.println(
              "received  : " + eElement.getElementsByTagName("received").item(0).getTextContent());
          // System.out.println(
          // "Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
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

}
