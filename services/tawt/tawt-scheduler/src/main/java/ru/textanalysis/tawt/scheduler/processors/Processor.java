package ru.textanalysis.tawt.scheduler.processors;

/**
 * Интерфейс, который предоставляет метод для автомоматической обработки текста на различных этапах анализа текста.
 */
public interface Processor {
    /**
     * Автоматическая обработка текста.
     * @param text - входная строка - текст.
     * @return - JSON-представление результата выполнения автоматической обработки.
     */
    String processTask(String text) throws Exception;
}
