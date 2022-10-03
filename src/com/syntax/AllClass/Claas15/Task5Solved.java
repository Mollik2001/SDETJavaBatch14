package com.syntax.AllClass.Claas15;

public class Task5Solved {

   // Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

    String createEmail(String firstName, String lastName, String emailType) {
        return firstName + lastName + "@"+emailType.toLowerCase();
    }


    public static void main(String[] args) {
    Task5Solved Task5=new Task5Solved();
String fullEmail=Task5.createEmail("John","snow","gmail");
        System.out.println(fullEmail);

    }
}