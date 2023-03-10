import com.patterns.singleton.UtilString;

public class Main {
    public void printString(String str) {
        if (UtilString.getInstance().isEmpty(str)) { //always a single instance; saves memory
            System.out.println("String: null");
        }
        else {
            System.out.println("String: " + str);
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        String str1 = "One";
        String str2 = "";
        String str3 = null;
        m.printString(str1);
        m.printString(str2);
        m.printString(str3);

        /*UtilString util = new UtilString(); //lack of singleton pattern
        System.out.println("Test 1: " + util.isEmpty(str1));
        System.out.println("Test 2: " + util.isEmpty(str2));
        System.out.println("Test 3: " + util.isEmpty(str3));*/
    }
}