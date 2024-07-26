package JAVA._18_OOPS._11_Abstraction;

public class hello {
    public static void main(String[] args) {
        String s = "3465";
        int k = 3;

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length() ; i+=k){
            int sum = 0;
            for(int j=i ; j < (i+k) && j < s.length() ; j++){
                sum += (s.charAt(j) - '0');
            }
            sb.append(sum);
            System.out.println(sb);
        }
    }
}
