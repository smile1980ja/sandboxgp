package com.example.demo.repository

import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest
import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

@DataJdbcTest
class MemberRepositoryTest {
    @Autowired
    lateinit var repository: MemberRepository

    @Test
    fun test1() {
        val count = repository.count()
        Assertions.assertEquals(1L, count)
    }
}