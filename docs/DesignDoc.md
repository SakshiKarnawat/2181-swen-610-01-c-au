# PROJECT Design Documentation

> The following template provides the headings for your Design Documentation.  As you edit each section make sure you remove these commentary 'blockquotes'; the lines that start with a > character.

## Executive Summary
The application must allow players to play checkers with other players who are currently signed-in. The game user interface (UI) will support a game experience using drag-and-drop browser capabilities for making moves.

Beyond this minimal set of features, we have grand vision for what we could do including watching live games, playing multiple games, playing games asynchronously, reviewing past games, running tournaments with timed moves, and offering AI players to compete against.

### Purpose
This is a web based Checkers game, where players can log into a website to challenge another player to a game of checkers. This is a project written in Java, Spark, HTML, and Javascript. The maven tool is used to build and run the program which can be accessed with a web browser. 

### Glossary and Acronyms


| Term | Definition |
|------|------------|
| VO | Value Object |
| EO | Entity Object|


## Requirements

1. This application can be played between 2 players who rotate turns begins with a set of 12 discs of red or black. 
2. A piece can only be moved diagonally on to the dark squares until it has been crowned as the king. 
3. Players capture their challenger's pieces by jumping over them diagonally to the next empty diagonal space if available.             The jumped pieces are then captured and removed from the board. 
4. If you can make a jump, you have no option but to proceed, however if there are several jumps available, you select one.  A player cannot jump their man/piece or the same piece twice in the same move. 
Additionally, a player is permitted to make multiple jumps if the pieces of the challenger are arranged in that manner. 
5. It is possible to change the direction of the jump. For example, if one piece is captured by jumping on the next diagonal, another piece may be captured by jumping in the left direction at the same time. 
6. When a piece reaches the challenger’s end of the board, it is crowned as king and it can move both forward and backward diagonally only. Also, a king can jump in all four directions.  As the game progresses and one of the players is unable to move either due to their pieces being captured or blocked, he or she loses.
This section describes the features of the application.


### Definition of MVP
The minimal viable product includes these features:

### MVP Features

1. Every player must sign-in before playing a game.
2. Two players must be able to play a game of checkers based upon the American rules.
3. Either player of a game may choose to resign, which ends the game.

### Roadmap of Enhancements

1. Games can be stored for later review.
2. Players can play asynchronously.
3. A player may play more than one game at a time.
4. Other players may view an on-going game that they are not playing.
5. Players may play a game against an AI player.
6. Players can play in checkers tournaments.


## Application Domain
Alex
This section describes the application domain.

### Overview of Major Domain Areas
> Provide a high-level overview of the 

### Details of each Domain Area
> If necessary, high-light certain areas of the Domain model that have a focused purpose.  Create textual narrative that describes the purpose and how that relates to the associated domain model.



## Architecture
Sakshi
This section describes the application architecture.

### Summary
> Provide a brief summary of the architecture.  Also provide one or two models (diagrams) that describe the architecture.  Hint: review the Architecture lecture slides for ideas.

### Overview of User Interface
> Provide a summary of the application's user interface.
> This includes the UI state model.

### Tier X
> Provide a summary of each tier of your architecture.  Thus replicate this heading for each tier.
> In each section describe the types of components in the tier and describe their responsibilities.


## Sub-system X
Sakshi
> Provide a section for each major sub-system within the tiers of the architecture.  Replace 'X' with the name of the sub-system.
> A sub-system would exist within one of the application tiers and is a group of components cooperating on a significant purpose within the application.  For example, in WebCheckers all of the UI Controller components for the Game view would be its own sub-system.

This section describes the detail design of sub-system X.

### Purpose of the sub-system
> Provide a summary of the purpose of this sub-system.

### Static models

Class diagrams are shown below:
![Class Diagram](/docs/CheckersClassDiagram.png)

### Dynamic models

Sequence Diagrams for the project are shown below:
![Sequence Diagram 1](/docs/SequenceDiagram_Part1.png)
![Sequence Diagram 2](/docs/SequenceDiagram_Part2.png)
