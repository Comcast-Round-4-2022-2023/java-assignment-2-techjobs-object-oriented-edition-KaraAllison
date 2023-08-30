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
        assertEquals(myJob.getName(), "Product tester");
        assertTrue(myJob.getEmployer() instanceof Employer);
        assertEquals(myJob.getEmployer().getValue(), "ACME");
        assertTrue(myJob.getLocation() instanceof Location);
        assertEquals(myJob.getLocation().getValue(), "Desert");
        assertTrue(myJob.getPositionType() instanceof PositionType);
        assertEquals(myJob.getPositionType().getValue(), "Quality control");
        assertTrue(myJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(myJob.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality () {
        Job oneJob = new Job();
        Job twoJob = new Job();
        assertFalse(oneJob.equals(twoJob));
    }
}
