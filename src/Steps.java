public class Steps {
    int step1X(String[][] arr) {
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
        return 0;
    }

    int step2X(String[][] arr) {
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
        return 0;
    }

    int step3X(String[][] arr) {
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
        return 0;
    }

    int step4X(String[][] arr) {
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
        return 0;
    }

    int step5X(String[][] arr) {
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
        return 0;
    }

    int step6X(String[][] arr) {
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
        return 0;
    }

    int step7X(String[][] arr) {
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
        return 0;
    }

    int step8X(String[][] arr) {
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
        return 0;
    }

    int step9X(String[][] arr) {
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
        return 0;
    }

    int step1O(String[][] arr) {
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
        return 0;
    }

    int step2O(String[][] arr) {
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
        return 0;
    }

    int step3O(String[][] arr) {
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
        return 0;
    }

    int step4O(String[][] arr) {
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
        return 0;
    }

    int step5O(String[][] arr) {
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
        return 0;
    }

    int step6O(String[][] arr) {
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
        return 0;
    }

    int step7O(String[][] arr) {
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
        return 0;
    }

    int step8O(String[][] arr) {
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
        return 0;
    }

    int step9O(String[][] arr) {
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
        return 0;
    }
}
