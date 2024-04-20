package ru.textanalysis.tawt.scheduler.processors;

/**
 * ProcessorPool - пул обработчиков различных этапов анализа текста.
 */
public class ProcessorPool {
    private final Processor[] processorPool;


    public ProcessorPool(Processor... processors) {
        processorPool = processors;
    }

    public String processTask(String json, int type) throws Exception {
        return processorPool[type-1].processTask(json);
    }
}
