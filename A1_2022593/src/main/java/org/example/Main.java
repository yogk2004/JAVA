package org.example;

import java.nio.channels.ClosedSelectorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

//Declaring error function:
class ErrorHandler{
    public int ErrorInt(int start, int end){
        boolean flag = true;
        int choice1 = 0;
        while (flag) {
            System.out.print("Enter the your choice: ");
            try {
                Scanner sc = new Scanner(System.in);
                choice1 = sc.nextInt();
                if (choice1<end && choice1>=start) {
                    flag = false;
                }else{
                    System.out.print("Please enter a valid input! You can enter number ");
                    for(int i=start;i<end;i++){
                        System.out.print(i+", ");
                    }
                    System.out.println("for choosing in above option.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid input! You can enter number ");
                for(int i=start;i<end;i++){
                    System.out.print(i+", ");
                }
                System.out.println("for choosing in above option.");
            } catch (Exception e) {
                System.out.println("Your input is invalid and caused exception " + e);
                System.out.print("Please enter a valid input! You can enter number ");
                for(int i=start;i<end;i++){
                    System.out.print(i+", ");
                }
                System.out.println("for choosing in above option.");
            }
        }
        return choice1;
    }
}

// Declaring a ArrayList for Member Details
class MemberDetails{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> age = new ArrayList<Integer>();
    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<Long> phoneNumber = new ArrayList<Long>();
    ArrayList<Long> fineDue = new ArrayList<Long>();
    ArrayList<String> book = new ArrayList<String>();
    String loginName;
    long loginNumber;
}

//Declaring a class to inherit it with the other class.
class StudentManager extends MemberDetails{
    int registerMember(String input_name,int input_age,long input_phoneNumber){
        name.add(input_name);
        age.add(input_age);
        phoneNumber.add(input_phoneNumber);
        fineDue.add((long)0);
        book.add("none");
        id.add(name.indexOf(input_name)+1);
        System.out.println(id);
        return name.indexOf(input_name)+1;
    }

    void removingMember(int inputStatus,int memberID, String inputName, long inputPhoneNumber){
        if(inputStatus == 1){
            if(id.contains(memberID)) {
                memberID = memberID-1;
                name.set(memberID, "null");
                age.set(memberID, -1);
                phoneNumber.set(memberID, (long) -1);
                fineDue.set(memberID, (long) -1);
                book.set(memberID, "null");
                id.set(memberID, -1);
            }else{
                System.out.println("The Member of this ID does not exits!");
            }

        } else if (inputStatus == 2) {
            if (name.contains(inputName)) {
                memberID = name.indexOf(inputName);
                name.set(memberID, "null");
                age.set(memberID, -1);
                phoneNumber.set(memberID, (long) -1);
                fineDue.set(memberID, (long) -1);
                book.set(memberID, "null");
                id.set(memberID, -1);
            }else{
                System.out.println("The Member of this name does not exits!");
            }
        }else{
            if(phoneNumber.contains(inputPhoneNumber)) {
                memberID = phoneNumber.indexOf(inputPhoneNumber);
                name.set(memberID, "null");
                age.set(memberID, -1);
                phoneNumber.set(memberID, (long) -1);
                fineDue.set(memberID, (long) -1);
                book.set(memberID, "null");
                id.set(memberID, -1);
            }else{
                System.out.println("The Member of this Phone Number does not exits!");
            }
        }
    }

