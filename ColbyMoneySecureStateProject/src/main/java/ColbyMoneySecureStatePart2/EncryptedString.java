package ColbyMoneySecureStatePart2;

public class EncryptedString {
    private String string;
    public EncryptedString(String s) { string = s; }
    public String getString() { return string; }
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof EncryptedString)) {
            return false;
        }
        // typecast o to Complex so that we can compare data members
        EncryptedString es = (EncryptedString) o;

        // Compare the data members and return accordingly
        return string.equals(es.getString());
    }
}
