package model;

/**
 *đại diện cho lớp Màn chơi
 */

public interface IRoundGame {
    // các dòng ma trận của 4 lượt chơi
    int[] AXIS_X = {2, 3, 4, 5};
    // các cột ma trận của 4 lượt chơi.
    int[] AXIS_Y = {3, 4, 6, 6};
    // số lượng các hình
    int NUM_OF_IMAGE = 15;
    // lấy ra số dòng của ma trận
    int getX();
    // lấy ra số cột của ma trận
    int getY();
    // lấy thẻ ở vị trí (x,y)
    ACard getCardAtIndex(int x, int y);
    // thay đổi kích thước các thẻ hình qua từng màn
    void reSized(int width, int height);
}
