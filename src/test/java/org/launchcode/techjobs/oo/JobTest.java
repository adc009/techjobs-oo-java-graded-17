package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.swing.text.Position;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //Initialize test job
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //Check types
            assertTrue(testJob.getName() instanceof String);
            assertTrue(testJob.getEmployer() instanceof Employer);
            assertTrue(testJob.getLocation() instanceof Location);
            assertTrue(testJob.getPositionType() instanceof PositionType);
            assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        //Check values
            assertEquals(testJob.getName(), "Product tester");
            assertEquals(testJob.getEmployer().getValue(), "ACME");
            assertEquals(testJob.getLocation().getValue(), "Desert");
            assertEquals(testJob.getPositionType().getValue(), "Quality control");
            assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");


    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Test Subject",
                new Employer("Aperture Laboratories"),
                new Location("Unknown"),
                new PositionType("Quality control"),
                new CoreCompetency("Puzzle Solving"));
        Job job2 = new Job("Test Subject",
                new Employer("Aperture Laboratories"),
                new Location("Unknown"),
                new PositionType("Quality control"),
                new CoreCompetency("Puzzle Solving"));

        assertNotEquals(job1, job2);

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Test Subject",
                new Employer("Aperture Laboratories"),
                new Location("Unknown"),
                new PositionType("Quality control"),
                new CoreCompetency("Puzzle Solving"));
        String testString = testJob.toString();

        //Check that string begins with new line
        assertTrue(testString.startsWith(System.lineSeparator()));
        //Check that string ends with new line
        assertTrue(testString.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Test Subject",
                new Employer("Aperture Laboratories"),
                new Location("Unknown"),
                new PositionType("Quality control"),
                new CoreCompetency("Puzzle Solving"));
        String testString = testJob.toString();

    assertTrue(testString.contains("ID: "  + testJob.getId()));
    assertTrue(testString.contains("Name: " + testJob.getName()));
    assertTrue(testString.contains("Employer: " + testJob.getEmployer()));
    assertTrue(testString.contains("Location: " + testJob.getLocation()));
    assertTrue(testString.contains("Position Type: " + testJob.getPositionType()));
    assertTrue(testString.contains("Core Competency: " + testJob.getCoreCompetency()));



    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency(""));

        String testString = testJob.toString();

        if (testJob.getName().isEmpty()) {
            assertTrue(testString.contains("Name: Data not available"));
        }
        if (testJob.getEmployer().getValue().isEmpty()) {
            assertTrue(testString.contains("Employer: Data not available"));
        }
        if (testJob.getLocation().getValue().isEmpty()) {
            assertTrue(testString.contains("Location: Data not available"));
        }
        if (testJob.getPositionType().getValue().isEmpty()) {
            assertTrue(testString.contains("Position Type: Data not available"));
        }
        if (testJob.getCoreCompetency().getValue().isEmpty()) {
            assertTrue(testString.contains("Core Competency: Data not available"));
        }
    }



}
