package com.albanote.memberservice.domain.dto.response.workplace

import com.albanote.memberservice.domain.entity.workplace.work.WorkType
import com.querydsl.core.annotations.QueryProjection
import java.time.LocalTime

/**
 * 현재 근무자 조회 DTO
 * */
class WorkRecordResponseDTO @QueryProjection constructor(
    val currentEmployee: EmployeeMemberSimpleResponseDTO,
    val officeGoingTime: LocalTime?,
    val quittingTime: LocalTime?,
    val workType: WorkType
)
