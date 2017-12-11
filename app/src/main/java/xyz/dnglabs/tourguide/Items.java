package xyz.dnglabs.tourguide;


public class Items {

    private int mItemName;

    private int mItemAddr;

    private int mItemImg;

    public Items(int itemName, int itemAddr, int itemImg) {
        mItemName = itemName;
        mItemAddr = itemAddr;
        mItemImg = itemImg;
    }

    public int getitemName() {
        return mItemName;
    }
    public int getitemAddr() {
        return mItemAddr;
    }
    public int getitemImg() {
        return mItemImg;
    }

}
