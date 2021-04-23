public class _58 {
    public static void main(String[] args) {
//        System.out.println(reverseWords("I am a student."));
        System.out.println(reverseWords("a good   example"));
    }
    private static String reverseWords(String s) {
        String[] tmp = s.trim().split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = tmp.length - 1; i >= 0; i--) {
            if (tmp[i].equals("")) continue;
            str.append(tmp[i] + " ");
        }
        System.out.println(str.toString());
        return str.toString().trim();
    }
}
