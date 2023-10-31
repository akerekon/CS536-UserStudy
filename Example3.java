public class Example3 {

    private String firstBase = "Mike Napoli";
    private String secondBase = "Dustin Pedroia";
    private String shortstop = "Stephen Drew";
    private String thirdBase = "Xander Bogaerts";
    private String leftField = "Jonny Gomes";
    private String centerField = "Jacoby Ellsbury";
    private String rightField = "Shane Victorino";
    private String pitcher = "Jon Lester";
    private String catcher = "David Ross";

    //A (contrived) method to ensure all of the Boston Red Sox 2013 World Series roster is loaded in before a baseball game
    private void checkIfPlayersOnField() {
        if (!firstBase.isEmpty() && !secondBase.isEmpty() && !shortstop.isEmpty() && !thirdBase.isEmpty() && !leftField.isEmpty() && !centerField.isEmpty() && !rightField.isEmpty() && !pitcher.isEmpty() && !catcher.isEmpty()) {
            System.out.println("All players are on the field!");
        } else {
            System.out.println("Player(s) are missing from the field!");
        }
    }

}
