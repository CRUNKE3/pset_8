public class MailingAddress {
    String primeSt = "";
    String secondSt = "";
    String cit = "";
    String stat = "";
    String pCode = "";

    public MailingAddress(java.lang.String primaryStreet,
                          java.lang.String secondaryStreet,
                          java.lang.String city,
                          java.lang.String state,
                          java.lang.String postalCode) {
        primeSt = primaryStreet;
        secondSt = secondaryStreet;
        cit = city;
        stat = state;
        pCode = postalCode;
    }


    public java.lang.String getFormattedAddress() {
        return validateStreet(primeSt) + " " + validateStreet(secondSt) + ", " + validateCity(cit) + ", " + validateState(stat) + " " + validatePostalCode(pCode);
    }

    public java.lang.String validateStreet(java.lang.String street) {
        if (street.length() <= 0) {
            return null;
        } else {
            return street;
        }
    }

    public java.lang.String validateCity(java.lang.String city) {
        if (city.length() <= 0) {
            return null;
        } else {
            return city;
        }
    }

    public java.lang.String validateState(java.lang.String state) {
        switch (state) {
            case "Alabama":
            case "AL":
                return "AL";
            case "Alaska":
            case "AK":
                return "AK";
            case "Arizona":
            case "AZ":
                return "AZ";
            case "Arkansas":
            case "AR":
                return "AR";
            case "California":
            case "CA":
                return "CA";
            case "Colorado":
            case "CO":
                return "CO";
            case "Connecticut":
            case "CT":
                return "CT";
            case "Delaware":
            case "DE":
                return "DE";
            case "Florida":
            case "FL":
                return "FL";
            case "Georgia":
            case "GA":
                return "GA";
            case "Hawaii":
            case "HI":
                return "HI";
            case "Idaho":
            case "ID":
                return "ID";
            case "Illinois":
            case "IL":
                return "IL";
            case "Indiana":
            case "IN":
                return "IN";
            case "Iowa":
            case "IA":
                return "IA";
            case "Kansas":
            case "KS":
                return "KS";
            case "Kentucky":
            case "KY":
                return "KY";
            case "Louisiana":
            case "LA":
                return "LA";
            case "Maine":
            case "ME":
                return "ME";
            case "Maryland":
            case "MD":
                return "MD";
            case "Massachusetts":
            case "MA":
                return "MA";
            case "Michigan":
            case "MI":
                return "MI";
            case "Minnesota":
            case "MN":
                return "MN";
            case "Mississippi":
            case "MS":
                return "MS";
            case "Missouri":
            case "MO":
                return "MO";
            case "Montana":
            case "MT":
                return "MT";
            case "Nebraska":
            case "NE":
                return "NE";
            case "Nevada":
            case "NV":
                return "NV";
            case "New Hampshire":
            case "NH":
                return "NH";
            case "New Jersey":
            case "NJ":
                return "NJ";
            case "New York":
            case "NY":
                return "NY";
            case "New Mexico":
            case "NM":
                return "NM";
            case "North Carolina":
            case "NC":
                return "NC";
            case "North Dakota":
            case "ND":
                return "ND";
            case "Ohio":
            case "OH":
                return "OH";
            case "Oklahoma":
            case "OK":
                return "OK";
            case "Oregon":
            case "OR":
                return "OR";
            case "Pennsylvania":
            case "PA":
                return "PA";
            case "Rhode Island":
            case "RI":
                return "RI";
            case "South Carolina":
            case "SC":
                return "SC";
            case "South Dakota":
            case "SD":
                return "SD";
            case "Tennessee":
            case "TN":
                return "TN";
            case "Texas":
            case "TX":
                return "TX";
            case "Utah":
            case "UT":
                return "UT";
            case "Vermont":
            case "VT":
                return "VT";
            case "Virginia":
            case "VA":
                return "VA";
            case "Washington":
            case "WA":
                return "WA";
            case "West Virginia":
            case "WV":
                return "WV";
            case "Wisconsin":
            case "WI":
                return "WI";
            case "Wyoming":
            case "WY":
                return "WY";
            default:
                return null;
        }
    }

    public java.lang.String validatePostalCode(java.lang.String postalCode) {
        if (postalCode.length() == 5) {
            return postalCode;
        } else {
            return null;
        }
    }

    public java.lang.String getPrimaryStreet() {
        return primeSt;
    }

    public void setPrimaryStreet(java.lang.String primaryStreet) {
        primeSt = primaryStreet;
    }

    public java.lang.String getSecondaryStreet() {
        return secondSt;
    }

    public void setSecondaryStreet(java.lang.String secondaryStreet) {
        secondSt = secondaryStreet;
    }

    public java.lang.String getCity() {
        return cit;
    }

    public void setCity(java.lang.String city) {
        cit = city;
    }

    public java.lang.String getState() {
        return stat;
    }

    public void setState(java.lang.String state) {
        stat = state;
    }

    public java.lang.String getPostalCode() {
        return pCode;
    }

    public void setPostalCode(java.lang.String postalCode) {
        pCode = postalCode;
    }
}