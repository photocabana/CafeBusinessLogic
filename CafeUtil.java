// All methods

import java.util.ArrayList;

class CafeUtil {
    // int getStreakGoal()
    
    // Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that adds every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3 and so on up to 10 and return the result.
    
    // Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.
    
    // Ninja Bonus: Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.
    
    public int getStreakGoal() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
    // Given an array of item prices from an order, add all of the prices in the array and return the total.
    
    // Don't forget to test your code! Find the test code for this method in TestCafe.java and uncomment it before you compile and run.
    
    
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        return total;
    }
    
    // Given an ArrayList of menu items (strings), print out each index and menu item.
    
    // Sample output given an ArrayList with the items "drip coffee", "cappuccino", "latte" and "mocha":
    
    // 0 drip coffee
    // 1 cappuccino
    // 2 latte
    // 3 mochacopy
    
    // Recap of ArrayList Syntax:
    
    void displayMenu(ArrayList<String> menuItems) {
        // String name = myArray.get(0);
        // to access an element in an ArrayList using an index
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }

    }
    // Inside this method:
    
    // Print this string to the console: "Please enter your name:".
    // Add this line of code to get user input from the terminal and store it in the variable username:
    // String username = System.console().readLine();copy
    // Print the username to the console, saying "Hello, [username here]!"
    // Print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array.)
    // Add the customer's name to the given customers list and print the list.
    // There is no need to return anything.
    
    // Recap of ArrayList Syntax:
    // myArray.add("Heidi"); // to add an item to an ArrayList
    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        // System.out.println("This is the userName: " + userName);
        System.out.println("Hello, " + userName);
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);
    }
    // Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3 and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:
    
    // Columbian Coffee Grounds
    // 1 - $15.00
    // 2 - $30.00
    // 3 - $45.00copy
    // Tip: You can use the escape character \n within your string for line breaks.
    
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for(int quantity = 1; quantity < maxQuantity; quantity++) {
            double newPrice = price * quantity;
            System.out.printf("%s - $%.2f/n", quantity, newPrice);
        }
    
    }
}



// Ninja bonus 2: Format the prices as currency. Hint: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

// Ninja Bonus 3: Take $0.50 more off the original price every time the quantity increases.

// Example: Given a $2.00 price and 4 max, where the prices would normally be $2, $4, $6 and $8, the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, then $1, then $1.50 from the group tag price:

// 1 - $2.00
// 2 - $3.50 
// 3 - $5.00 
// 4 - $6.50copy
// boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)

// Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList of prices (doubles), print a menu!

// Be sure to check if the arrays are not the same size. If they are, immediately return false.

// To print the menu, iterate from 0 to the last index. Each time through, print on the following on the same line:

// a.) The index, b.) The menu item at that index, and c.) The price at that index.
// Finally, return true.

// Sample output:

// 0 drip coffee -- $1.50
// 1 cappucino -- $3.50
// 2 latte -- $4.50
// 3 mocha -- $3.50 copy
// Ninja Bonus 4!
// Make a method addCustomers in which a barista can enter multiple customers.

// Hint: You can use a while loop and ask the user to type "q" when they are finished entering names.