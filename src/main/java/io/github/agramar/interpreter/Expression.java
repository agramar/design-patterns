package io.github.agramar.interpreter;

import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
