package io.research.dagger.atm;

import dagger.Component;

@Component
public interface CommandRouterFactory {
    CommandRouter router();
}
