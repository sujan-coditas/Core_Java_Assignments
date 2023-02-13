package feb_week3_13_feb_2023.Assignment9;

class Medicine {
    void displayLabel() {
        System.out.println("Name: XYZ Pharma");
        System.out.println("Address: 123 Main St, pune, Maharashtra");
    }
}

class Tablet extends Medicine {
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("Store in a cool dry place");
    }
}

class Syrup extends Medicine {
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("Shake well before use");
    }
}

class Ointment extends Medicine {
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("For external use only");
    }
}

public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];
        for (int i = 0; i < medicines.length; i++) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                medicines[i] = new Tablet();
            } else if (random == 2) {
                medicines[i] = new Syrup();
            } else {
                medicines[i] = new Ointment();
            }
            medicines[i].displayLabel();
            System.out.println();
        }
    }
}
/*==============OUTPUT====================
* Name: XYZ Pharma
Address: 123 Main St, pune, Maharashtra
Shake well before use

Name: XYZ Pharma
Address: 123 Main St, pune, Maharashtra
For external use only
*/