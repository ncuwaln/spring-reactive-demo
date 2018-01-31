package cn.edu.ncu.reactivedemo.handlers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class HelloWorldHandler {

    public Mono<ServerResponse> helloWorld(ServerRequest request){
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("hello world"));
    }
}
