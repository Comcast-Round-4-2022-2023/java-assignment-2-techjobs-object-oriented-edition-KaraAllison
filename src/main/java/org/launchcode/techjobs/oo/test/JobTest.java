package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId () {
        Job oneJob = new Job();
        Job twoJob = new Job();
        assertNotEquals(oneJob.getId(),twoJob.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields () {
        Job myJob =
        new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(myJob.getName() instanceof String);
        assertEquals("Product tester", myJob.getName());
        assertTrue(myJob.getEmployer() instanceof Employer);
        assertEquals("ACME", myJob.getEmployer().getValue());
        assertTrue(myJob.getLocation() instanceof Location);
        assertEquals("Desert", myJob.getLocation().getValue());
        assertTrue(myJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", myJob.getPositionType().getValue());
        assertTrue(myJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", myJob.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality () {
        Job oneJob = new Job();
        Job twoJob = new Job();
        assertFalse(oneJob.equals(twoJob));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job myJob =
                new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                        new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', myJob.toString().charAt(0));
        assertEquals('\n', myJob.toString().charAt(myJob.toString().length()-1));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        Job myJob =
                new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                        new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + myJob.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n", myJob.toString());
    }
    @Test
    public void testToStringHandlesEmptyField () {
        Job myJob = new Job();
        assertEquals(
                "\nID: " + myJob.getId() +
                "\nName: Data not available" +
                "\nEmployer: Data not available" +
                "\nLocation: Data not available" +
                        "\nPosition Type: Data not available" +
                        "\nCore Competency: Data not available\n", myJob.toString());
    }
}
