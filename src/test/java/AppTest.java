/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
  List<String> participants;
  SecretSanta secretSanta;

  @Before
  public void init() {
    participants = Arrays.asList("Daniel", "Jim", "Jill", "Guy", "Louise");
    secretSanta = new SecretSanta();
  }

  /**
   * Test randomized set of participants
   */
  @Test
  public void testSelfAssignment() {
    List<String> assignments = secretSanta.generateAssignments(participants);
    boolean checkAssignment = false;
    for (String participant : participants) {
      if (participant.equals(assignments.get(participants.indexOf(participant)))) {
        checkAssignment = true;
      }
    }
    assertFalse(checkAssignment);
  }

  /**
   * verify there is a pair for every name.
   */
  @Test
  public void testPlayerAssignment() {
    List<String> assignments = secretSanta.generateAssignments(participants);
    assertTrue(assignments.size() == participants.size());
  }

}