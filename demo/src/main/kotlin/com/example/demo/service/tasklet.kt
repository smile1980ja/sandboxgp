package com.example.demo.service

import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.stereotype.Component
import org.springframework.batch.core.configuration.annotation.StepScope
import org.springframework.batch.core.StepContribution
import org.springframework.batch.core.scope.context.ChunkContext
import org.springframework.batch.repeat.RepeatStatus

/**
 *
 */
@Component
@StepScope
public class FstTasklet: Tasklet {

    /**
     *
     */
    override fun execute(stepContribution: StepContribution,chunkContext: ChunkContext): RepeatStatus {
        println("Hello, World!");
        return RepeatStatus.FINISHED;
    }
}