package com.company;

public class Stars {

    public void fillSquareSevenBySeven(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.println("*");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void depPerimeterSquare(){
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (i > 0 && i < 6 && j > 0 && j < 6){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    public void depPerimeterTriangleTopLeft() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("* ");
                } else if ( (i + j) == 6) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    public void depPerimeterTriangleTopRight() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == j ) {
                    System.out.print("* ");
                } else if ( j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public void depPerimeterTriangleDownLeft() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == 0) {
                    System.out.print("* ");
                } else if ( i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    public void depPerimeterTriangleDownRight() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 6) || ((i + j) == 6)) {
                    System.out.print("* ");
                } else if (j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    public void depCross(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == j) || ((i + j) == 6)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        System.out.println();

        }
    }

    public void depPerimeterTriangleTop() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    System.out.print("* ");
                }
                else if (i < 4 && (i == j)) {
                    System.out.print("*");
                }
                else if (i < 3 && (i + j) == 6){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public void depPerimeterTriangleDown() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6) {
                    System.out.print("* ");
                }
                else if (i > 2 && (i == j)) {
                    System.out.print("*");
                }
                else if (j < 3 && (i + j) == 6){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

}