    void viewDetails(){
        for(int i = 0; i< name.size();i++){
            if (!name.get(i).equals("null")){
                System.out.println("---------------------------------------------------------");
                System.out.println("The name of the member is: " + name.get(i));
                System.out.println("The Phone number of the member is: "+phoneNumber.get(i));
                System.out.println("The age of the member is: "+age.get(i));
                System.out.println("The ID of the member is: "+id.get(i));
                System.out.println("The Fines to be paid is: "+fineDue.get(i));
                System.out.println("Their issued books are: "+book.get(i));
                System.out.println("");
            }
        }
    }
}

//Declaring a ArrayList for Books Details
class BookDetails{
    ArrayList<Integer> bookId = new ArrayList<Integer>();
    ArrayList<String> bookAuthor = new ArrayList<String>();
    ArrayList<Integer> bookCopies = new ArrayList<Integer>();
    ArrayList<String> bookTitle = new ArrayList<String>();
    ArrayList<Integer> copiesAvailable = new ArrayList<Integer>();
    HashMap<Long, ArrayList<Integer>> myBook = new HashMap<>(); //List of bookID and key as a phone number
    ArrayList<Integer> bookIdArr = new ArrayList<Integer>();
    long time1 = (long)0;
    long time2 = (long)0;
    long time1_final = (long)0;
    long time2_final = (long)0;
}

// Declaring an interface for Multi-Inheritance with class.
class BooksOfLibrary extends BookDetails {
    int addBook(String inputBookTitle,String inputBookAuthor,int inputBookCopies){
        bookAuthor.add(inputBookAuthor);
        bookTitle.add(inputBookTitle);
        bookCopies.add(inputBookCopies);
        copiesAvailable.add(inputBookCopies);
        bookId.add(bookAuthor.indexOf(inputBookAuthor)+1);
        return bookAuthor.indexOf(inputBookAuthor)+1;
    }

    void removeBook(int status,String inputBookTitle,String inputBookAuthor,int inputBookID) {
        if (status == 1) {
            if (bookTitle.contains(inputBookTitle)) {
                int index = bookTitle.indexOf(inputBookTitle);
                bookAuthor.set(index, "null");
                bookTitle.set(index, "null");
                bookCopies.set(index, -1);
                copiesAvailable.set(index, -1);
                bookId.set(index, -1);
            } else {
                System.out.println("No Book with this Book Title exists!");
            }
        } else if (status == 2) {
            if (bookAuthor.contains(inputBookAuthor)) {
                int index = bookAuthor.indexOf(inputBookAuthor);
                bookAuthor.set(index, "null");
                bookTitle.set(index, "null");
                bookCopies.set(index, -1);
                copiesAvailable.set(index,-1);
                bookId.set(index, -1);
            }else{
                System.out.println("No Book with this Book Title exists!");
            }
        } else if (status == 3) {
            if (bookId.contains(inputBookID)) {
                int index = bookId.indexOf(inputBookID);
                bookAuthor.set(index, "null");
                bookTitle.set(index, "null");
                bookCopies.set(index, -1);
                copiesAvailable.set(index,-1);
                bookId.set(index, -1);
            }else {
                System.out.println("No Book with this Book Title exists!");
            }
        }
    }

    void viewBooks(){
        for(int i = 0; i< bookTitle.size();i++){
            if(!bookTitle.get(i).equals("null")){
                System.out.println("--------------------------------------------");
                System.out.println("Book ID is: "+bookId.get(i));
                System.out.println("Author of the book is: "+bookAuthor.get(i));
                System.out.println("Title of the book is: "+bookTitle.get(i));
                System.out.println("Copies of the book is: "+bookCopies.get(i));
                System.out.println("");
            }
        }
    }
}

// Librarian Class
class Librarian {
    protected boolean statusLogin = false;

    boolean libProtectionIDConfirmation() {
        System.out.println("Enter Password or to return back, type 'Back'.");
        System.out.print("Enter Password to open librarian access page (Password is : 'Librarian@123' ): ");
        String pass_input = "";
        boolean flag2 = true;
        while (flag2) {
            try {
                Scanner sc2 = new Scanner(System.in);
                pass_input = sc2.nextLine();
                String pass = "Librarian@123";
                if (pass_input.equals(pass)) {
                    System.out.println("You are Logged in!");
                    flag2 = false;
                    statusLogin = true;
                } else if (pass_input.equalsIgnoreCase("Back")) {
                    break;
                } else {
                    System.out.print("Wrong Password! Enter Again! or to return back, type 'Back': ");
                }
            } catch (Exception e) {
                System.out.println("Your input is invalid and caused exception " + e);
            }
        }
        return statusLogin;
    }

