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
    public Job jobOne, jobTwo, jobThree;


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
        Job aJob = new Job("Cake tester", new Employer("BettyCrocker"), new Location("Kitchen"), new PositionType("Quality control"), new CoreCompetency("Tenacity"));
        assertTrue(aJob.getName() instanceof String);
        assertTrue(aJob.getEmployer() instanceof Employer);
        assertTrue(aJob.getLocation() instanceof Location);
        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Cake tester",aJob.getName());
        assertEquals("BettyCrocker", aJob.getEmployer().toString());
        assertEquals("Kitchen", aJob.getLocation().toString());
        assertEquals("Quality control", aJob.getPositionType().toString());
        assertEquals("Tenacity", aJob.getCoreCompetency().toString());
//        assertNotNull(aJob.getName());
//        assertNotNull(aJob.getEmployer());
//        assertNotNull(aJob.getLocation());
//        assertNotNull(aJob.getPositionType());
//        assertNotNull(aJob.getCoreCompetency());
    }
    @Test
    public void testJobsForEquality(){
        jobOne = new Job("Dog walker", new Employer("Purina" ), new Location("St. Louis"),
                new PositionType("entry level"), new CoreCompetency("Java"));
        jobTwo = new Job("Cat walker", new Employer("PetCo" ), new Location("St. Louis"),
                new PositionType("entry level"), new CoreCompetency("Java"));
        assertEquals(false,jobOne.equals(jobTwo));
        assertFalse(jobOne == jobTwo);
        assertFalse(jobOne.equals(jobTwo));
        assertEquals(false, jobTwo.equals(jobOne));
        assertTrue(jobOne.equals(jobOne));
    }
//    @Test
//    public void testEqualsMethod(){
//
//    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job sJob = new Job();
        sJob.toString();
        assertEquals('\n', '\n');
        assertEquals('\n', '\n');
        String correctSpaces = '\n' + "ID: " + sJob.getId() + " " + "\nName: " + sJob.getName() + " " + "\nEmployer: " + sJob.getEmployer() + " " +
                "\nLocation: " + sJob.getLocation() + " " + "\nPosition Type: " + sJob.getPositionType() + " " +
                "\nCore Competency: " + sJob.getCoreCompetency() + '\n';
        assertEquals(sJob.toString(), correctSpaces);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
//        Job dJob = new Job();
//        dJob.toString();
//        assertEquals(dJob.toString(), ('\n' + "ID: " + dJob.getId() + "\nName: " + dJob.getName() + "\nEmployer: " + dJob.getEmployer() +
//                "\nLocation: " + dJob.getLocation() + "\nPosition Type: " + dJob.getPositionType()  +
//                "\nCore Competency: " + dJob.getCoreCompetency() +'\n'));
//    }
    Job jobSeven =new Job("Cake tester", new Employer("BettyCrocker"), new Location("Kitchen"), new PositionType("Quality control"), new CoreCompetency("Tenacity"));
    String aTester = ("\nID: 4\n" +
            "Name: Cake tester\n" +
            "Employer: BettyCrocker\n" +
            "Location: Kitchen\n" +
            "Position Type: Quality control\n" +
            "Core Competency: Tenacity\n");
             assertEquals(aTester, jobSeven.toString());
}

    @Test
    public void testToStringHandlesEmptyField() {
        String DEFAULT_MESSAGE = "Data not available";
        Job cJob = new Job();
        cJob.toString();
        assertEquals(cJob.getName(),cJob.getName());
        String.format("cJob.getName=%s\ncJob.getEmployer=%s\ncJob.getLocation=%s\ncJob.getPositionType=%s\ncJob.getCoreCompetency=%s\n",
                cJob.getName() == null ? DEFAULT_MESSAGE : cJob.getName(),
                cJob.getEmployer() == null ? DEFAULT_MESSAGE : cJob.getEmployer(),
                cJob.getLocation() == null ? DEFAULT_MESSAGE : cJob.getLocation(),
                cJob.getPositionType() == null ? DEFAULT_MESSAGE : cJob.getPositionType(),
                cJob.getCoreCompetency() == null ? DEFAULT_MESSAGE : cJob.getCoreCompetency());
    }



}
