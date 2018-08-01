import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretSanta {

  /**
   * @param names
   *          list of all people participating in the draw.
   * @return list of each person's Secret Santa!
   */
  public List<String> generateAssignments(List<String> participants) {
    List<String> assignments = new ArrayList<String>();
    assignments.addAll(participants);

    do {
      Collections.shuffle(participants);
    }

    while (!checkAssignment(participants, assignments));

    return assignments;
  }

  /**
   * @return false if a person is assigned to themself, else true
   *
   */
  public boolean checkAssignment(List<String> participants, List<String> assignments) {
    for (String participant : participants) {
      if (participant.equals(assignments.get(participants.indexOf(participant)))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Print results of Secret Santa
   */
  public void printResults(List<String> participants, List<String> assignments) {
    String result = "\nResults\n";

    for (String participant : participants) {
      result += "\n" + participant + "   ------>   " + assignments.get(participants.indexOf(participant));
    }

    System.out.println(result);
  }
}