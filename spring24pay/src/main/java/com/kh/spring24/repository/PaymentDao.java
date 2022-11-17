package com.kh.spring24.repository;

import com.kh.spring24.entity.PaymentDetailDto;
import com.kh.spring24.entity.PaymentDto;

public interface PaymentDao {
	int paymentSequence();
	int paymentDetailSequence();
	void paymentInsert(PaymentDto paymentDto);
	void paymentDetailInsert(PaymentDetailDto paymentDetailDto);
}
