package fundementalRevision;


import java.util.Random;
import java.util.Scanner;

public class Revision {

    public static void main(String[] args) {



        char u = 'u';
        int day = 0, month = 0, year = 0;
        int age = 0;
        boolean validYear = false, validName = false;
        String firstName = "", lastName= "", name="";

        // initialize scanner class to getting input from user
        Scanner scanner = new Scanner(System.in);


        while (!validName) {
            System.out.println("Whats your full name?");
            name = scanner.nextLine();

            if (name.indexOf(' ') == -1) {
                validName = false;
                System.out.println("OOps! Looks like you forgot to enter your full name");
            }

                else{
                    validName = true;
            }
        }



        // split the full name to first and last name
            int spaceIndex = name.indexOf(' ');
            firstName = name.substring(0, spaceIndex);
            lastName = name.substring(spaceIndex + 1);





            // lowercase all the char in name
            name = name.toLowerCase();


            // capitalize the first letter of the names
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);


        System.out.println("\nHello there " + firstName + " I hope to help you revise some Java");
        System.out.println("\nHere are some interesting facts about your name: ");

        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);






        //find the length of the name
        System.out.println("Your name is " +name.length() + " characters long");





        // check if firstName == lastName
        if (firstName.equals(lastName)) System.out.println("Your first name and last name are the same");





        // find how many vowels are in the name
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        char vowelsCaps[] = {'A', 'E', 'I','O','U'};

        int vowelsCount = 0;

        String highlightedName = name;


       for (int letter = 0; letter<name.length(); letter ++ ){
        for (int i = 0; i < vowels.length;i ++){

            if (name.charAt(letter) == vowels[i]){

            ++vowelsCount;



            //capitalize the vowels to highlight them
                // replace lowercase vowels in the name with uppercase vowels
            highlightedName = highlightedName.replace(vowels[i], vowelsCaps[i]);

            }
        }

        }


        System.out.println("Your name has " + vowelsCount + " vowels "+ "vowels ("+ highlightedName +")." );




       // check if name is palindromic
       boolean palindrome = true;

       String nameUpper = firstName.toUpperCase();

       for (int count  = 0; count< nameUpper.length(); count++ ){
           if (nameUpper.charAt(count) != nameUpper.charAt(nameUpper.length() -1 - count)){
               palindrome = false;

               break;

           }
       }
        if (palindrome){
            System.out.println("Your first name is palindromic (reads the same backwards as forwards) !");

        }
        else {
            System.out.println("Your first name is not palindromic.");
        }

        // Ask user for a valid month and year

        while (month == 0){
            System.out.println("\nName the month were you born in( in small letters !!): ");
            String monthName = scanner.nextLine();

            monthName = monthName.toLowerCase();



            // get the number of the month
            switch (monthName){
                case "january": month = 1; break;
                case  "february": month = 2; break;
                case  "march": month = 3; break;
                case "april": month = 4; break;
                case  "may": month = 5;break;
                case "june": month = 6; break;
                case "july": month = 7; break;
                case "august": month = 8; break;
                case "september": month = 9; break;
                case "october": month = 10;break;
                case "november": month = 11; break;
                case "december": month = 12; break;
                default: month = 0; break;
            }
            if(month == 0) System.out.println("Emmm that doesn't look like a valid month...");
        }




            // Ask for a valid birth year
        int count  = 0;
        do {
            if (count> 0 ){
                System.out.println("\nHmmmm that doesn't look like a year you could be born in!");
                System.out.println("Try a year between 1910 and 2020");
            }



            // ask for the birth year
            System.out.println("what year were you born in");
            year = scanner.nextInt();
            validYear = (year>= 1910 && year <2020)? true: false;
            count++;
        }
        while (!validYear);





        // calculate how old you are

        System.out.println("\nSome interesting facts about your birthday");

        if (month == 1){
            System.out.println("you were born on the 1st month");
        }
            else if (month == 2){
            System.out.println("You were born on the 2nd month");
        }

            else if (month == 3 ){
            System.out.println("You were born on the 3rd moth");
        }
            else {
            System.out.println("You were bon on the " + month+ " th month");
        }




            // calculate their age

            age = 2020 - year;
        System.out.println("You are " + age+ " years old");





        // Checking how old are they in different units:

        System.out.println("You are " + (age * 12)+ " months old.");
        System.out.println("You are around " + (age * 52)+ " weeks old");
        System.out.println("You are approximately " + (age * 365)+ " days old");
        System.out.println("You are over " + (age * 365 * 24)+ " hours old.");




        // check if the age is odd or even number

        if(age % 2 == 0){
            System.out.println("Your age is an even number");
        }
        else {
            System.out.println("you age is an odd number");
        }




        // check if the year is divisible by 400 or is divisible by 4 and not by divisible by 100

        if ((year % 400 == 0)||(year % 4 ==0)&&(year % 100 !=0)){
            System.out.println("The year is a leap year!");

        }
        else {
            System.out.println("You were not born on a leap year");
        }






        // initialize Random class to gender random number
        Random randomNumber = new Random();
        int luckNumber = randomNumber.nextInt(12);





        // get the digits in the ones, tens, hundreds and the thousands place of the birth year.

        // e.g. if the year = 2013

        int oneDigit = year % 10;
        int tensDigit = year/10 %10;
        int hundredsDigit = year /100 %10;
        int thousandsDigit = year/1000 % 10;


        // Raise number to the power of 4
        double powerDigit  = Math.pow(thousandsDigit,4);



        // add and substract someDigit from the birth year
        int result = oneDigit - hundredsDigit + tensDigit;




        // add result with the randomly generated number
        luckNumber += result;

        System.out.println("Your lucky number is: " + luckNumber);



        // lucky dates
        // create an int array of length 3
        int luckyDates[] = new int[3];
        for (int i = 0; i< luckyDates.length; i++){
            int randomDate = randomNumber.nextInt(30)+ 1;
            luckyDates[i] = randomDate;
        }
        System.out.println("your lucky dates are: " );

        for (int i =0; i<luckyDates.length;i++ ){
            if (i == luckyDates.length - 1){
                System.out.println("and " + luckyDates[i] + "\n\n");
            }
            else {
                System.out.println(luckyDates[i]+ ",");
            }
        }



        }

    }




