public class MonthlyReport {
    private final String itemName;
    private final boolean isExpense;
    private final int quantity;
    private final int sumOfOne;

    public MonthlyReport(String item_name, boolean isExpense, int quantity, int sumOfOne) {
        this.itemName = item_name;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isIsExpense() {
        return isExpense;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSumOfOne() {
        return sumOfOne;
    }


    public String toString() {
        return "MonthlyReport{" +
                "item_name='" + itemName + '\'' +
                ", is_expense=" + isExpense +
                ", quantity=" + quantity +
                ", sumOfOne=" + sumOfOne +
                '}';
    }
}
