Computer Programming II				    			Instructor: Greg Shaw
COP 3337		
					    
Programming Assignment #1

I.  The Assignment

This assignment is in two parts.  Part one is to write a Java program to simulate playing a number tile game, as described in II, below.  Part two is to properly document – with both internal and “javadoc” comments – the TileGame class, and then generate the Javadoc “help” pages for the project.  Part one is worth 30 points and part two will be a separate grade of 10 points.


II.  The NumberTile Game

Number tiles are squares with a number from 1 to 9 at each side. A “board” for the game is a sequence of number tiles satisfying this property:

	The right side of each tile (except the last) = the left side of the next tile on the board

There are 2 players in the game, both of which are the computer. Each player starts with a "hand" of 5 number tiles.  A move is made by a player removing tile from the hand and placing it on the board, if possible.   A tile may be placed on the board in any of 3 ways:

As the new first tile 
Between two adjacent tiles
As the new last tile

A number tile in the players hand can be rotated 90 degrees but once placed on the board its position is fixed  

If none of the tiles in the hand can be placed on the board, then one random tile is added to the player's hand 

A round is when player1 makes a move and then player2 makes a move (to make the game fair)  

The game ends when all tiles are removed from one (or both) player's hand(s).  If one player's hand is empty and the other player's hand still contains tiles, then the player with the empty hand is the winner.  If both players’ hands are empty, then the game ends in a tie
III.  Specifications

Your program will consist of 5 classes

The NumberTile class – models a number tile
The Hand class – models a player’s hand of number tiles
The Board class – models the board where tiles are inserted from the hands
The TileGame class – conducts the game
Test class with main method 

Use the skeletons of the NumberTile, Hand, Board, and TileGame classes, available online.  Do not add or remove any methods, and do not modify any of the method declarations.  Simply code the bodies of the method “stubs” where necessary

Your main method will do this and only this:  Create a TileGame object,  call the play() method, and then print the results returned by the toString() method.  After each game, ask whether the user wants to see another

To get credit, you must use the declared ArrayList in each class as your principal data structure

To get credit, all instance variables in every class must be declared private


IV.  Due Date – Thursday,  September 7th


V.  What to Upload to Moodle

Upload a zip file (with extension .zip) containing your project folder and 3 sets of output (i.e. the output from 3 games).  Do not zip the individual .java files and output files – zip the entire project folder
See the “Using NetBeans” document for an easy way to capture the output and include it in the project, and the “Submitting Your Assignments” document to make sure you don’t lose points for not following directions


VI.  Development and Debugging Tips

See the Bank class for reference, especially the addAccount method.  Just as a Bank is an abstraction to the user, so are the NumberTile, Hand, and Board objects to the TileGame class, which is itself an abstraction to the user (i.e. to the test class)

Insert temporary print statements to display the initial hands, and to print each hand before and after each move, as well as the updated board after each move

You might want to add the rotation code to the makeMove method after you get the project running without it.   That way, you will have most of the credit “in the bank” and can focus in on it exclusively.  Just saying.
