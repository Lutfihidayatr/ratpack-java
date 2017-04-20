package api.module;

import api.handler.Index;
import com.google.inject.AbstractModule;

/**
 * Created by lutfihidayatr on 4/20/17.
 */
public class HandlerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Index.class);
    }
}