    void libInterface(StudentManager objStud, BooksOfLibrary objBook) {
        while (true) {
            System.out.println("");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("|Librarian Portal                                                    |");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("| 1. | Register a Member                                             |");
            System.out.println("| 2. | Remove a Member                                               |");
            System.out.println("| 3. | Add a book                                                    |");
            System.out.println("| 4. | Remove a book                                                 |");
            System.out.println("| 5. | View all members along with their books and fines to be paid  |");
            System.out.println("| 6. | View all books                                                |");
            System.out.println("| 7. | Back                                                          |");
            System.out.println("|--------------------------------------------------------------------|");

            ErrorHandler ec2 = new ErrorHandler();
            int choice2 = ec2.ErrorInt(1, 8);
            if (choice2 == 1) {

                //Code for Registering a member
                Scanner sc4 = new Scanner(System.in);
                System.out.print("Enter Name: ");
                String inputName = sc4.nextLine();
                //System.out.println(((inputName != null) && (!inputName.equals("")) && (inputName.matches("^[a-zA-Z]*$"))));
                System.out.print("Enter Age: ");
                int inputAge = sc4.nextInt();
                System.out.print("Enter Phone Number: ");
                long inputPhoneNumber = sc4.nextLong();
                int id = objStud.registerMember(inputName, inputAge, inputPhoneNumber);
                System.out.println("Member Successfully Registered with Member ID as: " + id);

            } else if (choice2 == 2) {
                //NOTE: Nested If-else started in this section!
                //Code for removing a member
                int choice3 = 0;
                System.out.println("|---------------------------------|");
                System.out.println("|Choose way to remove the member: |");
                System.out.println("|---------------------------------|");
                System.out.println("| 1. | Member's ID                |");
                System.out.println("| 2. | Member's Name              |");
                System.out.println("| 3. | Member's Phone Number      |");
                System.out.println("| 4. | Back                       |");
                System.out.println("|---------------------------------|");
                ErrorHandler ec = new ErrorHandler();
                choice3 = ec.ErrorInt(1, 5);
                if (choice3 == 1) {
                    Scanner sc5 = new Scanner(System.in);
                    System.out.print("Enter the Member's ID: ");
                    int input_memberID = sc5.nextInt();
                    objStud.removingMember(choice3, input_memberID, "null", (long) -1);
                } else if (choice3 == 2) {
                    System.out.print("Enter the Member's Name: ");
                    Scanner sc5 = new Scanner(System.in);
                    String inputName = sc5.nextLine();
                    objStud.removingMember(choice3, -1, inputName, (long) -1);
                } else if (choice3 == 3) {
                    System.out.print("Member's Phone Number: ");
                    Scanner sc5 = new Scanner(System.in);
                    long inputPhoneNumber = sc5.nextLong();
                    objStud.removingMember(choice3, -1, "null", inputPhoneNumber);
                }
                //Nested If-else ended!
            } else if (choice2 == 3) {
                //Code for adding a book
                Scanner sc6 = new Scanner(System.in);
                System.out.print("Enter Book Title: ");
                String bookTitle = sc6.nextLine();
                System.out.print("Enter Author of the Book: ");
                String bookAuthor = sc6.nextLine();
                System.out.print("Enter the number of copies: ");
                int bookCopies = sc6.nextInt();
                objBook.addBook(bookTitle, bookAuthor, bookCopies);

            } else if (choice2 == 4) {
                //Remove a book
                int choice4 = 0;
                System.out.println("|---------------------------------|");
                System.out.println("|Choose way to remove the books:  |");
                System.out.println("|---------------------------------|");
                System.out.println("| 1. | Book's Title               |");
                System.out.println("| 2. | Book's Author              |");
                System.out.println("| 3. | Book's ID                  |");
                System.out.println("| 4. | Back                       |");
                System.out.println("|---------------------------------|");
                ErrorHandler ec = new ErrorHandler();
                choice4 = ec.ErrorInt(1, 5);
                if (choice4 == 1) {
                    Scanner sc5 = new Scanner(System.in);
                    System.out.print("Enter the Book's Title: ");
                    String input_bookTitle = sc5.nextLine();
                    objBook.removeBook(choice4, input_bookTitle, "null", -1);
                } else if (choice4 == 2) {
                    System.out.print("Enter the Book's Author: ");
                    Scanner sc5 = new Scanner(System.in);
                    String inputBookAuthor = sc5.nextLine();
                    objBook.removeBook(choice4, "null", inputBookAuthor, -1);
                } else if (choice4 == 3) {
                    System.out.print("Enter the book's ID: ");
                    Scanner sc5 = new Scanner(System.in);
                    int inputBookID = sc5.nextInt();
                    objBook.removeBook(choice4, "null", "null", inputBookID);
                }
            } else if (choice2 == 5) {
                //Code for viewing all members along with their books and fines to be paid
                objStud.viewDetails();
            } else if (choice2 == 6) {
                //Code for viewing all books
                objBook.viewBooks();
            } else {
                // Back
                break;
            }

        }
    }

