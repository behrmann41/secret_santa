import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class SecretSanta {

  State state = new State();

  /**
   * @param names
   *          list of all people participating in the draw.
   * @return list of each person's Secret Santa!
   */
  public List<String> generateAssignments(List<String> participants, Integer idx) {
    List<String> assignments = new ArrayList<String>();
    Boolean initial = idx == 0;

    assignments.addAll(participants);

    do {
      Collections.shuffle(participants);
    }

    while (!checkAssignment(participants, assignments)); // add additional check against state

    return assignments;
  }

  /**
   * @return false if a person is assigned to themself, else true
   *
   */
  public boolean checkAssignment(List<String> participants, List<String> assignments) {
    for (String participant : participants) {
      String match = assignments.get(participants.indexOf(participant));
      // first check if two match
      if (participant.equals(match)) {
        return false;
      }
      // if its the first round lets add all matches to the map;
    }
    return true;
  }

  /**
   * @param participants
   *          List of names
   * @param assignments
   *          List of paired names
   */

  // TODO: Fix
  public boolean checkPairingAmounts(List<String> participants, List<String> assignments, Boolean initial) {
    HashMap<String, Integer> assignment;
    for (String participant : participants) {
      String match = assignments.get(participants.indexOf(participant));
      if (initial) {
        state.addToMap(participant, match);
        continue;
      }

      if (!initial) {
        assignment = state.getAssignments(participant);
        if (!state.checkAssignments(participant) || assignment == null) {
          state.addToMap(participant, match);
          continue;
        }

        if (assignment.get(match) < 3) {
          assignment.put(match, assignment.get(match) + 1);
          return false;
        } else {
          assignment.put(match, 1);
          continue;
        }
      }
    }
    return true;
  }

  /**
   * @param participans
   *          List of names
   * @param assignments
   *          List of names
   * @param idx
   *          Track which year iteration
   *
   * Print results of Secret Santa
   */
  public void printResults(List<String> participants, List<String> assignments, Integer idx) {
    String result = "\nResults Year " + idx + " \n";

    for (String participant : participants) {
      result += "\n" + participant + "   ------>   " + assignments.get(participants.indexOf(participant));
    }

    System.out.println(result);
  }
}