import java.util.ArrayList;

class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
    return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(double price : prices){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customerList){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        int otherUser = customerList.size();
        System.out.println("There are " + otherUser + " in front of you.");
        customerList.add(userName);
        System.out.println(customerList);
    }
}