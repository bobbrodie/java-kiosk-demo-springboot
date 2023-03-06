/*
 * Copyright 2023 BitPay.
 * All rights reserved.
 */

package com.bitpay.demo.invoice.domain.payment;

import lombok.NonNull;

public class InvoicePaymentMinerFee {
    private Long id;
    private SatoshisPerByte satoshisPerByte;
    private TotalFee totalFee;
    private FiatAmount fiatAmount;

    public InvoicePaymentMinerFee(
        @NonNull final SatoshisPerByte satoshisPerByte,
        @NonNull final TotalFee totalFee,
        @NonNull final FiatAmount fiatAmount
    ) {
        this.satoshisPerByte = satoshisPerByte;
        this.totalFee = totalFee;
        this.fiatAmount = fiatAmount;
    }

    public InvoicePaymentMinerFee() {
    }
}