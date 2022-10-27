package group_task.task3;

public class ValidPassword {



          /*
    Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
     */


        public static boolean password(String pass){
            int uppercase =0 , lowercase =0 ,digit =0 ,special =0;
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isUpperCase(pass.charAt(i))){
                    uppercase++;
                }else if (Character.isLowerCase(pass.charAt(i))){
                    lowercase++;
                }else if(Character.isDigit(pass.charAt(i))){
                    digit++;
                }else {
                    special++;
                }
            }
            return (pass.length() >= 6 && uppercase >= 1 && lowercase >= 1 && digit >= 1 && special >= 1 && !pass.contains(" "));

        }

        public static void main(String[] args) {
            System.out.println(password("23qeD&*"));}

    }



//public static boolean verifyPassword(String str) {
//        if (str.length() >= 6 && !str.contains(" ")) {
//            return true;
//        }
//        int upperCase = 0;
//        int lowerCase = 0;
//        int specialCase = 0;
//        int digit = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
//                upperCase++;
//            } else if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
//                lowerCase++;
//            } else if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
//                digit++;
//            } else if(str.charAt(i) <= '<' && str.charAt(i)>= '>') {
//                specialCase++;
//            }
//        }
//
//        return upperCase >= 1 && lowerCase >= 1 && specialCase >= 1 && digit >= 1;
//    }
//
//
//    public static void main(String[] args) {
//        String str = "La0@34";
//        System.out.println(verifyPassword(str));
//          }
//    }



