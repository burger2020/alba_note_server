package com.albanote.memberservice.domain.dto.response.workplace

import com.albanote.memberservice.domain.entity.workplace.work.WorkplaceRequestType
import com.querydsl.core.annotations.QueryProjection
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime


// 최근 요청
class WorkplaceRequestDetailResponseDTO @QueryProjection constructor(
    var requestId: Long,
    var createdDate: LocalDateTime,
    var requestType: WorkplaceRequestType,
    var requestContent: String,
    var isComplete: Boolean?,
    var memo: String?,
    var requestMember: EmployeeMemberSimpleResponseDTO,
    var requestMemo: String?,
    // 근무 생성 요청 시 근무 날짜
    var requestWorkDate: LocalDate,
    // 요청 출퇴근 시간
    var requestOfficeGoingTime: LocalTime,
    var requestQuittingTime: LocalTime,
    val requestBreakTime: LocalTime?,
    val requestNightBreakTime: LocalTime?,
    val requestTotalSalary: Int,

    var employeeRankInfo: EmployeeRankSalaryInfoResponseDTO,

    var workRecordId: Long?,
) {
    // 기존 출퇴근 시간 -
    var existingOfficeGoingTime: LocalTime? = null
    var existingQuittingTime: LocalTime? = null
    var existingBreakTime: LocalTime? = null
    var existingNightBreakTime: LocalTime? = null
    var existingTotalSalary: Int? = null

    fun setCorrectionWorkRecordInfo(workRecord: WorkplaceRequestCorrectionWorkRecordResponseDTO) {
        existingOfficeGoingTime = workRecord.existingOfficeGoingTime
        existingQuittingTime = workRecord.existingQuittingTime
        existingBreakTime = workRecord.existingBreakTime
        existingNightBreakTime = workRecord.existingNightBreakTime
        existingTotalSalary = workRecord.existingTotalSalary
        requestWorkDate = workRecord.workDate
    }
}