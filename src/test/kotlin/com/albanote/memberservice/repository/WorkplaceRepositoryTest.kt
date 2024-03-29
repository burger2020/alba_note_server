package com.albanote.memberservice.repository

import com.albanote.memberservice.repository.workplace.BossWorkplaceRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import java.time.LocalDate

@SpringBootTest
internal class WorkplaceRepositoryTest {
    @Autowired
    lateinit var workplaceRepository: BossWorkplaceRepository

    @Test
    fun sadf() {
        val workplaceId = 0L
        val todos = workplaceRepository.findWorkplaceTodoRecordsByDate(
            workplaceId = workplaceId,
            onlyCompleted = true,
            pageable = PageRequest.of(0, 20),
            date = LocalDate.now()
        )

    }
}