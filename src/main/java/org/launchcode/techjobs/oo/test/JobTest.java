package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    private Job jobOne, jobTwo, jobThree;


    @Before
    public void testJobObjects(){
        jobOne = new Job("Dog walker", new Employer("Purina" ), new Location("St. Louis"),
                new PositionType("entry level"), new CoreCompetency("Java"));
        jobTwo = new Job("Cat walker", new Employer("PetCo" ), new Location("St. Louis"),
                new PositionType("entry level"), new CoreCompetency("Java"));
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId() {
        Job aJob = new Job();
        Job bJob = new Job();
        assertNotEquals(aJob.getId(), bJob.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertNotNull(jobThree.getName());
        assertNotNull(jobThree.getEmployer());
        assertNotNull(jobThree.getLocation());
        assertNotNull(jobThree.getPositionType());
        assertNotNull(jobThree.getCoreCompetency());
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(jobOne == jobTwo);
        assertFalse(Objects.equals(jobTwo, jobThree));

    }
    @Test
    public void testToString_returnsStringWithCorrectSpaces() {
        Job sJob = new Job();
        String correctSpaces = "\nID: " + sJob.getId() + " " + "\nName: " + sJob.getName() + " " + "\nEmployer: " + sJob.getEmployer() + " " +
                "\nLocation: " + sJob.getLocation() + " " + "\nPosition Type: " + sJob.getPositionType() + " " +
                "\nCore Competency: " + sJob.getCoreCompetency() + " ";
        assertEquals(sJob.toString(), correctSpaces);
    }

    @Test
    public void testToString_returnsStringWithLabelsAndData(){
        Job dJob = new Job();
        assertEquals(dJob.toString(), ("\nID: " + dJob.getId() + " " + "\nName: " + dJob.getName() + " " + "\nEmployer: " + dJob.getEmployer() + " " +
                "\nLocation: " + dJob.getLocation() + " " + "\nPosition Type: " + dJob.getPositionType() + " " +
                "\nCore Competency: " + dJob.getCoreCompetency() + " "));
    }
    @Test
    public void testToString_returnsUnavailableIfFieldIsBlank(){
        String DEFAULT_MESSAGE = "Data not available";
        Job cJob = new Job();
        String.format("cJob.getName=%s\ncJob.getEmployer=%s\ncJob.getLocation=%s\ncJob.getPositionType=%s\ncJob.getCoreCompetency=%s",
                cJob.getName() == null ? DEFAULT_MESSAGE : cJob.getName(),
                cJob.getEmployer() == null ? DEFAULT_MESSAGE : cJob.getEmployer(),
                cJob.getLocation() == null ? DEFAULT_MESSAGE : cJob.getLocation(),
                cJob.getPositionType() == null ? DEFAULT_MESSAGE : cJob.getPositionType(),
                cJob.getCoreCompetency() == null ? DEFAULT_MESSAGE : cJob.getCoreCompetency());
    }
}
