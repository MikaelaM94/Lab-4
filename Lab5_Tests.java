import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class Lab5_Tests {
	
	@Test
	void TestGetPlanForRainyWeather() {
		LocalDate date = LocalDate.parse("2024-03-14");
		String weather = "RAINY";
		LocalTime firstAppointment = LocalTime.of(9,00);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please cancel or reschedule your appointments on Thursday, March 14, 2024.", result);
		
	}

	@Test 
	void TestGetPlanForSunnyWeather() {
		LocalDate date = LocalDate.parse("2024-03-14");
		String weather = "SUNNY";
		LocalTime firstAppointment = LocalTime.of(9, 0);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 08:00 train to go to the city, and the 4:00 PM train to get back home on Thursday, March 14, 2024.", result);
}

	@Test
	void TestGetPlanForSnowyWeather() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "SNOWY";
		LocalTime firstAppointment = LocalTime.of(10, 0);
		LocalTime lastAppointment = LocalTime.of(12, 00);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please cancel or reschedule your appointments on Wednesday, February 14, 2024.", result);
}
	@Test
	void TestGetPlanForCloudyWeather() {
		LocalDate date = LocalDate.parse("2024-03-14");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(9, 0);
		LocalTime lastAppointment = LocalTime.of(17, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 08:00 train to go to the city, and the 5:00 PM train to get back home on Thursday, March 14, 2024.", result);
}
	@Test
	void TestGetPlanForRainyWeather2() {
		LocalDate date = LocalDate.parse("2024-03-14");
		String weather = "RAINY";
		LocalTime firstAppointment = LocalTime.of(6, 0);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please cancel or reschedule your appointments on Thursday, March 14, 2024.", result);
		
	}

	@Test 
	void TestGetPlanForSunnyWeather2() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "SUNNY";
		LocalTime firstAppointment = LocalTime.of(6, 0);
		LocalTime lastAppointment = LocalTime.of(12, 00);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Wednesday, February 14, 2024, and leave the house at least an hour before your first appointment.", result);
}

	@Test
	void TestGetPlanForSnowyWeather2() {
		LocalDate date = LocalDate.parse("2024-03-14");
		String weather = "SNOWY";
		LocalTime firstAppointment = LocalTime.of(11, 0);
		LocalTime lastAppointment = LocalTime.of(12, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please cancel or reschedule your appointments on Thursday, March 14, 2024.", result);
}
	@Test
	void TestGetPlanForCloudyWeather2() {
		LocalDate date = LocalDate.parse("2024-03-13");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(10, 0);
		LocalTime lastAppointment = LocalTime.of(12, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 09:00 train to go to the city, and the 12:00 PM train to get back home on Wednesday, March 13, 2024.", result);
}
	@Test
	void TestGetPlanForRainyWeather3() {
		LocalDate date = LocalDate.parse("2024-03-15");
		String weather = "RAINY";
		LocalTime firstAppointment = LocalTime.of(8, 0);
		LocalTime lastAppointment = LocalTime.of(11, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please cancel or reschedule your appointments on Friday, March 15, 2024.", result);
		
	}

	@Test 
	void TestGetPlanForSunnyWeather3() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "SUNNY";
		LocalTime firstAppointment = LocalTime.of(9, 0);
		LocalTime lastAppointment = LocalTime.of(17, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 08:00 train to go to the city, and the 5:00 PM train to get back home on Wednesday, February 14, 2024.", result);
}

	@Test
	void TestGetPlanForSnowyWeather3() {
		LocalDate date = LocalDate.parse("2024-03-11");
		String weather = "SNOWY";
		LocalTime firstAppointment = LocalTime.of(10, 0);
		LocalTime lastAppointment = LocalTime.of(13, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please cancel or reschedule your appointments on Monday, March 11, 2024.", result);
}
	@Test
	void TestGetPlanForCloudyWeather3() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(6, 0);
		LocalTime lastAppointment = LocalTime.of(8, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Wednesday, February 14, 2024, and leave the house at least an hour before your first appointment.", result);
}
	@Test
	void TestGetPlanForWeekdayWithTrain() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(9, 0);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 08:00 train to go to the city, and the 4:00 PM train to get back home on Wednesday, February 14, 2024.", result);
}
	@Test
	void TestGetPlanForWeekdayWithTrain2() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "SUNNY";
		LocalTime firstAppointment = LocalTime.of(9, 0);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 08:00 train to go to the city, and the 4:00 PM train to get back home on Wednesday, February 14, 2024.", result);
}
	@Test
	void TestGetPlanForWeekdayWithoutTrain() {
		LocalDate date = LocalDate.parse("2024-02-14");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(6, 0);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Wednesday, February 14, 2024, and leave the house at least an hour before your first appointment.", result);
}
	@Test
	void TestGetPlanForWeekdayWithoutTrain2() {
		LocalDate date = LocalDate.parse("2024-03-14");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(6, 0);
		LocalTime lastAppointment = LocalTime.of(16, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Thursday, March 14, 2024, and leave the house at least an hour before your first appointment.", result);
}
	@Test
	void TestGetPlanForWeekendWithTrain() {
		LocalDate date = LocalDate.parse("2024-02-17");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(11, 0);
		LocalTime lastAppointment = LocalTime.of(14, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please take the 10:00 train to go to the city, and the 2:00 PM train to get back home on Saturday, February 17, 2024.", result);
}
	@Test
	void TestGetPlanForWeekendWithTrain2() {
		LocalDate date = LocalDate.parse("2024-02-17");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(10, 0);
		LocalTime lastAppointment = LocalTime.of(12, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Saturday, February 17, 2024, and leave the house at least an hour before your first appointment.", result);
}
	@Test
	void TestGetPlanForWeekendWithoutTrain() {
		LocalDate date = LocalDate.parse("2024-02-17");
		String weather = "CLOUDY";
		LocalTime firstAppointment = LocalTime.of(10, 0);
		LocalTime lastAppointment = LocalTime.of(14, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Saturday, February 17, 2024, and leave the house at least an hour before your first appointment.", result);
}	@Test
	void TestGetPlanForWeekendWithoutTrain2() {
		LocalDate date = LocalDate.parse("2024-02-17");
		String weather = "SUNNY";
		LocalTime firstAppointment = LocalTime.of(8, 0);
		LocalTime lastAppointment = LocalTime.of(10, 0);
		String result = Lab5.getPlan(date, weather, firstAppointment, lastAppointment);
		assertEquals("Please drive on Saturday, February 17, 2024, and leave the house at least an hour before your first appointment.", result);
}


}
