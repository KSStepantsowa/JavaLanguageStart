import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  This is Java the first Java string
        String userGreeting = "Hi there!";
        System.out.println(userGreeting);

//  Update Method
//  Uppercase Method
        String spanishUserGreeting = userGreeting.replace("there", "amigo");
        String uppercaseUserGreeting = userGreeting.toUpperCase();
        System.out.println(spanishUserGreeting);
        System.out.println(uppercaseUserGreeting);

//  The first part of homework: Name, Surname, Profession
        String Name = "Karina";
        String Surname = "Stepantsova";
        String Profession = "QA";
        String FullNameSurnameProfession = String.format("My name is %s %s. I am %s.", Name, Surname, Profession);
        System.out.println(FullNameSurnameProfession);

//  String length method
        String userNameCounter = "Karina";
        System.out.println("The length of my name is " + userNameCounter.length() + " symbols");

//  Symbol returning
        char firstNameLetter = Name.charAt(0);
        char firstSurnameLetter = Surname.charAt(0);
        System.out.print(firstNameLetter);
        System.out.println(firstSurnameLetter);

//  Scanner
        System.out.println("Let's get each other know! What is your name?");
        Scanner object = new Scanner(System.in);
        String userName = object.nextLine();

//  Boolean method
        String emptyUserName = "";
        System.out.println(userName.isEmpty());
        System.out.println(emptyUserName.isEmpty());

//  Equals method
        System.out.println("Please, write down you profession");
        String userProfession = object.nextLine();
        String professionSame = "QA";
        String professionNotSame = "AQA";
        System.out.println(professionSame.equals(userProfession));
        System.out.println(professionNotSame.equals(userProfession));

//  Casesensitive method
        System.out.println("Do you like your job?");
        String userJobAnswer = object.nextLine();
        String jobLover = "Y";
        String jobHater = "N";
        boolean caseSensitiveAnswer = jobLover.equalsIgnoreCase(userJobAnswer);
//  Starts, Ends Contain method
        boolean StartsWithY = userJobAnswer.startsWith("Y");
        boolean endsWithS = userJobAnswer.endsWith("S");
        boolean endsWithE = userJobAnswer.contains("E");
        System.out.println(caseSensitiveAnswer);
        System.out.println(StartsWithY);
        System.out.println(endsWithS);
        System.out.println(endsWithE);

//  Buffer (append) Method
        StringBuffer introductionWord = new StringBuffer("Let's see the last part of my Homework, ");
        introductionWord.append("dear ");
        introductionWord.append("reader");
        System.out.println(introductionWord);

        byte byteMathSampleN1 = 1;
        short shortMathSampleN1 = -200;
        System.out.println((shortMathSampleN1 + byteMathSampleN1) * 8779);
        int intSampleN1 = 26 ;
        System.out.println(Name + " " + intSampleN1 + " y.o. (will be...soon)");
        long creditCardNumber = 4111_1111_1111_1111L;
        System.out.println("This is the best sample of where to use long primitive type " + creditCardNumber);
        float floatMathSampleN1 = 0.89f;
        double doubleMathSampleN1 = 9.52d;
        System.out.println(floatMathSampleN1 * doubleMathSampleN1 / 8.99778);

        System.out.println("I hope you liked my JavaLanguageStart project, " + userName);
        System.out.println("Let/'s see my next homework :)");
    }
}