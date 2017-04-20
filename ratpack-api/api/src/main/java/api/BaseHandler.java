package api;

import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.http.Response;

/**
 * Created by lutfihidayatr on 4/20/17.
 */
public abstract class BaseHandler implements Handler {
    protected void renderJson(Context context, String json, int statusCode) throws Exception {
        final Response response = context.getResponse();
        context.byContent(content -> {
            content.json(() -> {
                response.status(statusCode).send(json);
            });
        });
    }
}
