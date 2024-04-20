package ru.textanalysis.tawt.scheduler;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import ru.textanalysis.tawt.gama.Gama;
import ru.textanalysis.tawt.gama.GamaImpl;
import ru.textanalysis.tawt.graphematic.parser.text.GParserImpl;
import ru.textanalysis.tawt.graphematic.parser.text.GraphematicParser;
import ru.textanalysis.tawt.scheduler.adapters.TasksClient;
import ru.textanalysis.tawt.scheduler.processors.Processor;
import ru.textanalysis.tawt.scheduler.processors.ProcessorGama;
import ru.textanalysis.tawt.scheduler.processors.ProcessorGraphematical;

public class Builder {
    private final String schedulerHost;

    public Builder(String schedulerHost) {
        this.schedulerHost = schedulerHost;
    }

    public Processor buildProcessorGraphematical() {
        GraphematicParser parser = new GParserImpl();
        ObjectMapper mapper = new ObjectMapper();

        return new ProcessorGraphematical(parser, mapper);
    }

    public Processor buildProcessorGama() {
        Gama gama = new GamaImpl();
        ObjectMapper mapper = new ObjectMapper();

        return new ProcessorGama(gama, mapper);
    }

    public TasksClient buildTasksClient() {
        ManagedChannel channel = Grpc.newChannelBuilder(schedulerHost, InsecureChannelCredentials.create()).build();
        return new TasksClient(channel);
    }
}
