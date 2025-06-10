package lab6;

public class activity2_regular extends activity2_Employee {

    private int basicPay;

    public activity2_regular(String name, String phone, String address, int
            allowance, int basicPay) {
        super(name, phone, address, allowance);
        this.basicPay = basicPay;
    }
        public void Display(){
        System.out.println("Name: " + name + "Phone Number: " + phone
                +"Address: " + address + "Allowance:  " + allowance + "Basic Pay:  "
                + basicPay);
    }

    }


