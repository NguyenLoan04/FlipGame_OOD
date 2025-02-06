package model;

/**
 * Lớp con của thẻ có valid < 10 được cộng 50 điểm.
 */
public class LowPointCard extends ACard{
    public LowPointCard(int valid) {
        super(valid);
    }
    // lấy điểm
    @Override
    public int getScore() {
        return 50;
    }
}
