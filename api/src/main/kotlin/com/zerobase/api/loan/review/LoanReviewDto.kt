package com.zerobase.api.loan.review

import javax.persistence.Column

class LoanReviewDto {
    data class LoanReviewResponseDto(
        val userKey: String,
        val loanResult:LoanResult
    )

    data class LoanResult(
        val userLimitAmount: Long,
        val userLoanInterest: Double
    )

    data class LoanReview (
        val userKey: String,
        val userLimitedAmount: Long,
        val userLoanInterest: Double
    )
}