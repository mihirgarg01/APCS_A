package Unit5;
/**
 * 
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Implement a VotingMachine class that can be used for a simple election. Have
 * methods to clear the machine state, to vote for a Democrat, to vote for a
 * Republican, to vote for an independent to get the tallies for all three
 * parties. You will need the following:
 * 
 * 1. Instance variables for the democrat votes, republican votes and independent
 *    votes. 
 * 2. Constructors: There should be a default constructor that can create a
 *    brand new voting machine without any votes in it as well as a constructor
 *    that can accept initial votes for each of the three parties. Would there be
 *    any other constructors that could come in handy? 
 * 3. Getter methods for returning the number of votes of each party candidate. 
 *    The methods must be named getDemocratVotes, getRepublicanVotes, and getIndependentVotes. 
 * 4. Setter methods for changing the number of votes of each party candidate to given numbers.
 *    The methods must be named setDemocratVotes, setRepublicanVotes, and
 *     setIndependentVotes. 
 * 5. Methods that will increment the votes by 1. Call these methods voteDemocrat, voteRepublican, 
 *    and voteIndependent. 
 * 6. Overloaded methods, voteDemocrat, voteRepublican, and voteIndependent that will
 *    increment the votes by a given amount. The amount of votes to be incremented
 *    by will be passed in as parameters. 
 * 7. A method to clear all the votes. A method to calculate and return the total votes. 
 *    Call this method totalVotes. 
 * 8. Methods to calculate and return the percent democrat, republican and independent
 *    votes. Call the methods percentDemocrat, percentRepublican, and
 *    percentIndependent. These methods must call the totalVotes method rather than
 *    recalculating it. 
 * 9. A method to print the vote statisitcs. Call this method printStats. It prints the 
 *    total votes, percent democrat votes, percent republican votes, and percent independent votes. 
 *    This method must call the totalVotes, percentDemocrat, percentRepublican , and percentIndependent
 *    method rather than recalculating all of the stats.
 *    
 * Here is a sample output:
 *
 * Democrats: 2
 * Republicans: 3
 * Independents: 1 
 * Total votes: 6
 * Percent Democrat Votes: 33.33333333333333 
 * Percent Republican Votes: 50.0
 * Percent Independent Votes: 16.666666666666664
 * 
 */
public class VotingMachine {
    // your code goes here
    private int democratVotes;
    private int republicanVotes;
    private int independentVotes;

    public VotingMachine() {
        this.democratVotes = 0;
        this.republicanVotes = 0;
        this.independentVotes = 0;
    }

    public VotingMachine(int democratVotes, int republicanVotes, int independentVotes) {
        this.democratVotes = democratVotes;
        this.republicanVotes = republicanVotes;
        this.independentVotes = independentVotes;
    }

    public int getDemocratVotes() {
        return this.democratVotes;
    }

    public int getRepublicanVotes() {
        return this.republicanVotes;
    }

    public int getIndependentVotes() {
        return this.independentVotes;
    }
    
}
 