package ctcichapter1;

public class CompressedString {

    public String getCompressedString(String str) {
        int index = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (index < str.length()) {

            if (index == str.length() - 1) {
                sb.append(str.charAt(index)).append(count);
            } else {
                if (str.charAt(index) != str.charAt(index + 1)) {
                    sb.append(str.charAt(index)).append(count);
                    count = 1;
                } else {
                    count++;
                }
            }
            index++;

        }
        if (sb.length() > str.length())
            return str;
        else {
            return sb.toString();
        }

    }
}
