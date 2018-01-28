import java.util.Scanner;

public class P02SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine().toLowerCase();
        String town = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        double totalPrice = 0.0;


        if (town.equals("sofia")) {
            if (product.equals("coffee")) {
                totalPrice = quantity * 0.5;
            } else {
                if (product.equals("water")) {
                    totalPrice = quantity * 0.8;
                } else {
                    if (product.equals("beer")) {
                        totalPrice = quantity * 1.2;
                    } else {
                        if (product.equals("sweets")) {
                            totalPrice = quantity * 1.45;
                        } else {
                            if (product.equals("peanuts")) {
                                totalPrice = quantity * 1.60;
                            }
                        }
                    }
                }
            }
        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                totalPrice = quantity * 0.4;
            } else {
                if (product.equals("water")) {
                    totalPrice = quantity * 0.7;
                } else {
                    if (product.equals("beer")) {
                        totalPrice = quantity * 1.15;
                    } else {
                        if (product.equals("sweets")) {
                            totalPrice = quantity * 1.30;
                        } else {
                            if (product.equals("peanuts")) {
                                totalPrice = quantity * 1.50;
                            }
                        }
                    }
                }
            }
        } else {
            if (product.equals("coffee")) {
                totalPrice = quantity * 0.45;
            } else {
                if (product.equals("water")) {
                    totalPrice = quantity * 0.7;
                } else {
                    if (product.equals("beer")) {
                        totalPrice = quantity * 1.10;
                    } else {
                        if (product.equals("sweets")) {
                            totalPrice = quantity * 1.35;
                        } else {
                            if (product.equals("peanuts")) {
                                totalPrice = quantity * 1.55;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(totalPrice);
    }
}

