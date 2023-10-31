first_base = "Mike Napoli"
second_base = "Dustin Pedroia"
shortstop = "Stephen Drew"
third_base = "Xander Bogaerts"
left_field = "Jonny Gomes"
center_field = "Jacoby Ellsbury"
right_field = "Shane Victorino"
pitcher = "Jon Lester"
catcher = "David Ross"

# A (contrived) method to ensure all of the Boston Red Sox 2013 World Series
# roster is loaded in before a baseball game
def check_if_players_on_field():
    if (first_base and second_base and shortstop and third_base and left_field
       and center_field and right_field and pitcher and catcher):
        print("All players are on the field!")
    else:
        print("Player(s) are missing from the field!")
