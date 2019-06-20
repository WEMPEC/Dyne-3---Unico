import java.util.EventObject;

public class FormEvent extends EventObject {

  private String name;
  private String job;
  private int ageEvent;
  private String employ;
  private boolean citizen;
  private String taxID;
  private String gender;


  public FormEvent(Object arg0) {
    super(arg0);
    // TODO Auto-generated constructor stub
  }

  public FormEvent(Object arg0, String name, String job, int age, String employ, boolean citizen,
      String taxid, String gender) {
    super(arg0);
    this.name = name;
    this.job = job;
    this.ageEvent = age;
    this.employ = employ;
    this.citizen = citizen;
    taxID = taxid;
    this.gender = gender;
    // TODO Auto-generated constructor stub
  }

  /**
   * @return the gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the job
   */
  public String getJob() {
    return job;
  }

  /**
   * @param job the job to set
   */
  public void setJob(String job) {
    this.job = job;
  }

  public int getAge() {
    return ageEvent;
  }

  public String getEmploy() {
    return employ;
  }

  /**
   * @return the citizen
   */
  public boolean isCitizen() {
    return citizen;
  }

  /**
   * @return the taxID
   */
  public String getTaxID() {
    return taxID;
  }
}
