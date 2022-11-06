package me.imatveev.questionnaire.application.storage.utils;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.security.SecureRandom;

import static com.aventrix.jnanoid.jnanoid.NanoIdUtils.DEFAULT_ALPHABET;

public class IdUtils {
    private static final int DEFAULT_ID_LENGTH = 10;

    public static String randomiseId() {
        return NanoIdUtils.randomNanoId(new SecureRandom(), DEFAULT_ALPHABET, DEFAULT_ID_LENGTH);
    }
}
