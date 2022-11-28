package com.rsk.simplilearn.sportyshoes.services;

import com.rsk.simplilearn.sportyshoes.dto.Purchase;
import com.rsk.simplilearn.sportyshoes.dto.PurchaseResponse;

public interface CheckoutService {
	public PurchaseResponse placeOrder(Purchase purchase);
}
