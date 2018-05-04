import java.sql.*;
import java.util.Scanner;

public class Project2_Run {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Database data1 = new Database();

    System.out.print("Hello what would you like to do today? \nCreate an account (enter 0) "
        + "\nCheck out a book (enter 1) \nReturn a book (enter 2) \nAdd a book to the library (enter 3)");

    int doNext = input.nextInt();

    switch (doNext) {
      case 0:

        System.out.println("What is your first name?");
        String first = input.next();

        System.out.println("What is your last name?");
        String last = input.next();

        try {
          data1.addUser(first, last);
          System.out.println("Your ID is " + data1.getUserID(last));
        } catch (SQLException e) {
          e.printStackTrace();
        }
        break;

      case 1:
        try {
          data1.getBookTable();
          System.out.println("Which book would you like to check out? "
              + "Please enter the book's ID and your user ID separated by a space.");
          int book = input.nextInt();
          int user = input.nextInt();
          data1.checkOut(book, user);
          System.out.println("Great! You successfully checked out your book!");
        } catch (SQLException e) {
          e.printStackTrace();
        }
        break;

      case 2:
        try {
          System.out.println("Please enter the ID of the book you would like to return.");
          int book = input.nextInt();
          data1.returnBook(book);
          System.out.println("Success! You returned your book!");
        } catch (SQLException e) {
          e.printStackTrace();
        }
        break;

      case 3:
        try {

          System.out.println("Please enter the ISBN number of the book you would like to add.");
          int isbn = input.nextInt();

          System.out.println("Please enter the author of the book you would like to add.");
          String author = input.next() + " " + input.next();

          System.out.println("Please enter the number of words in the book's title");
          int num = input.nextInt();

          System.out.println("Please enter the title of the book you would like to add.");
          String title = input.next() + " ";
          for (int i = 1; i < num; i++) {
            title += input.next() + " ";
          }

          data1.addBook(title, author, isbn);

          System.out.println("Success! You added " + title + " to your library!");
        } catch (SQLException e) {
          e.printStackTrace();
        }
        break;

    }
  }

}
