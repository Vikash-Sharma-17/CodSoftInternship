package ATM_Interface;

public class RunningFace {

    public static void main(String[] args) {
        BankInterface userAccount = new BankInterface(1000); // Initial balance
        ATMInterface atm = new ATMInterface(userAccount);
        atm.run();
    }

}
