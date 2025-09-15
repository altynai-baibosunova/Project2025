public class eligible {

    public static void main(String[] args) {

        boolean hasCriminalRecord = false;
        boolean hasHighPaidJob = true;
        boolean hasGoodCreditScore = true;

        boolean isEligible = hasHighPaidJob || hasGoodCreditScore && !hasCriminalRecord;

        System.out.println(isEligible);
        
    }
}
