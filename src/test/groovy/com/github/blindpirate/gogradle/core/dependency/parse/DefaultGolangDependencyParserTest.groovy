package com.github.blindpirate.gogradle.core.dependency.parse

import com.github.blindpirate.gogradle.core.exceptions.DependencyResolutionException
import org.junit.Test

class DefaultGolangDependencyParserTest {

    DefaultGolangDependencyParser parser = new DefaultGolangDependencyParser([]);

    @Test(expected = DependencyResolutionException)
    public void 'parsing unrecognized class should fail'() {
        parser.produce({})
    }
}
