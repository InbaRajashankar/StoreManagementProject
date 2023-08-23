// to place orders
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Order {
    ArrayList<String[]> customerOrder = new ArrayList<>();
    String[] birdList = {"Parrot", "Cardinal", "Dodo", "Flamingo", "Peacock", "Toucan"};
    double[] priceList = {9999.99, 5999.99, 14999.99, 5999.99, 49999.99, 24999.99};

    Bird currentBirdOrdered = new Bird();
    int currentQuantity;

    double totalPrice = 0.0;
    double currentPrice = 0.0;

    public void placeOrder(Scanner scanner) {
        System.out.println("Welcome to Inba's Bird Emporium™ - The #1 worldwide vendor of customizable birds.\nWe're excited to take your order!");
        System.out.println("\nWould you like to place an order\n0 - Yes\n1 - No");
        int doesPlaceOrder = scanner.nextInt();

        while (doesPlaceOrder > 1) { // make sure valid input
            System.out.println("\nYou entered an invalid input, please try again.\n0 - Yes\n1 - No");
            doesPlaceOrder = scanner.nextInt();
        }

        if (doesPlaceOrder == 0) {

            int doesContinueOrder = 0;

            while (doesContinueOrder == 0) {
                // creates bird configuration
                orderBird(scanner);

                // add bird configuration to order list
                String[] orderAdded = {String.valueOf(currentQuantity), currentBirdOrdered.toString(), String.valueOf(currentPrice)};
                customerOrder.add(orderAdded);
                currentPrice = 0.0;

                // prompts the user to order again
                System.out.println("\nWould you like to order another bird configuration?\n0 - Yes\n1 - No");
                doesContinueOrder = scanner.nextInt();

                while (doesContinueOrder > 1) { // make sure valid input
                    System.out.println("\nYou entered an invalid input, please try again.\n0 - Yes\n1 - No");
                    doesContinueOrder = scanner.nextInt();
                }
            }

            closeOrder(scanner);

        } else {
            System.out.println("\nWe hope you enjoyed your visit! Enjoy the rest of your day!");
        }
    }

    public void orderBird(Scanner scanner) {
        // ask user for input for Bird class instance variables
        System.out.println("\nFirst, what base-type bird would you like?");
        System.out.println("0 - Parrot - $9999.99\n1 - Cardinal - $5999.99\n2 - Dodo - $14999.99\n3 - Flamingo - $5999.99\n4 - Peacock - $49999.99\n5 - Toucan - $24999.99");
        int orderedTypeNum = scanner.nextInt();

        while (orderedTypeNum > 5) { // make sure valid input
            System.out.println("\nYou entered an invalid input, please try again.\n0 - Parrot - $9999.99\n1 - Cardinal - $5999.99\n2 - Dodo - $14999.99\n3 - Flamingo - $5999.99\n4 - Peacock - $49999.99\n5 - Toucan - $24999.99");
            orderedTypeNum = scanner.nextInt();
        }

        System.out.println("\nSecond, give us a brief description of what color(s) you would like your bird to be?");
        scanner.nextLine();
        String orderedColor = scanner.nextLine();

        System.out.println("\nThird, how old would you like your bird to be (As a numeric, decimal, value of years)?");
        double orderedAge = scanner.nextDouble();

        System.out.println("\nFourth, how tall you prefer your bird to be (in whole centimeters)?");
        int orderedHeight = scanner.nextInt();

        // instantiate bird classes
        if (orderedTypeNum <= 3) {
            // for all other birds
            Bird orderedBird = new Bird(birdList[orderedTypeNum], orderedColor, orderedHeight, orderedAge, priceList[orderedTypeNum]);

            currentBirdOrdered = orderedBird;
            currentPrice = priceList[orderedTypeNum];

        } else if (orderedTypeNum == 4) {
            // for peacocks
            System.out.println("\nWould you like custom feathers?\n0 - Yes\n1 - No");
            int ifCustomFeathers = scanner.nextInt();

            while (ifCustomFeathers != 0 && ifCustomFeathers != 1) { // make sure valid input
                System.out.println("\nYou entered an invalid input, please try again.\n0 - Yes\n1 - No");
                ifCustomFeathers = scanner.nextInt();
            }

            if (ifCustomFeathers == 0) { // if they want custom feathers
                String[] patternList = {"Eye", "Checkered", "Polka Dots", "Camo"};

                System.out.println("\nWhat pattern would you like your peacock's feathers to be?");
                System.out.println("0 - Eye\n1 - Checkered\n2 - Polka Dots\n3 - Camo");
                int orderedPatternNum = scanner.nextInt();

                while (orderedPatternNum > 3) { // make sure valid input
                    System.out.println("\nYou entered an invalid input, please try again.");
                    System.out.println("0 - Eye\n1 - Checkered\n2 - Polka Dots\n3 - Camo");
                    orderedPatternNum = scanner.nextInt();
                }

                System.out.println("\nGive us a brief description of what color(s) you would like your peacock's feathers to be?");
                scanner.nextLine();
                String orderedBeakColor = scanner.nextLine();

                Peacock orderedPeacock = new Peacock(orderedColor, orderedHeight, orderedAge, patternList[orderedPatternNum], orderedBeakColor);
                currentBirdOrdered = orderedPeacock;

            } else { // if they don't want custom feathers
                Peacock orderedPeacock = new Peacock(orderedColor, orderedHeight, orderedAge);
                currentBirdOrdered = orderedPeacock;
            }

            currentPrice = priceList[orderedTypeNum];


        } else if (orderedTypeNum == 5) {
            // for toucans
            System.out.println("\nWould you like a custom beak?\n0 - Yes\n1 - No");
            int ifCustomBeak = scanner.nextInt();

            while (ifCustomBeak != 0 && ifCustomBeak != 1) { // make sure valid input
                System.out.println("\nYou entered an invalid input, please try again.\n0 - Yes\n1 - No");
                ifCustomBeak = scanner.nextInt();
            }

            if (ifCustomBeak == 0) { // if they want custom beak
                String[] textureList = {"Smooth", "Matte", "Chrome", "Super Smooth"};

                System.out.println("\nWhat texture would you like your toucan's beak to be?");
                System.out.println("0 - Smooth\n1 - Matte\n2 - Chrome\n3 - Super Smooth");
                int orderedTextureNum = scanner.nextInt();

                while (orderedTextureNum > 3) { // make sure valid input
                    System.out.println("\nYou entered an invalid input, please try again.");
                    System.out.println("0 - Smooth\n1 - Matte\n2 - Chrome\n3 - Super Smooth");
                    orderedTextureNum = scanner.nextInt();
                }

                System.out.println("\nGive us a brief description of what color(s) you would like your toucan's beak to be?");
                scanner.nextLine();
                String orderedBeakColor = scanner.nextLine();

                Toucan orderedToucan = new Toucan(orderedColor, orderedHeight, orderedAge, textureList[orderedTextureNum], orderedBeakColor);
                currentBirdOrdered = orderedToucan;

            } else { // if they don't want custom beak
                Toucan orderedToucan = new Toucan(orderedColor, orderedHeight, orderedAge);
                currentBirdOrdered = orderedToucan;

            }

            currentPrice = priceList[orderedTypeNum];

        } else {
            System.out.println("Error");
        }

        System.out.println("\nHow many birds of this kind would you like to order?");
        currentQuantity = scanner.nextInt();

        totalPrice += (currentPrice * currentQuantity);
    }

    public void closeOrder(Scanner scanner) {

        int n = customerOrder.size();

        System.out.println("\nThank you for shopping at Inba's Bird Emporium™\nHere's your receipt:");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");

        for (int i = 0; i < n; i += 1) {
            System.out.println("> Quantity: " + customerOrder.get(i)[0] + " <");
            System.out.println(customerOrder.get(i)[1]);
            System.out.println("----------------------------------------------------------------------------------");
        }

        System.out.println("Your Total Price: $" + (Math.round(totalPrice * 100.0) / 100.0));
    }
}