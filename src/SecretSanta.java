import java.util.Arrays;
import java.util.Collections;

public class SecretSanta {

  public String[] Participants;
  public String[] Assignments;

  /**
	 * @param names list of all people participating in the draw.
	 * @return list of each person's Secret Santa!
	 */
	public String[] generateAssignments(String[] names) {
    Participants = names;
		Assignments  = Participants.clone();

		do {
      Collections.shuffle(Arrays.asList(Assignments));
    } while(!checkAssignment());

		return Assignments;
	}

	/**
	 * @return false if a person is assigned to themself, else true
   *
	 */
	public boolean checkAssignment() {
		for(int i = 0; i < Participants.length; i++){
			if(Participants[i].equals(Assignments[i])) {
        return false;
      }
		}
		return true;
  }

  /**
   * Print results of Secret Santa
   */
  public void printResults() {
    String result = "\nResults\n";

		for(int i = 0; i < Participants.length; i++) {
      result += "\n" + Participants[i] + "   ------>   " + Assignments[i];
    }

    System.out.println(result);
  }
}