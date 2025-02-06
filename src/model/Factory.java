package model;

/**
 * lớp interface tạo các thẻ theo giá trị valid
 */

public interface Factory {
    ACard createCard(int valid);
}
