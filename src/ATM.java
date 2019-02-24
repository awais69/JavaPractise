import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scP = new Scanner(System.in);
        Scanner scNP = new Scanner(System.in);

        System.out.println("Enter Your Pin Code:");
        int code = scNP.nextInt();

        if (code == 1111){

            boolean repeate = false;
            int balance = 5000;

            do {
                System.out.println("\n\n|--------------------------------|");
                System.out.println("Select Any Option From Given List\n");
                System.out.println("1) Withdraw");
                System.out.println("2) Deposit");
                System.out.println("3) Transfer");
                System.out.println("4) Check balance");
                System.out.println("5) Change your pin code");
                System.out.println("0) Exit");
                System.out.println("|--------------------------------|");

                int option = scNP.nextInt();
                char userChoice;
                switch (option){
                    case 1:
                        int withDraw;
                        System.out.println("Welcome to withdraw menu\nEnter your amount to proceed to next option.");
                        do {
                            withDraw = scNP.nextInt();

                            if (balance >= withDraw){
                                System.out.println("\nSuccessfully completed your transaction");
                            }else{
                                System.out.println("\nYour amount is exceeded from your balance\nEnter amount again");
                            }

                        }while (balance < withDraw);

                        balance -= withDraw;

                        System.out.println("\n|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Your balance is now "+balance+" PKR");
                        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

                        System.out.println("Do you want to go to main menu again? (y/n)");
                        userChoice = scP.next().charAt(0);
                        if (userChoice == 'y'){
                            repeate = true;
                        }else{
                            repeate = false;
                            System.out.println("\n\nThanks 4 using our ATM");
                        }
                        break;

                    case 2:
                        System.out.println("\nEnter your amount to deposit:");
                        balance += scNP.nextInt();
                        System.out.println("\nSuccessfully Deposited");

                        System.out.println("Your balance is now "+balance+" PKR");

                        System.out.println("Do you want to go to main menu again? (y/n)");
                        userChoice = scP.next().charAt(0);
                        if (userChoice == 'y'){
                            repeate = true;
                        }else{
                            repeate = false;
                            System.out.println("Thanks 4 using our ATM");
                        }

                        break;
                    case 3:
                        System.out.println("\nEnter acc # for which u want to transfer:");
                        int accNo = scNP.nextInt();
                        System.out.println("\nEnter amount to transfer to "+accNo);

                        int transfer;

                        do {
                            transfer = scNP.nextInt();

                            if (balance >= transfer){
                                System.out.println("\nSuccessfully completed your transaction");
                            }else{
                                System.out.println("\nYour amount is exceeded from your balance\nEnter amount again");
                            }

                        }while (balance < transfer);

                        balance -= transfer;

                        System.out.println("\nSuccessfully transferred");

                        System.out.println("Your balance is now "+balance+" PKR");

                        System.out.println("Do you want to go to main menu again? (y/n)");
                        userChoice = scP.next().charAt(0);
                        if (userChoice == 'y'){
                            repeate = true;
                        }else{
                            repeate = false;
                            System.out.println("Thanks 4 using our ATM");
                        }

                        break;
                    case 4:

                        System.out.println("Your balance is now "+balance+" PKR");

                        System.out.println("Do you want to go to main menu again? (y/n)");
                        userChoice = scP.next().charAt(0);
                        if (userChoice == 'y'){
                            repeate = true;
                        }else{
                            repeate = false;
                            System.out.println("Thanks 4 using our ATM");
                        }

                        break;
                    case 5:

                        System.out.println("\nEnter your previous pin code:");
                        int preCode;
                        do {
                            preCode = scNP.nextInt();

                            if (preCode != code){
                                System.out.println("\nWrong code\nEnter again:");
                            }

                        }while (code != preCode);

                        System.out.println("\nEnter new pin code:");
                        code = scNP.nextInt();
                        System.out.println("\nCode Changed");

                        System.out.println("Do you want to go to main menu again? (y/n)");
                        userChoice = scP.next().charAt(0);
                        if (userChoice == 'y'){
                            repeate = true;
                        }else{
                            repeate = false;
                            System.out.println("Thanks 4 using our ATM");
                        }

                        break;
                    case 0:
                        repeate = false;
                        System.out.println("\n\n|---------------------|");
                        System.out.println("Thanks 4 using our ATM");
                        System.out.println("|---------------------|");
                        break;
                }

            }while (repeate);

        }else {
            System.out.println("Your pin code is wrong");
        }

    }
}
