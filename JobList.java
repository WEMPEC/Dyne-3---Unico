
/**
 * @author Katy Dong
 *
 */
public class JobList implements WaitingListADT<JobNode> {
  // Fields
  private JobNode head; // head of list
  private int size; // Number of jobs in the list

  /**
   * Default constructor creates an empty JobList
   */
  public JobList() {
    this.head = null;
    this.size = 0;
  }

  /**
   * Creates a JobList with a given job as a head
   */
  public JobList(JobNode job) {
    head = job;
  }

  /**
   * Helper method that gets the reference of head.
   * 
   * @return the head
   */
  public JobNode getHead() {
    return head;
  }

  /**
   * Helper method that sets the reference of head to the given head.
   * 
   * @param head the head to set
   */
  public void setHead(JobNode head) {
    this.head = head;
  }

  /**
   * Helper method that gets the size of Lists.
   * 
   * @return the size
   */
  public int getSize() {
    return size;
  }

  /**
   * Helper method that sets the size of the list to a given value.
   * 
   * @param size the size to set
   */
  public void setSize(int size) {
    this.size = size;
  }

  /*
   * (non-Javadoc)
   * 
   * @see WaitingListADT#schedule(java.lang.Object)
   */
  @Override
  public void schedule(JobNode newJob) {
    // schedule adds newJob at the end of the list if its priority equals 0. If the arriving newJob
    // is of priority 1, it should be added before all the existing jobs of priority 0 if any, and
    // after the existing jobs of sme priority 1 if any
    if (!isEmpty()) {
      if (newJob.getPriority() == 1) {
        // If the priority of the newJob is 1, add it before all the existing jobs of priority 0.
        JobNode runner = head;
        JobNode prevRunner = null;
        while (runner != null && runner.getPriority() != 0) {
          // traverse the list if runner is not and the priority of the current node is not equal to
          // 0.
          prevRunner = runner;
          runner = runner.getNext();
        }

        newJob.setNext(runner);
        if (runner != head) {
          // If the runner is not at head, add the newJob after the previous runner.
          prevRunner.setNext(newJob);
        } else {
          // If the runner is at head, add the newJob at the beginning of the list.
          head = newJob;
        }
      } else {
        // if the newJob's priority is not equal to 1, the newJob shall be add to the end of the
        // list.
        JobNode runner = head;
        while (runner.getNext() != null) {
          // traverse the list
          runner = runner.getNext();
        }
        runner.setNext(newJob);
      }
    } else {
      // if the list is empty, the newJob would be the head of the list.
      head = newJob;
    }
    ++size;
  }



  /*
   * (non-Javadoc)
   * 
   * @see WaitingListADT#size()
   */
  @Override
  public int size() {
    int size = 0;
    if (!isEmpty()) { // if the list is not empty, traverse it and count the number of elements
      JobNode runner = head; // initialize the runner to the head of the list
      size++;
      while (runner.getNext() != null) { // traverse the list
        size++;
        runner = runner.getNext();
      }
    }
    this.size = size;
    return size;
  }

  /*
   * (non-Javadoc)
   * 
   * @see WaitingListADT#isEmpty()
   */
  @Override
  public boolean isEmpty() {
    return head == null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see WaitingListADT#clean(float)
   */
  @Override
  public int clean(float cleaningTime) {
    int cleanItem = 0;
    int index = 0;
    // Check the condition is the list is not empty.
    if (!isEmpty()) {
      JobNode runner = head;
      // Traverse every items in the list.
      while (runner != null) { // traverse the list
        if ((runner.getTimeToLive() + runner.getArrivalTime()) < cleaningTime) {
          runner = runner.getNext();
          remove(index);
          ++cleanItem;
          --size;
          if (size == 0) {
            isEmpty();
          }
        } else {
          runner = runner.getNext();
          index++;
        }
      }
    }
    return cleanItem;
  }


  /**
   * This method removes the item from the list that has the given index.
   * 
   * @param index represents the element at which index will be removed.
   */
  public void remove(int index) {
    // if the index is in the range of the list, remove the element at that index.
    if (index >= 0 && index < size) {
      if (isEmpty())
        return;
      else if (index == 0) {
        // if the inde is equal to 0, remove the node at the head of the list
        head = head.getNext();
        return;
      } else {
        // otherwise, create a runner to tarverse the list until it reaches the index -1.
        JobNode runner = head;
        int inx = 0;
        while (inx < index - 1) {
          runner = runner.getNext();
          inx++;
        }
        // remove node of index inx+1 from the list
        runner.setNext(runner.getNext().getNext());
        return;
      }
    } else
      //
      throw new IndexOutOfBoundsException("\nWARNING: Index " + "should be from 0 to "
          + (size() - 1) + "!" + "current index" + index);
  }

  /*
   * (non-Javadoc)
   * 
   * @see WaitingListADT#clear()
   */
  @Override
  public void clear() {
    head = null;
    size = 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see WaitingListADT#duplicate()
   */
  @Override
  public WaitingListADT<JobNode> duplicate() {
    JobList duplicateList = new JobList();
    JobNode runner = head;
    while (runner != null) {
      if (duplicateList.isEmpty()) {
        duplicateList.head = runner.copy();
      } else {
        // add an element at the end of the duplicateList
        JobNode runnerForDuplicate = duplicateList.head;
        while (runnerForDuplicate.getNext() != null) {
          // traverse the list
          runnerForDuplicate = runnerForDuplicate.getNext();
        }
        runnerForDuplicate.setNext(runner.copy());

      }
      ++duplicateList.size;
      runner = runner.getNext();
    }

    return duplicateList;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {

    StringBuilder result = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    JobNode runner = head;
    result.append("Job List is empty: " + isEmpty() + newLine);
    result.append("The size is: " + size + " job(s)." + newLine);
    // traverse the list
    while (runner != null) {
      result.append("job #" + runner.getJobId() + " : " + runner.getDescription() + " (UID "
          + runner.getUserId() + ") " + runner.getPriority() + newLine);
      runner = runner.getNext();
    }
    // It returns a string that textually represents the objects.
    return result.toString();
  }
}


