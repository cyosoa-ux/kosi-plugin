package com.yourname.myplugin;

import android.content.Context;
import com.aliucord.annotations.AliucordPlugin;
import com.aliucord.entities.Plugin;
import com.aliucord.Logger;

@AliucordPlugin
public class MyPlugin extends Plugin {
    public static final Logger logger = new Logger("MyPlugin");

    @Override
    public void start(Context context) {
        logger.info("Gumagana na plugin ko!");
    }

    @Override
    public void stop(Context context) {
        patcher.unpatchAll();
        logger.info("Stopped na plugin ko!");
    }
}
