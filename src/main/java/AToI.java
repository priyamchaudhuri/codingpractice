import java.util.Locale;

public class AToI {
    public static void main(String[] args) {
        String s1="   -132";
        int i=myAtoI(s1);
        System.out.println(i);
    }

    public static int myAtoI(String s){
        {
            char[] str=s.toCharArray();
            // Initialize result
            int res = 0;

            // Initialize sign as positive
            int sign = 1;

            // Initialize index of first digit
            int i = 0;
             while(str[i]==' '){
                 i++;
             }
            // If number is negative, then
            // update sign
            if (str[i] == '-') {
                sign = -1;

                // Also update index of first
                // digit
                i++;
            }

            // Iterate through all digits
            // and update the result
            for (; i < str.length; ++i) {
                if (!(str[i]-'0'>=0 && str[i]-'0'<=9)){
                    return -1;
                }
                res = res * 10 + str[i] - '0';

            }
            // Return result with sign
            return sign * res;
        }
    }

}
