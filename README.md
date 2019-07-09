# Banking Application (version .1)
## Jensen Gastelum
- Project is a banking app that contains three main menus customer, admin, and employee. 
- Customers of the bank are able to register with a username and password, also able to apply to open a banking account.
- Customers of the bank are able to apply for joint accounts
- Banking application handles basic validations such as withdrawing a negative amount of money, overdrawing, and unable to transfer more money then what's account.
- Employees are given the functionality of:
viewing customer account information, balances and personal information
Approving and denying open bank account applications.
- Bank administrators are able to do all functionalities of customers and employees as well as cancel accounts
- All transactions are logged

# User Stories
- As an Admin I want to delete accounts so I could close out accounts from my records
- As an Admin I want to login to my account so I could have my admin functionalities 
- As a customer I want to deposit money into my account so I could utilize my banking services
- As a custumer I want to withdraw from my account so I could utilize my banking services
- As a customer I want to be able to apply to have a bank account so I could utilize n]banking services
- As an employee I want to look at customer information so I could perform my job duties
- As an employee I want to be able to approve or deny open account applications to I could perform my job duties

# Instructions
Project was made using maven environment version 3.6.1. Java development kit used was 1.8.0.212. 
As a prerequisite user must have maven version 3.6.1, JDK 1.8.0212, git version 2.22.0

To build project, one must be able clone or download link from github:

 git clone https://github.com/1907-jul01-java/project-0-Mrgastelum001.git

Then user must pakage the maven project when in the project-0-Mrgastelum001 directory:

 mvn package

Once packaged user needs to compile jarfile while still in the project-0-Mrgastelum001 directory:

    java -cp target/project0-1.0-SNAPSHOT.jar com.revature.App

