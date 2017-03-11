# Summary
A Java webapp that displays information on presidents of the United States based on user input.

## In This Document:
1. [How to Execute](#how-to-execute)
2. [Class Structure Overview](#class-structure-overview)

## How to Execute
- The webapp is hosted on: insert URL here
- Download the entire program at this repository

## Instructions
1. User arrives on landing page.
2. User can select president based on term # or by selecting the navigation arrow.
3. Information is displayed on chosen president.

## Class Structure Overview
- The **PresServlet** class is the controller and interacts with the **PresDAOImpl** class which implements methods declared in the **PresDAO** class. The president object and hash map objects are constructed using information from the **President** class.
- The **PresServlet** provides information back through a **.jsp** file for the user to view.
