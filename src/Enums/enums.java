package Enums;
/// Idea is you can have particular objects only for a particular class
/// enums are group of variables you cannot change
/// enums are constants
///
/// All enums (like a class ) extends java.lang.enums class
/// so enums cannot extend any other class anyway
///
/// we can implement an interface though
/// abstract are not allowed here
public class enums {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        ///  these are called as enums constants
        /// every variable is by default public static final
        /// since they are final -> we cannot extend enums

        // creating constructor
        private Week() {
            System.out.println("Constructor called for "+this);
        }
        ///  problem -> it ran for every variable that it even initialized , we only initialized monday
        // her it is private not public or protected
        /// we only want to have constant no of objects that's its is private . why? enums concept

        /// internally enums -> public static final Week monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week);

        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal()); // post of enum value
    }
}
