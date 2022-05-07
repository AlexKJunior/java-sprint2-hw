public class YearlyReport {
    private final int month;
    private final int amount;
    private final boolean isExpense;

    public YearlyReport(int month, int amount, boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }

    public int getMonth() {
        return month;
    }

    public boolean isIsExpense() {
        return isExpense;
    }

    public int getAmount() {
        return amount;
    }


    public String toString() {
        return "YearlyReport{" +
                "month=" + month +
                ", is_expense=" + isExpense +
                ", amount=" + amount +
                '}';
    }
}