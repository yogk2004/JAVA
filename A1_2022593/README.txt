LIBRARY MANAGEMENT SYSTEM README

This is a Java program for a simple Library Management System. The program allows librarians and members to interact with the library system, 
providing features for librarians to manage members, books, and fines and for members to browse and borrow books. Below, you'll find an explanation 
of the code structure, classes, and functionalities.

Code Structure

The code is organized into several classes, each with its own responsibilities. Here's an overview of the main classes and their roles:

    ErrorHandler:
        This class handles user input validation, ensuring the user provides valid input within a specified range.

    MemberDetails:
        This class stores member-related information such as name, age, phone number, fines, and issued books.

    StudentManager:
        This class inherits from MemberDetails and provides methods to register members and remove members from the library. It also allows members to view their details.

    BookDetails:
        This class stores book-related information, including book IDs, authors, titles, copies, and available copies. 
	  It also maintains a mapping of members' phone numbers to their borrowed books.

    BooksOfLibrary:
        This class inherits from BookDetails and provides methods to add and remove books from the library. 
	  It also allows users to view available books.

    Librarian:
        This class manages librarian-related functionality, including librarian login and access to librarian-specific features. 
	  It also provides options to register members, remove members, add books, remove books, view member details, and view all books.

    Member:
        This class handles member-related functionality, including member login and access to member-specific features. 
	  It allows members to browse available books, list their borrowed books, issue books, return books, and pay fines.

    Main:
        The Main class contains the main method and serves as the entry point for the program. 
	  It creates instances of the other classes and allows users to choose whether to log in as a librarian or a member.

How to Use

Run the program by executing the Main class.
Choose whether to enter the system as a librarian or a member.
If you select to log in as a librarian, you must enter a password to access librarian features (the default password is "Librarian@123").
Librarians can register members, remove members, add books, remove books, view member details, and view all books.
Members can log in using their name and phone number. Once logged in, they can browse available books, list their borrowed books, issue books, return books, and pay fines.
Follow the on-screen prompts and instructions to navigate and interact with the library system.

Note:
The code demonstrates a simplified library management system and may require additional enhancements for real-world use cases.
Error handling is implemented to validate user inputs, but additional error handling and edge cases can be added for robustness.