    void studInterface(StudentManager objStud, BooksOfLibrary objBook) {
        while (true) {
            System.out.println("");
            System.out.println("|------------------------------------------|");
            System.out.println("|Member Portal                             |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 1. | List Available Books                |");
            System.out.println("| 2. | List My Books                       |");
            System.out.println("| 3. | Issue book                          |");
            System.out.println("| 4. | Return book                         |");
            System.out.println("| 5. | Pay Fine                            |");
            System.out.println("| 6. | Back                                |");
            System.out.println("|------------------------------------------|");

            ErrorHandler ec2 = new ErrorHandler();
            int choice5 = ec2.ErrorInt(1, 7);
            if (choice5 == 1) {
                //Code to list Available Books

            } else if (choice5 == 2) {
                // Code to list the books issued previously

            } else if (choice5 == 3) {
                //Code to return Issue Book

            } else if (choice5 == 4) {
                //Code to return Book

            } else if (choice5 == 5) {
                //Code to show and pay fine.

            } else {
                break;
            }
        }
    }
}

class Member{
    //Confirmation the ID for login!
    protected boolean statusLogin = false;
    boolean memLogin(StudentManager objStud){
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter the name: ");
        objStud.loginName = sc7.nextLine();
        System.out.print("Enter the Phone Number: ");
        objStud.loginNumber= sc7.nextLong();
        if(objStud.phoneNumber.contains(objStud.loginNumber)){
            statusLogin = true;
            System.out.println("You are Logged in! Welcome inputName. Member ID as: "+objStud.id.get(objStud.phoneNumber.indexOf(objStud.loginName)));
        }else{
            System.out.println("These entries are not registered as Library account!");
        }
        return statusLogin;
    }

