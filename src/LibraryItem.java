abstract class LibraryItem {
    protected String itemID;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    protected String borrowersName;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;

    }

    public String getItemInfo() {
        return "ItemID : " + itemID + ", Title : " + title + ", Author :" + author;
    }

    public void checkedOut(String borrowersName) {

        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("The Item '" + title + "' has been Checked out by '" + borrowersName +"'");
        } else {
            System.out.println("The Item is unavailable");
        }
    }

    public void checkIn() {

        if (isCheckedOut) {
            System.out.println("The Item is not Checked out by anyone.");
        } else {
            this.isCheckedOut = true;
            System.out.println("The Item '" + title + "' Has been returned and is now Available.");
        }
    }

    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);

}
