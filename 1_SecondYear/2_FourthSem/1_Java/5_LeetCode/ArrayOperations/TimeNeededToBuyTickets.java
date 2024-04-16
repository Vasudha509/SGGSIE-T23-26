// 2073. Time Needed to Buy Tickets
/*
There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
Each person takes exactly 1 second to buy a ticket. A person can only buy a 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

Return the time taken for the person at position k (0-indexed) to finish buying tickets.
*/

class TimeNeededToBuyTickets {
    public int timeRequiredToBuy (int[] tickets, int k) {
      int count = 0;
        while (tickets[k] != 0) {
          for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == 0)
                continue;
            else {
                tickets[i]--;
                //System.out.println("ticket - "+ tickets[i]);
                count++;
                //System.out.println("count - "+ count);
            }   
          }
        }
        return count;
    }
    
    public static void main(String[] args) {
        TimeNeededToBuyTickets ticketsObj = new TimeNeededToBuyTickets();
        int[] tickets = {5,1,1,1};
        int k = 0;
        System.out.println(ticketsObj.timeRequiredToBuy(tickets, k));
    }
}
