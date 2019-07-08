import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javafx.scene.Node;

public class LoadquestionDataBase {
  // after parse the json, where to put, how to create a database?

  // fields
  ArrayList<Question> storeQuestion = new ArrayList<Question>(); // creating a data field for
   ArrayList<Boolean> isCorrect = new ArrayList<>();                                                        // storing the questions.


  /**
   * Reading the json file and parsing the information it contains
   * 
   * @param jsonFilepath
   * @return
   * @throws FileNotFoundException
   * @throws IOException
   * @throws ParseException
   */
  public List<Question> constructGraph(String jsonFilepath)
      throws FileNotFoundException, IOException, ParseException {

    // check if the file path is valid.
    File tempFile = new File(jsonFilepath);
    boolean checkValid = tempFile.exists();


    // adding them
    Object obj = new JSONParser().parse(new FileReader(jsonFilepath));
    JSONObject jo = (JSONObject) obj;
    JSONArray packages = (JSONArray) jo.get("questionArray");



    // parse the json file based on info in each array.
    for (int i = 0; i < packages.size(); ++i) {
      JSONObject jsonpackage = (JSONObject) packages.get(i);

      JSONArray choiceArray = (JSONArray) jsonpackage.get("choiceArray");


      // Store the element in json array into Arraylist.
      ArrayList<String> choices = new ArrayList<String>();

      ArrayList<Boolean> isCorrect = new ArrayList<>();

      // Add every predecessor vertex of packageName2 and the edges between them into the graph.
      for (int j = 0; j < choiceArray.size(); ++j) {
        // add the vertex into the adjacency list.
        JSONObject jsonChoicePackage =(JSONObject) choiceArray.get(j);
         String Singlechoice = (String)jsonChoicePackage.get("choice");
          // Adjacency lists add all depends no need to check duplication.
        choices.add(Singlechoice);
        String TrueorFalse = (String)jsonChoicePackage.get("isCorrect");
        if (TrueorFalse.equals("T")) {
          isCorrect.add(true);
        }
        else {
        isCorrect.add(false);}
      }


      String questionMetaData = (String) jsonpackage.get("meta-data");
      String questionText = (String) jsonpackage.get("questionText");
      String topic = (String) jsonpackage.get("topic");
      String image = (String) jsonpackage.get("image");


      // add the successor vertices into graph.
      // create the array list hold the dependency list (value) list.

      storeQuestion
          .add(new Question(questionMetaData, questionText, topic, image, choices, isCorrect));



      // System.out.println("LOAD" + storeQuestion.get(0).topic);
    }
    return storeQuestion;
  }

  public int getNumQuestion(List<Question> storeQuestion) {
    return storeQuestion.size();
  }
}
