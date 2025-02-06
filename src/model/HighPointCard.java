package model;

/**
 * Lớp con của thẻ có valid > 10 được cộng thêm 100 điểm
 */

public class HighPointCard extends ACard{
    public HighPointCard(int valid) {
        super(valid);
    }

    @Override
    public int getScore() {
        return 100;
    }
}
