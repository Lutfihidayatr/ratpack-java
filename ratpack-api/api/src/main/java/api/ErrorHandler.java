package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.error.ServerErrorHandler;
import ratpack.handling.Context;
import ratpack.http.Response;
import ratpack.http.Status;

/**
 * Created by lutfihidayatr on 4/20/17.
 */
public class ErrorHandler implements ServerErrorHandler {
    private final Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    @Override
    public void error(Context context, Throwable throwable) throws Exception {
        context.byContent(content -> {
            content.json(() -> {
                final Response response = context.getResponse();
                response.status(Status.of(500)).send();
                return;
            });
        });
    }
}
