package com.example.demo.service

import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.stereotype.Component
import org.springframework.batch.core.configuration.annotation.StepScope
import org.springframework.batch.core.StepContribution
import org.springframework.batch.core.scope.context.ChunkContext
import org.springframework.batch.repeat.RepeatStatus

import com.example.demo.repository.NameRepository
import com.example.demo.repository.Name

/**
 *
 */
@Component
@StepScope
public class FstTasklet(val repository: NameRepository) : Tasklet{

    /**
     *
     */
    override fun execute(stepContribution: StepContribution,chunkContext: ChunkContext): RepeatStatus {
        for (row in repository.getAttrsByName("kenta")) println(row.toString())
        return RepeatStatus.FINISHED;
    }
}