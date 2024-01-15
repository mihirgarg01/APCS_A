package Unit7;

public class ClimbingInfoDriver {
    public static void main(String[] args) {
        // test a
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println("The order printed above should be Monadnock, Whiteface, Algonquin, Monadnock");
        hikerClub = new ClimbingClub();
        hikerClub.addClimbInOrder("Monadnock", 274);
        hikerClub.addClimbInOrder("Whiteface", 301);
        hikerClub.addClimbInOrder("Algonquin", 225);
        hikerClub.addClimbInOrder("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println("The order printed above should be Algonquin, Monadnock 274, Monadnock 344, Whiteface");
        System.out.println("Number of distinct names: " + hikerClub.distinctPeaks());
    }
}