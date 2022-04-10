package com.albanote.memberservice.domain.dto.response.workplace

import com.querydsl.core.annotations.QueryProjection

/**
 * 사장의 대표 일터 정보 조회 DTO
 * */
class RepWorkplaceInfoOfBossResponseDTO @QueryProjection constructor(
    val workplaceId: Long,
    val workplaceTitle: String
) {
    var currentEmployees: MutableList<CurrentEmployeeResponseDTO> = mutableListOf()
    var completedTodos: MutableList<CompletedTodoResponseDTO> = mutableListOf()
    var totalTodoCount: Int = 0
}