import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

class LA04Testing {

    @Test
    void testGetPlan_WeekendRainyCancel() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("RAINY", LocalDate.parse("2024-02-24"), LocalTime.of(10, 0), LocalTime.of(15, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-24", plan);
    }

    @Test
    void testGetPlan_WeekendRainyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("RAINY", LocalDate.parse("2024-02-24"), LocalTime.of(12, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 10:00 train to go to the city, and the 4:00 train to get back home on 2024-02-24", plan);
    }
    
    @Test
    void testGetPlan_WeekendSunnyDrive() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SUNNY", LocalDate.parse("2024-02-24"), LocalTime.of(10, 0), LocalTime.of(16, 0));
        assertEquals("Please drive on 2024-02-24,and leave the house at time 11:00", plan);
    }
    
    @Test
    void testGetPlan_WeekendSunnyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SUNNY", LocalDate.parse("2024-02-24"), LocalTime.of(12, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 10:00 train to go to the city, and the 4:00 train to get back home on 2024-02-24", plan);
    }

    @Test
    void testGetPlan_WeekdayRainyCancel() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("RAINY", LocalDate.parse("2024-02-21"), LocalTime.of(6, 0), LocalTime.of(17, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-21", plan);
    }
    
    @Test
    void testGetPlan_WeekdayRainyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("RAINY", LocalDate.parse("2024-02-21"), LocalTime.of(8, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 7:00 train to go to the city, and the 3:30 train to get back home on 2024-02-21", plan);
    }

    @Test
    void testGetPlan_WeekdaySunnyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SUNNY", LocalDate.parse("2024-02-21"), LocalTime.of(10, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 9:00 train to go to the city, and the 5:30 train to get back home on 2024-02-21", plan);
    }
    
    @Test
    void testGetPlan_WeekdaySunnyDrive() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SUNNY", LocalDate.parse("2024-02-21"), LocalTime.of(6, 0), LocalTime.of(16, 0));
        assertEquals("Please drive on 2024-02-21,and leave the house at time 5:00", plan);
    }
    @Test
    void testGetPlan_InvalidPlan() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("CLOUDY", LocalDate.parse("2024-02-22"), LocalTime.of(14, 0), LocalTime.of(18, 0));
        assertEquals("Invalid Plan", plan);
    }

    @Test
    void testGetPlan_WeekendSnowyCancel() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SNOWY", LocalDate.parse("2024-02-25"), LocalTime.of(10, 0), LocalTime.of(15, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-25", plan);
    }
    
    @Test
    void testGetPlan_WeekendSnowyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SNOWY", LocalDate.parse("2024-02-24"), LocalTime.of(12, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 10:00 train to go to the city, and the 4:00 train to get back home on 2024-02-24", plan);
    }
    
    @Test
    void testGetPlan_WeekdaySnowyCancel() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SNOWY", LocalDate.parse("2024-02-22"), LocalTime.of(8, 0), LocalTime.of(17, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-22", plan);
    }

    @Test
    void testGetPlan_WeekdaySnowyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SNOWY", LocalDate.parse("2024-02-22"), LocalTime.of(12, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 11:00 train to go to the city, and the 3:30 train to get back home on 2024-02-22", plan);
    }
    
    @Test
    void testGetPlan_WeekendCloudyDrive() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("CLOUDY", LocalDate.parse("2024-02-17"), LocalTime.of(9, 0), LocalTime.of(16, 0));
        assertEquals("Please drive on 2024-02-17,and leave the house at time 8:00", plan);
    }

    @Test
    void testGetPlan_WeekendCloudyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("CLOUDY", LocalDate.parse("2024-02-17"), LocalTime.of(12, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 10:00 train to go to the city, and the 4:00 train to get back home on 2024-02-17", plan);
    }
    
    @Test
    void testGetPlan_WeekdayCloudyTrain() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("CLOUDY", LocalDate.parse("2024-02-23"), LocalTime.of(10, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 9:00 train to go to the city, and the 3:30 train to get back home on 2024-02-23", plan);
    }
    
    @Test
    void testGetPlan_WeekdayCloudyDrive() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("CLOUDY", LocalDate.parse("2024-02-17"), LocalTime.of(5, 0), LocalTime.of(16, 0));
        assertEquals("Please drive on 2024-02-17,and leave the house at time 4:00", plan);
    }
    
    @Test
    void testGetPlanScenario() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("RAINY", LocalDate.parse("2024-02-03"), LocalTime.of(10, 0), LocalTime.of(15, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-03", plan);
    }
    
    @Test
    void testGetPlanScenario18() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SUNNY", LocalDate.parse("2024-02-24"), LocalTime.of(10, 0), LocalTime.of(15, 0));
        assertEquals("Please drive on 2024-02-24,and leave the house at time 9:00", plan);
    }
    

    @Test
    void testGetPlanScenario19() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SNOWY", LocalDate.parse("2024-02-23"), LocalTime.of(14, 0), LocalTime.of(15, 0));
        assertEquals("Please take the 12:00 train to go to the city, and the 4:00 train to get back home on 2024-02-23", plan);
    }
    
    @Test
    void testGetPlanScenario20() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("RAINY", LocalDate.parse("2024-02-09"), LocalTime.of(6, 0), LocalTime.of(15, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-23", plan);
    }
    
    @Test
    void testGetPlanScenario21() {
        LA04 planner = new LA04();
        String plan = planner.getPlan("SNOWY", LocalDate.parse("2024-02-28"), LocalTime.of(6, 0), LocalTime.of(15, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-02-28", plan);
    }
    
   