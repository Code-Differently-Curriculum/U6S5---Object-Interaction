# U6S5 - Object Interaction

* Part A - Foundations 7.5
* Part B - Foundations Practice

## Part A

### Exercise 01

* Continue editing the PlayerTest project
* A version of this program is provided for you in the files
 `Player` and `PlayerTest`

#### Step 01

In the package `partA.ex01` look at the file `Team`

#### Step 02
* Create a `Team` class that includes the following:
  * String name of the team
  * Boolean describing whether the player is active or retired 
  * Two-argument constructor that sets both fields

#### Step 03
* Modify the `Player` class so that it:
  * Includes a Team field
  * Sets the Team field based on a constructor parameter
  * Prints the team's name as part of the display() method

#### Step 04
* Write an statusOfPlayer() method in the `Player` class
  * Access and modify the corresponding field in the Team object
  so that:
  * If the player is retired, bring them back
  * If the player is active and has been in the league for 15yrs, retire them
  * Print whether the player is retired or not

#### Step 05
* From the main method:
  * Instantiate a Team and a Player object
  * Call the player's display() method once
  * Call the statusOfPlayer() method a few times

#### Step 06
*  Modify the `Team` class:
  * Change its fields to private
  * Save the file

### Exercise 02 

#### Step 01

In the package `partA.ex01` look at the file `Team`.

#### Step 02

* Modify the `Team` class so that ...
  * Getters exist for the name and statusOfPlayer fields
  * There’s a private 4-digit security code field for each team, it’s initialized from the constructor and has no getter method
  * There’s a setter for retiring/returning a player, and it does the following:
    *  Accepts a team code as an argument
    * Prints if the code is incorrect
    *  If the code is correct and the player hasn't played for 15 years, keep them active 
      *  If the code is correct and the player has played for 15 years, retire them
      * Prints if the player is retired or not 

#### Step 03
* Modify the `Player` class so that …
  * The display() method prints the team name
  * The statusOfPlayer() method is removed
* Modify the main method so that …
  * The Team is instantiated properly
  * The player no longer tries to retire from the team
  * It tests a Team class’s ability to retire and return its players
  *  Try supplying both correct and incorrect team codes

#### Step 04
* Encapsulate the `Player` class
  * Make its fields private
  * Provide getters and setters for every field

## Part B

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `Team`

#### Step 02