package com.example.demo.controller

import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.stereotype.Component
import org.springframework.batch.core.configuration.annotation.StepScope
import org.springframework.batch.core.StepContribution
import org.springframework.batch.core.scope.context.ChunkContext
import org.springframework.batch.repeat.RepeatStatus

import com.example.demo.service.FstService

/**
 *
 */
@Component
@StepScope
public class FstTasklet(val service: FstService) : Tasklet{

    /**
     *
     */
    override fun execute(stepContribution: StepContribution,chunkContext: ChunkContext): RepeatStatus {
        service.execute()
        return RepeatStatus.FINISHED;
    }
}