package org.bank;

public class AxisBank extends BankInfo{
private void deposit()
{
System.out.println("deposit money");
}

public static void main(String[] args)
{
AxisBank JD = new AxisBank();
JD.deposit();
JD.saving();
JD.fixed();
}
}
