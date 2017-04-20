package api;

import api.handler.Index;
import api.module.DefaultModule;
import ratpack.guice.Guice;
import ratpack.server.RatpackServer;

/**
 * Created by lutfihidayatr on 4/20/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        RatpackServer.of(spec -> {
            spec.registry(Guice.registry(b -> b.module(DefaultModule.class)));
            spec.serverConfig(serverConfigBuilder -> serverConfigBuilder.maxContentLength(10240000));
            spec.handlers(chain -> {
                chain.register(r -> r.add(new ErrorHandler()))
                        .get("api/index", Index.class);
            });
        }).start();
    }
}
