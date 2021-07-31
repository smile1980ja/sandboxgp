package com.example.demo.service

import org.springframework.stereotype.Service

import com.example.demo.repository.NameRepository
import com.example.demo.repository.Name

/**
 *
 */
@Service
public class FstService(val repository: NameRepository) {
    /**
     *
     */
    fun execute() {
        for (row in repository.getAttrsByName("kenta")) println(row.toString())
    }
}