import java.util.Scanner;

public class trDrawLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Çizmek istediğinizi harfi giriniz(W,X,Y,Z): ");
        String letter = input.nextLine().toUpperCase();

        while (!letter.equals("X") &&
         !letter.equals("Y") &&
          !letter.equals("Z") &&
           !letter.equals("W"))  {
            System.out.println("Lütfen sadece (W,X,Y,Z) harflerinden birini giriniz: ");
            letter = input.nextLine().toUpperCase();
        }
            
        System.out.println("Çizim boyutu için çift olmayan bir sayı giriniz(en az 5): ");
        int size = input.nextInt();

        while (size < 5 || size % 2 == 0) {
            if (size < 5) {
                System.out.println("Lütfen 5'ten büyük bir sayı giriniz: ");
                size = input.nextInt();
            }
            else if ( size % 2 == 0) {
                System.out.println("Lütfen çift olmayan bir sayı giriniz: ");
                size = input.nextInt();
            }

        }

        if (letter.equals("X")) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j || j == (size -1 -i)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }


        else if (letter.equals("Y")) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i < (size/2)) {
                        if (i == j || j == (size -1 -i)) {
                            System.out.print("*");
                    }
                        else {
                            System.out.print(" ");
                    }
                    }
                    else {
                        if (j == (size/2)) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }

                    

                }
                System.out.println();
            }
                
                
            }
        else if (letter.equals("Z")) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1) { // üst ve alt satır
                        System.out.print("*");
        } 
                    else if (j == size - 1 - i) { // çapraz
                        System.out.print("*");
        } 
                    else {
                       System.out.print(" ");
        }
    }
            System.out.println();
}

        }

        else if (letter.equals("W")) {
            for (int i = 0; i < size; i++) {
    for (int j = 0; j < size*2-1; j++) {

        // Sol üst çapraz
        if (j == i) {
            System.out.print("*");
        }
        // Sağ üst çapraz
        else if (j == size*2 - 2 - i) {
            System.out.print("*");
        }
        // Alt çaprazlar
        else if (i >= size/2 && (j == i || j == size*2-2-i)) {
            System.out.print("*");
        }
        else {
            System.out.print(" ");
        }

    }
    System.out.println();
}


        }

        }

    }
