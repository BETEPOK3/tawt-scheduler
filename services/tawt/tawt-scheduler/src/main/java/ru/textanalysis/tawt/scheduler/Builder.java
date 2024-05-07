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
import ru.textanalysis.tawt.scheduler.mappers.MapperTransportGama;
import ru.textanalysis.tawt.scheduler.mappers.MapperTransportSP;
import ru.textanalysis.tawt.scheduler.processors.*;
import ru.textanalysis.tawt.sp.api.SyntaxParser;

public class Builder {
    private final String schedulerHost;

    public Builder(String schedulerHost) {
        this.schedulerHost = schedulerHost;
    }

    public Processor buildProcessorGraphematical() {
        GParserImpl parser = new GParserImpl();
        ObjectMapper mapper = new ObjectMapper();

        return new ProcessorGraphematical(parser, mapper);
    }

    public Processor buildProcessorGama() {
        GamaImpl gama = new GamaImpl();
        gama.init();
        ObjectMapper mapper = new ObjectMapper();
        MapperTransportGama mapperTransportGama = new MapperTransportGama();

        return new ProcessorGama(gama, mapper, mapperTransportGama);
    }

    public Processor buildProcessorDisambiguationFalse() {
        GamaImpl gama = new GamaImpl();
        gama.init(false);
        ObjectMapper mapper = new ObjectMapper();
        MapperTransportGama mapperTransportGama = new MapperTransportGama();

        return new ProcessorDisambiguation(gama, mapper, mapperTransportGama);
    }

    public Processor buildProcessorDisambiguationTrue() {
        GamaImpl gama = new GamaImpl();
        gama.init(true);
        ObjectMapper mapper = new ObjectMapper();
        MapperTransportGama mapperTransportGama = new MapperTransportGama();

        return new ProcessorDisambiguation(gama, mapper, mapperTransportGama);
    }

    public Processor buildProcessorSyntax() {
        SyntaxParser syntaxParser = new SyntaxParser();
        syntaxParser.init();
        ObjectMapper mapper = new ObjectMapper();
        MapperTransportGama mapperTransportGama = new MapperTransportGama();
        MapperTransportSP mapperTransportSP = new MapperTransportSP(mapperTransportGama);

        return new ProcessorSyntax(syntaxParser, mapper, mapperTransportSP);
    }

    public TasksClient buildTasksClient() {
        ManagedChannel channel = Grpc.newChannelBuilder(schedulerHost, InsecureChannelCredentials.create()).build();
        return new TasksClient(channel);
    }
}
