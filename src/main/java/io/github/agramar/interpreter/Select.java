package io.github.agramar.interpreter;

import java.util.List;

public class Select implements Expression {

    private final String column;
    private final From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setColumn(column);
        return from.interpret(context);
    }
}
