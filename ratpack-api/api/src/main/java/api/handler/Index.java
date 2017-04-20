package api.handler;

import api.BaseHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import ratpack.handling.Context;

/**
 * Created by lutfihidayatr on 4/20/17.
 */
public class Index extends BaseHandler {

    @Override
    public void handle(Context context) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        renderJson(context, mapper.writeValueAsString("Ratpack-api"), 200);
    }
}
