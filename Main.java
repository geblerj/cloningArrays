package com.james

class Main {
  public static void main(String[] args) {
    double[] taxes = {4.3, 9.7, 4.9, 7.6};
    double[] yourTaxes = taxes.clone();
    for (double tax:taxes) {
    	System.out.println(tax);
    	tax = 0.0;
    }
    for (double tax:yourTaxes) {
    	System.out.println(tax);
    }
  }
}
