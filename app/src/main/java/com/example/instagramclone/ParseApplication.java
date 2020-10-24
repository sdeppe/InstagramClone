package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vHV6q0bnGL4B6jfKaDEIFd4KxOivSN1BNgugTMce")
                .clientKey("beEqtcWrvNbyCqp9lXXnOlkJuCvXNlrWeg77mFzN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
