package api.module;

import com.google.inject.AbstractModule;

/**
 * Created by lutfihidayatr on 4/20/17.
 */
public class DefaultModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new HandlerModule());
    }
}
