import java.util.Scanner;

public class MainClass {
    /*Let's formulate rules for sentence. Here, i formulate two laws.*/

    /*
    *I may accept unneccsary parameters but it is just better to create two methods for each to check the rule.
    * the first static method used to check whether the first letter is capital or not,
    * the second static methos used to check whether last character is fullstop or not.
    */

    static Character upCases[] = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};

    /*Rule 1 : the first letter of sentence should be in uppercase*/
    public static boolean checkFirstLetter (Character fl) {

        return new GrammerChecker(upCases,'.').interpretFirstLetter(fl);
    }
    /*Rule 2 : check the sentence ends with fullstop.*/
    public static boolean checkPeriod (String sentence){
        return new GrammerChecker(upCases,'.').interpretPeroiSymbol(sentence);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your simple sentence : ");
        String sentence = sc.nextLine();/* read all line where user type sentence.*/

        /*Check whether the first letter is capital or not*/
        boolean b1 = checkFirstLetter(sentence.charAt(0));

        /*check whether there is peroid at the end of the sentence*/
        boolean b2 = checkPeriod(sentence);

        /*manuplulate the resulr*/
        /*I have 4 resulr conditions.*/

        /*Result 1 : concerned with first letter and peroid*/
        if(b1 == true && b2 == true){
            System.out.println("--------------                              Your sentence in correct format!  ");
        }
        /*Result 2 : concerned with first letter.*/
        else if (b1 == false && b2 == true){
            System.out.println("--------------                              Your sentence's first letter is not in upper case. ");
        }
        /*Result 3 : concerned with peroid.*/
        else if(b1 == true && b2 == false){
            System.out.println("--------------                              Your sentence doesn't end with peroid(.).");
        }
        /*Result 4 : totally incorrect sentence*/
        else if (b1 == false && b2 == false){
            System.out.println("--------------                              Your sentence voilates English Grammer Rule!  ");
        }
    }
}
