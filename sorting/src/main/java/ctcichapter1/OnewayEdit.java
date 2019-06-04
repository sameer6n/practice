package ctcichapter1;

public class OnewayEdit {

    public boolean isOneWayEdit(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        String shorter = s1.length() < s2.length() ? s1 : s2;
        String longer = s1.length() < s2.length() ? s2 : s1;
        int indexs = 0;
        int indexl = 0;
        boolean found = false;
        while (indexs < shorter.length() && indexl < longer.length()) {

            if (shorter.charAt(indexs) != longer.charAt(indexl)) {

                if (found)
                    return false;
                found = true;
                if (shorter.length() == longer.length())
                    indexs++;

            } else {
                indexs++;
            }
            indexl++;

        }
        return true;
    }
}