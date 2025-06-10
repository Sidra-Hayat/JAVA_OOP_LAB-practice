package theory_assignment_02;

public class EMS_Address {
        private String street;
        private String city;
        private String zipCode;

        // Constructor to initialize address details
        public EMS_Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        // Getters for address details
        public String getStreet() {
            return street;}

        public String getCity()
        {return city;}

        public String getZipCode() {
            return zipCode;}
    }