    void libInterface(StudentManager objStud, BooksOfLibrary objBook){
        while(true) {
            if (!memLogin(objStud)) {
                continue;
            } else {
                break;
            }
        }
        while (true){
            System.out.println("");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("|Member Portal                                                       |");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("| 1. | List Available Books                                          |");
            System.out.println("| 2. | List My Books                                                 |");
            System.out.println("| 3. | Issue Book                                                    |");
            System.out.println("| 4. | Return Book                                                   |");
            System.out.println("| 5. | Pay Fine                                                      |");
            System.out.println("| 6. | Back                                                          |");
            System.out.println("|--------------------------------------------------------------------|");

            ErrorHandler ec = new ErrorHandler();
            int choice6 = ec.ErrorInt(1, 7);
            if(choice6 == 1){
                System.out.println("Books available for issue: ");
                //Printing all available Books
                for(int i=0; i<(objBook.copiesAvailable.size());i++){
                    if (objBook.copiesAvailable.get(i)>0){
                        System.out.print("|Book Title: "+objBook.bookTitle.get(i));
                        System.out.print(" | Book Author: "+objBook.bookAuthor.get(i));
                        System.out.println(" | Book ID: "+objBook.bookId.get(i)+" |");
                    }
                }

            } else if (choice6 == 2) {
                //Printing all previous issue Books
                //objBook.myBook.put(objStud.loginNumber,bookname_array)
                ArrayList<Integer> retrievedList = objBook.myBook.get(objStud.loginNumber);
                if (retrievedList != null) {
                    for (int bookID: retrievedList){
                        System.out.println("");
                        System.out.println("Book Title: "+ objBook.bookTitle.get(objBook.bookId.indexOf(bookID)));
                        System.out.println("Book ID: "+ bookID);
                        System.out.println("------------------------------");
                    }
                } else {
                    System.out.println("Your Book list is empty.");
                }

            } else if (choice6 == 3) {
                boolean statuspass = true;
                //Code for issuing a book.

                //Displaying Books available for issuing:
                System.out.println("Available Books: ");
                for(int i=0; i<(objBook.copiesAvailable.size());i++){
                    if (objBook.copiesAvailable.get(i)>0){
                        System.out.print("|Book Title: "+objBook.bookTitle.get(i));
                        System.out.print(" | Book Author: "+objBook.bookAuthor.get(i));
                        System.out.println(" | Book ID: "+objBook.bookId.get(i)+" |");
                    }
                }

                //Checking the fine is zero:
                long fineValue = objStud.fineDue.get(objStud.phoneNumber.indexOf(objStud.loginNumber));
                if (fineValue==(long)(0) && (System.currentTimeMillis()/1000-objBook.time1)>10){
                    statuspass = true;
                }else{
                    statuspass = false;
                    System.out.print("First, give your fines!");
                    break;
                }

                // Letting to choose which book to issue:
                System.out.print("Enter the Book ID to issue that book: ");
                Scanner sc = new Scanner(System.in);
                int bookID = sc.nextInt();

                //Taking the initial input
                if (objBook.time1 == (long)0){
                    objBook.time1 = System.currentTimeMillis()/1000;
                    objBook.bookIdArr.set(bookID,0);
                }else{
                    objBook.time2 = System.currentTimeMillis()/1000;
                    objBook.bookIdArr.set(bookID,1);
                }
                //Updating Copies in available hashmap
                objBook.copiesAvailable.set(objBook.bookId.indexOf(bookID),objBook.copiesAvailable.get(objBook.bookId.indexOf(bookID))-1);

                //my books update
                if (!objBook.myBook.containsValue(bookID)){
                    ArrayList<Integer> retrievedList = objBook.myBook.get(objStud.loginNumber);
                    retrievedList.add(bookID);
                    objBook.myBook.put(objStud.loginNumber,retrievedList);
                }
            }else if(choice6 == 4){
                //Returning a book
                // Here we change the array list that preserves the issued books
                for(int element: objBook.bookIdArr){
                    if (element!=0) {
                        System.out.println("The Book ID that is issued is: " + element);
                    }
                }

                System.out.println("Enter Book ID to return that book: ");
                Scanner sc9 = new Scanner(System.in);
                int returnID = sc9.nextInt();
                if (objBook.bookIdArr.indexOf(returnID)==2){
                    objBook.time2_final = System.currentTimeMillis()/1000;
                }else{
                    objBook.time1_final = System.currentTimeMillis()/1000;
                }
                objBook.bookIdArr.set(objBook.bookIdArr.indexOf(returnID),0);

                //No.of copies update:
                objBook.copiesAvailable.set(objBook.bookId.indexOf(returnID),objBook.copiesAvailable.get(objBook.bookId.indexOf(returnID))+1);


            } else if (choice6 == 5) {
                //Paying Fine
                long time_1 = (objBook.time1_final-objBook.time1)-10;
                if(time_1>0){
                    System.out.println("You have to pay the fine of Rs: "+(time_1*3));
                    if (objBook.time2!=(long)0) {
                        if(objBook.time2_final - objBook.time2>10) {
                            long time_2 = ((System.currentTimeMillis() / 1000) - objBook.time2)-10;
                            System.out.println("You have to pay the fine of Rs: " + (time_2 * 3));
                        }
                    }
                }
                System.out.println("You have paid the amount!");
            } else{
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Librarian lib = new Librarian();
        Member mem = new Member();
        StudentManager objStud = new StudentManager();
        BooksOfLibrary objBook =new BooksOfLibrary();

        while (true) {
            System.out.println("|---------------------------|");
            System.out.println("|Library Portal Initialized |");
            System.out.println("|---------------------------|");
            System.out.println("| 1. | Enter as a Librarian |");
            System.out.println("| 2. | Enter as a Member    |");
            System.out.println("| 3. | Exit                 |");
            System.out.println("|---------------------------|");

            // Taking Input for the Librarian Login or Member Login:
            ErrorHandler ec = new ErrorHandler();
            int choice1 = ec.ErrorInt(1,4);

            //Initializing classes according to choice of the user:
            if (choice1 == 1) {
                boolean temp = lib.libProtectionIDConfirmation();
                if (temp) {
                    lib.libInterface(objStud,objBook);
                }
            } else if (choice1 == 2) {
                mem.libInterface(objStud,objBook);
            } else {
                System.out.println("|---------------------------|");
                System.out.println("|Thanks for visiting!       |");
                System.out.println("|---------------------------|");
                break;
            }
        }
    }
}