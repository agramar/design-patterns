package io.github.agramar.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
