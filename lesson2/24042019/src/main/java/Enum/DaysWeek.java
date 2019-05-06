package Enum;

public enum DaysWeek {
    MONDAY("40"), TUESDAY("32"), WEDNESDAY("24"),
    THURSDAY("16"), FRIDAY("8"), SATURDAY("Выходной"),
    SUNDAY("Выходной");

    DaysWeek(String numbOfHours){
        this.numbOfHours = numbOfHours;
    }
    String numbOfHours;

    public static void clockCalculation(DaysWeek DAY){
        System.out.println(DAY.numbOfHours);
    }
}
