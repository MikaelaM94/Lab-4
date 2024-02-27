import java.util.Scanner;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class LA04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the date of your appointment (YYYY-MM-DD): ");
		LocalDate dateOfPlan = LocalDate.parse(s.nextLine());
		System.out.println("Please enter the current weather prediction on " + dateOfPlan);
		String weather = s.nextLine();
		System.out.println("Please enter the first appointment time (XX:XX):");
		LocalTime AppointmentStartTime = LocalTime.parse(s.nextLine());
		System.out.println("Please enter the last appointment end time (XX:XX):");
		LocalTime AppointmentEndTime = LocalTime.parse(s.nextLine());

		LA04 planner = new LA04();
		String plan = planner.getPlan(weather, dateOfPlan, 
				AppointmentStartTime, AppointmentEndTime);
		System.out.println(plan);
	}

	public String getPlan(String weather, LocalDate dateOfPlan, 
			LocalTime AppointmentStartTime,
			LocalTime AppointmentEndTime) {

		LocalTime firstTrainWeekday = LocalTime.of(06, 00);
		LocalTime lastTrainWeekday = LocalTime.of(23, 00);
		LocalTime firstTrainWeekend = LocalTime.of(10, 00);
		LocalTime lastTrainWeekend = LocalTime.of(20, 00);
		LocalTime departureTimeWeekday = AppointmentStartTime.minusHours(1);
		LocalTime returnTimeWeekday = AppointmentEndTime.plusMinutes(30);
		int AppointmentStartTimes = AppointmentStartTime.getHour();
		int AppointmentEndTimes = AppointmentEndTime.getHour();
		LocalTime departureTimeWeekend = null;
		LocalTime returnTimeWeekend = null;

		if (dateOfPlan.getDayOfWeek() == DayOfWeek.SATURDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.SUNDAY) {
			if (AppointmentStartTimes % 2 == 0)
				departureTimeWeekend = AppointmentStartTime.minusHours(2);
			else
				departureTimeWeekend = AppointmentStartTime.minusHours(1);
		}

		if (dateOfPlan.getDayOfWeek() == DayOfWeek.SATURDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.SUNDAY) {
			if (AppointmentEndTimes % 2 == 0)
				departureTimeWeekend = AppointmentEndTime.plusHours(2);
			else
				departureTimeWeekend = AppointmentStartTime.plusHours(1);
		}

		if (dateOfPlan.getDayOfWeek() == DayOfWeek.SATURDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.SUNDAY) {
			if (AppointmentStartTime.isBefore(firstTrainWeekend) || AppointmentEndTime.isAfter(lastTrainWeekend)
					&& (weather.equals("SNOWY") || weather.equals("RAINY"))) {
				return String.format("Please cancel or reschedule your appointments on %f", dateOfPlan);
			} else if (AppointmentStartTime.isAfter(firstTrainWeekend) && AppointmentEndTime.isBefore(lastTrainWeekend))
				return String.format("Please take the " + departureTimeWeekend + " train to go to the city, and the "
						+ returnTimeWeekend + " train to get back home on " + dateOfPlan);
		}

		if (dateOfPlan.getDayOfWeek() == DayOfWeek.SATURDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.SUNDAY) {
			if (AppointmentStartTime.isBefore(firstTrainWeekend) || AppointmentEndTime.isAfter(lastTrainWeekend)
					&& (weather.equals("SUNNY") || weather.equals("CLOUDY"))) {
				return String.format(
						"Please drive on " + dateOfPlan + ",and leave the house at time " + departureTimeWeekday);
			} else if (AppointmentStartTime.isAfter(firstTrainWeekend) && AppointmentEndTime.isBefore(lastTrainWeekend))
				return String.format("Please take the " + departureTimeWeekend + " train to go to the city, and the "
						+ returnTimeWeekend + " train to get back home on " + dateOfPlan);
		}

		if (dateOfPlan.getDayOfWeek() == DayOfWeek.MONDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.TUESDAY
				|| dateOfPlan.getDayOfWeek() == DayOfWeek.WEDNESDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.THURSDAY
				|| dateOfPlan.getDayOfWeek() == DayOfWeek.FRIDAY) {
			if (AppointmentStartTime.isBefore(firstTrainWeekday) || AppointmentEndTime.isAfter(lastTrainWeekday)
					&& (weather.equals("SNOWY") || weather.equals("RAINY"))) {
				return String.format("Please cancel or reschedule your appointments on %f", dateOfPlan);
			} else if (AppointmentStartTime.isAfter(firstTrainWeekday) && AppointmentEndTime.isBefore(lastTrainWeekday))
				return String.format("Please take the " + departureTimeWeekday + " train to go to the city, and the "
						+ returnTimeWeekday + " train to get back home on " + dateOfPlan);
		}

		if (dateOfPlan.getDayOfWeek() == DayOfWeek.MONDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.TUESDAY
				|| dateOfPlan.getDayOfWeek() == DayOfWeek.WEDNESDAY || dateOfPlan.getDayOfWeek() == DayOfWeek.THURSDAY
				|| dateOfPlan.getDayOfWeek() == DayOfWeek.FRIDAY) {
			if (AppointmentStartTime.isBefore(firstTrainWeekday) || AppointmentEndTime.isAfter(lastTrainWeekday)
					&& (weather.equals("SUNNY") || weather.equals("CLOUDY"))) {
				return String.format(
						"Please drive on " + dateOfPlan + ",and leave the house at time " + departureTimeWeekday);
			} else if (AppointmentStartTime.isAfter(firstTrainWeekday) && AppointmentEndTime.isBefore(lastTrainWeekday))
				return String.format("Please take the " + departureTimeWeekday + " train to go to the city, and the "
						+ returnTimeWeekday + " train to get back home on " + dateOfPlan);
		}
		return "Invalid Plan";
	}
}
