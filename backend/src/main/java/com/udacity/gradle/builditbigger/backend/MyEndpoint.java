package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;
import com.example.jokesjavalibrary.javaLibraryBundle;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    javaLibraryBundle javaLibraryBundle = new javaLibraryBundle();
    MyBean response = new MyBean();

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        response.setData("Hi, " + name);
        return response;
    }

    @ApiMethod(name = "funnyJokes")
    public MyBean jokeWizard() {
        response.setData(javaLibraryBundle.random());
        return response;
    }
}
