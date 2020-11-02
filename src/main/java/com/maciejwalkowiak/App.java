package com.maciejwalkowiak;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.sentry.Sentry;

/**
 * Lambda function entry point. You can change to use other pojo type or implement
 * a different RequestHandler.
 *
 * @see <a href=https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html>Lambda Java Handler</a> for more information
 */
public class App implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(final Object input, final Context context) {
        Sentry.init(options -> {
            options.setDsn("PUT YOUR DSN HERE");
            options.setDebug(true);
        });
        Sentry.captureMessage("hello from AWS Lambda");
        return input;
    }
}
