package com.ardas.test_task;

import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

/**
 * Class {@link com.ardas.test_task.Message}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 15.11.15
 */

public class Message {
    private static final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

    private Locale locale;

    public Message() {
        initMsgSource(Locale.getDefault().getLanguage());
    }

    public Message(String lang) {
        initMsgSource(lang);
    }
    /**
     * Gets the message by key and location
     * @param key
     */
    public String getMessage(String key){
        return messageSource.getMessage(key, null, locale);
    }

    private void initMsgSource(String lang) {
        locale = new Locale(lang);
        messageSource.setBasename("locale/messages");
    }
}
