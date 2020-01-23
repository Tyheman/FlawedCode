/* Script that is used to get the username of the user
This script is intended to have flaws and lack of secure programming standards
Author: Tyler Mankey

 */
class Script2 {
    /*
    Link: https://wiki.sei.cmu.edu/confluence/display/java/ENV02-J.+Do+not+trust+the+values+of+environment+variables
    Violation: Trusting environmental Variables
     */
    public static void main(String[] args) {
        System.out.print("The name of the user using this computer is: ");
        //RESOLVED - changed to directly get system property instead of from the environment
        String username = System.getProperty("user.name");
        System.out.println(username); // Example "Tyler"
    }
}

