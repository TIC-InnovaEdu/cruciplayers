# README.md

# Crossword Game

## Overview
Crossword Game is a distributed multiplayer game that allows two players to compete against each other in a crossword puzzle on the same local network. The game consists of a client-server architecture where the server manages the game state and the clients handle user interactions.

## Project Structure
```
crossword-game
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── client
│   │   │   │   ├── CrosswordClient.java
│   │   │   │   ├── GameBoard.java
│   │   │   │   └── ClientGUI.java
│   │   │   ├── server
│   │   │   │   ├── CrosswordServer.java 
│   │   │   │   ├── GameLogic.java
│   │   │   │   └── PlayerManager.java
│   │   │   ├── model
│   │   │   │   ├── Puzzle.java
│   │   │   │   └── Word.java
│   │   │   └── network
│   │   │       ├── Message.java
│   │   │       └── NetworkManager.java
│   │   └── resources
│   │       └── puzzles.txt
├── pom.xml
└── README.md
```

## Features
- **Client-Server Architecture**: The game operates on a client-server model, allowing multiple clients to connect to a single server.
- **Graphical User Interface**: The client provides a user-friendly GUI for players to interact with the game.
- **Dynamic Game Logic**: The server manages the game state and enforces the rules of the crossword puzzle.

## Getting Started
1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using Maven: `mvn clean install`.
4. Run the server: `java -cp target/crossword-game-1.0-SNAPSHOT.jar server.CrosswordServer`.
5. Start the client: `java -cp target/crossword-game-1.0-SNAPSHOT.jar client.CrosswordClient`.

## Dependencies
This project uses Maven for dependency management. Please refer to the `pom.xml` file for the list of dependencies.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.