package Interview_questions.java;

public class Finra {
    /*
    similar to fizzbuzz

    number
        % 3 --> fin
        % 5 --> ra
        both --> finra
        neither --> number

    repeated up to some number
     */
    public static String finra (int num){
        String str="";
        if(num!=0){
            if(num%3==0&&num%5==0){
                str = "finra";
            }else if(num%5==0){
                str = "ra";
            }else if(num%3==0){
                str = "fin";
            }else {
                System.out.println(num);;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(finra(num));
    }
}
