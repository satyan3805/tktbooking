package com.sat.tktbooking;

public class Transaction {
	private int txnId;
	private String txnDateTime;
	private int bookingNumber;
	private double txnAmt;
	private char txnStatus;
	private int paymentMethodId;
	
	
	public Transaction(int txnId, String txnDateTime, int bookingNumber, double txnAmt, char txnStatus,
			int paymentMethodId) {
		super();
		this.txnId = txnId;
		this.txnDateTime = txnDateTime;
		this.bookingNumber = bookingNumber;
		this.txnAmt = txnAmt;
		this.txnStatus = txnStatus;
		this.paymentMethodId = paymentMethodId;
	}
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public String getTxnDateTime() {
		return txnDateTime;
	}
	public void setTxnDateTime(String txnDateTime) {
		this.txnDateTime = txnDateTime;
	}
	public int getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(int bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public double getTxnAmt() {
		return txnAmt;
	}
	public void setTxnAmt(double txnAmt) {
		this.txnAmt = txnAmt;
	}
	public char getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(char txnStatus) {
		this.txnStatus = txnStatus;
	}
	public int getPaymentMethodId() {
		return paymentMethodId;
	}
	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	

    
    
    
}
