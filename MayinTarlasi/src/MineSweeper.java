// Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.
//
//Oyun Kuralları :
//Oyun metin tabanlıdır.
//Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
//Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
//Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
// Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı
// ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların
// konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
//Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
//Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa
// tekrar nokta istenmeli.
//Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
//Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı,
// sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının
// toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
//Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static String DASH = "-", MINE = "*";
    int row, col, x, y, mineCount, inputs = 0;
    String[][] map, board;
    static boolean success = true;

    MineSweeper(int row, int col) throws Exception {
        if(row < 3 || col < 3) {
            throw new Exception("Satır ve Sütun sayıları 3 veya 3'den büyük olmalı!");
        }
        this.row = row;
        this.col = col;
        this.mineCount = (int) Math.floor((row * col) / 4.0);
        this.board = fillWithDashes();
        this.map = addMines(fillWithDashes());
    }

    public void run() {
        System.out.println("Mayınların Konumu");
        printMatrix(this.map);

        while ((inputs + mineCount) < (row * col)) {
            System.out.println("===========================");
            printMatrix(this.board);

            x = getInput("Satır Giriniz : ");
            y = getInput("Sütun Giriniz : ");

            if(isMine(x, y)) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                success = false;
                break;
            }

            if(isDash(x, y)) {
                board[x][y] = getMineCount(x, y);
                inputs++;
            } else {
                System.out.println("[" + x + ", " + y + "] koordinatına daha önce giriş yaptınız.");
            }
        }

        if(success) {
            System.out.println("Oyunu Kazandınız !");
            printMatrix(this.board);
        }
    }

    public String[][] fillWithDashes() {
        String[][] matrix = createMatrix();
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = DASH;
            }
        }
        return matrix;
    }

    public String[][] addMines(String[][] matrix) {
        int addedMines = 0, randRow, randCol;
        while (addedMines < mineCount) {
            randRow = random.nextInt(row);
            randCol = random.nextInt(col);
            if(matrix[randRow][randCol].equals(DASH)) {
                matrix[randRow][randCol] = MINE;
                addedMines++;
            }
        }
        return matrix;
    }

    public void printMatrix(String[][] matrix) {
        System.out.print("  ");
        for(int i = 0; i < matrix[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < this.row; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < this.col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public String[][] createMatrix() {
        return new String[this.row][this.col];
    }

    public int getInput(String message) {
        int input;
        do {
            System.out.print(message);
            input = scanner.nextInt();
            if(input < 0 || input > row) {
                System.out.println("Lütfen tekrar giriş yapınız!");
            }
        } while (input < 0 || input > row);
        return input;
    }

    public boolean isMine(int x, int y) {
        return map[x][y].equals(MINE);
    }

    public boolean isDash(int x, int y) {
        return board[x][y].equals(DASH);
    }

    public String getMineCount(int x, int y) {
        int mineCount = 0;
        for(int i = x - 1; i <= x + 1; i++) {
            for(int j = y - 1; j <= y + 1; j++) {
                if(i >= 0 && i < row && j >= 0 && j < col && isMine(i, j)) {
                    mineCount++;
                }
            }
        }
        return mineCount + "";
    }
}
