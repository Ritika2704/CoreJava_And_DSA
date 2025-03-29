package basicConcept;

//An enum, short for "enumeration," is a special data type in Java used to
//define a collection of constants. It provides a way to represent a fixed set of predefined values.
// Defining an enum called DayOfWeek
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Using enum constants
        DayOfWeek today = DayOfWeek.MONDAY;
        System.out.println("Today is: " + today);

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's the start of the week.");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Just another day.");
        }

        // Iterating over enum constants
        System.out.println("Days of the week:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}
/*

Output
        Today is: MONDAY
        It's the start of the week.
        Days of the week:
        SUNDAY
        MONDAY
        TUESDAY
        WEDNESDAY
        THURSDAY
        FRIDAY
        SATURDAY*/
