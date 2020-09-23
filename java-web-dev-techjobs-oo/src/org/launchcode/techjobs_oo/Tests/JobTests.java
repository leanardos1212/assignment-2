package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobTests {

    Job testJob1;
    Job testJob2;

    @Before
    public void createJobs() {
         testJob1 = new Job();
         testJob2 = new Job();
        Job testJob4 = new Job("teacher", new Employer("HighSchool"), new Location("school"), new PositionType("teach"), new CoreCompetency("teaching"));
    }

    @Test
    public void testSettingJobId() {
        testJob1 = new Job();
        testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob3.getEmployer().toString());
        assertTrue(testJob3.getName() == "Product tester");
        assertTrue(testJob3.getEmployer().toString() == "ACME");
        assertTrue(testJob3.getLocation().toString() == "Desert");
        assertTrue(testJob3.getPositionType().toString() == "Quality control");
        assertTrue(testJob3.getCoreCompetency().toString() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob4 = new Job("teacher", new Employer("HighSchool"), new Location("school"), new PositionType("teach"), new CoreCompetency("teaching"));
        Job testJob5 = new Job("teacher", new Employer("HighSchool"), new Location("school"), new PositionType("teach"), new CoreCompetency("teaching"));
        assertFalse(testJob4.getId() == testJob5.getId());
    }

    @Test
    public void toStringMethodPrintDescriptions(){
        Job testJob6 = new Job("teacher", new Employer("HighSchool"), new Location("school"), new PositionType("teach"), new CoreCompetency("teaching"));
        assertSame("school", testJob6.getLocation().toString());
}


}
