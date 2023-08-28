public class StepTracker {
    private int minSteps;
    private int activeDay;
    private double avgSteps;
    private int days;
    private int totalSteps;
    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        activeDay = 0;
    }
    public int activeDays() {
        return activeDay;
    }
    public int getActiveDays() {
        return activeDay;
    }
    public double averageSteps() {
        avgSteps *= 10;
        avgSteps = (int)avgSteps;
        return avgSteps/10;
    }
    public int getDays() {
        return days;
    }
    public int getStepsForActiveDay() {
        return minSteps;
    }
    public int getTotalSteps() {
        return totalSteps;
    }
    public void addDailySteps(int steps) {
        days++;
        totalSteps += steps;
        if (steps >= minSteps) {
            activeDay++;
        }
        avgSteps = (avgSteps*(days-1) + steps)/days;
    }
    public String toString() {
        return "Minimum steps required for an active day: " + minSteps + "\nActive Days: " + activeDay + "\nDays: " + days + "\nAverage Steps per Day: " + avgSteps;
    }

}
