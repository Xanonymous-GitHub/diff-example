    void printOwning() {
        // Print banner
        System.out.println("Details of account");
        System.out.println("***");
        System.out.println("");

        // Print details.
        printDetails();
    }

    void printDetails() {
        System.out.println("name:" + name);
        System.out.println("amount:" + outstanding);
    }
