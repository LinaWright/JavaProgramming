package day26_Nested_Loop;

public class test {
    public static void main(String[] args) {
        String s1="wooden spoon";
        String s2 = s1.substring(s1.indexOf("s"));
        System.out.println(s2);

        System.out.println("----------------------");

        String ta="A";
        ta=ta+"B";
        String tb = "C";
        ta = ta + tb;
        System.out.println(ta);
        ta.replace('C','D');//ta= (Didn't assign, so ta is still going to be ABC)
        System.out.println(ta);
    }
}
