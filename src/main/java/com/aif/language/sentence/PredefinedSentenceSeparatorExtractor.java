package com.aif.language.sentence;

import com.aif.language.token.ITokenSeparatorExtractor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class PredefinedSentenceSeparatorExtractor implements ISentenceSeparatorExtractor {

    private static final List<Character> SEPARATORS = Arrays.asList(new Character[]{'.', '!', '?',
                                                                                    '(', ')', '[',
                                                                                    ']', '{', '}',
                                                                                    ';', '\'', '\"'});

    @Override
    public Optional<List<Character>> extract(List<String> tokens) {
        return Optional.of(SEPARATORS);
    }
}
