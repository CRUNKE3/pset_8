import java.util.regex.Pattern;

public class AccountOwner {
    String sal = "";
    String first = "";
    String last = "";
    String email = "";
    long phone = 0;
    MailingAddress mail;

    public AccountOwner(java.lang.String salutation,
                        java.lang.String firstName,
                        java.lang.String lastName,
                        java.lang.String emailAddress,
                        long phoneNumber,
                        MailingAddress mailingAddress) {
        sal = salutation;
        first = firstName;
        last = lastName;
        email = emailAddress;
        phone = phoneNumber;
        mail = mailingAddress;
    }


    public String getName(int format) {
        String formattedName = "";
        switch (format) {
            case 3:
                formattedName = last + ", " + first;
                break;
            case 2:
                formattedName = sal + ". " + last;
                break;
            default:
                formattedName = first + " " + last;
                break;
        }
        return formattedName;
    }

    public String getFormattedPhoneNumber() {
        String strPhone = String.valueOf(phone);
        String[] phoneDigits = strPhone.split("");
        String formattedPhone = "(" + phoneDigits[0] + phoneDigits[1] + phoneDigits[2] + ") " + phoneDigits[3] + phoneDigits[4] + phoneDigits[5] + "-" + phoneDigits[6] + phoneDigits[7] + phoneDigits[8] + phoneDigits[9];
        return formattedPhone;
    }

    public String validateSalutation(String salutation) {
        if (sal == null || sal.length() == 0) {
            return null;
        } else {
            return sal;
        }
    }

    public String validateEmailAddress(String emailAddress) {
        String[] emailArray = email.split("");
        if (email.length() > 254 || email.length() < 7) {
            return null;
        } else {
            for (int i = 0; i < emailArray.length; i++) {
                if (emailArray[i].equals("@") || emailArray[i].equals(".")) {
                    if (i == 0 || i == email.length() - 1) {
                        return null;
                    } else if (emailArray[i + 1].equals("@") || emailArray[i - 1].equals("@") || emailArray[i + 1].equals(".") || emailArray[i - 1].equals(".")) {
                        return null;
                    } else if (emailArray[i].equals(".") && i + 4 != email.length()) {
                        return null;
                    }
                }
            }
            return email;
        }

    }

    public long validatePhoneNumber(long phoneNumber) {
        String strPhone = String.valueOf(phone);
        if (strPhone.length() != 10) {
            return 0L;
        } else {
            return phone;
        }
    }

    public java.lang.String getSalutation() {
        return sal;
    }

    public void setSalutation(String salutation) {
        sal = salutation;
    }

    public String getFirstName() {
        return first;
    }

    public void setFirstName(String firstName) {
        first = firstName;
    }

    public String getLastName() {
        return last;
    }

    public void setLastName(String lastName) {
        last = lastName;
    }

    public String getEmailAddress() {
        return email;
    }

    public void setEmailAddress(String emailAddress) {
        email = emailAddress;
    }

    public long getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(long phoneNumber) {
        phone = phoneNumber;
    }

    public MailingAddress getMailingAddress() {
        return mail;
    }

    public void setMailingAddress(MailingAddress mailingAddress) {
        mail = mailingAddress;
    }
}