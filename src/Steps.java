public class Steps {

    int[] arrStep = new int[9];
    int CountStep = 0;
    boolean test = false;

    void step(String[][] arr, int UserNumber, String XO) {
        if (UserNumber == 1 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 0 || j == 2) && (i == 0 || i == 2)) {
                        arr[i][j] = " X ";
                    } else if ((j == 1 && i == 1)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 2 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 4 || j == 6) && (i == 0 || i == 2)) {
                        arr[i][j] = " X ";
                    } else if ((j == 5 && i == 1)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 3 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 8 || j == 10) && (i == 0 || i == 2)) {
                        arr[i][j] = " X ";
                    } else if ((j == 9 && i == 1)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 4 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 0 || j == 2) && (i == 4 || i == 6)) {
                        arr[i][j] = " X ";
                    } else if ((j == 1 && i == 5)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 5 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 4 || j == 6) && (i == 4 || i == 6)) {
                        arr[i][j] = " X ";
                    } else if ((j == 5 && i == 5)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 6 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 8 || j == 10) && (i == 4 || i == 6)) {
                        arr[i][j] = " X ";
                    } else if ((j == 9 && i == 5)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 7 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 0 || j == 2) && (i == 8 || i == 10)) {
                        arr[i][j] = " X ";
                    } else if ((j == 1 && i == 9)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 8 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 4 || j == 6) && (i == 8 || i == 10)) {
                        arr[i][j] = " X ";
                    } else if ((j == 5 && i == 9)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 9 && XO == "x") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 8 || j == 10) && (i == 8 || i == 10)) {
                        arr[i][j] = " X ";
                    } else if ((j == 9 && i == 9)) {
                        arr[i][j] = " X ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }

        if (UserNumber == 1 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 1) && (i == 0 || i == 2)) {
                        arr[i][j] = " O ";
                    } else if (((j == 0 || j == 2) && i == 1)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 2 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 5) && (i == 0 || i == 2)) {
                        arr[i][j] = " O ";
                    } else if (((j == 4 || j == 6) && i == 1)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 3 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 9) && (i == 0 || i == 2)) {
                        arr[i][j] = " O ";
                    } else if (((j == 8 || j == 10) && i == 1)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 4 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 1) && (i == 4 || i == 6)) {
                        arr[i][j] = " O ";
                    } else if (((j == 0 || j == 2) && i == 5)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 5 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 5) && (i == 4 || i == 6)) {
                        arr[i][j] = " O ";
                    } else if (((j == 4 || j == 6) && i == 5)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 6 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 9) && (i == 4 || i == 6)) {
                        arr[i][j] = " O ";
                    } else if (((j == 8 || j == 10) && i == 5)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 7 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 1) && (i == 8 || i == 10)) {
                        arr[i][j] = " O ";
                    } else if (((j == 0 || j == 2) && i == 9)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 8 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 5) && (i == 8 || i == 10)) {
                        arr[i][j] = " O ";
                    } else if (((j == 4 || j == 6) && i == 9)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (UserNumber == 9 && XO == "o") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 9) && (i == 8 || i == 10)) {
                        arr[i][j] = " O ";
                    } else if (((j == 8 || j == 10) && i == 9)) {
                        arr[i][j] = " O ";
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    boolean checkCorrectStep(int UserNumber) {
        for (int i = 0; i < arrStep.length; i++) {
            if ((arrStep[i] != UserNumber) && (UserNumber > 0 && UserNumber <= 9)){
                test = true;
                arrStep[CountStep] = UserNumber;
            }else {
                test = false;
            }
        }
        if (test == true) {
            return true;
        } else {
            System.out.println("Введено некорректное значение");
            System.out.println("Попробуй ещё");
            return false;
        }
    }

    /*boolean win(int UserNumber) {
        if (UserNumber)
    }*/
}
