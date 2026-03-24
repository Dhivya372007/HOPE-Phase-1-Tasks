public class StringBuilderAndBuffer{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.toString());
        StringBuffer sbf=new StringBuffer("Hello");
        System.out.println(sbf);
        sbf.append(" World");
        System.out.println(sbf);
    }
}
