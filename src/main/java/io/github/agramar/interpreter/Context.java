package io.github.agramar.interpreter;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

    private static final Map<String, List<Row>> tables = new HashMap<>();

    static {
        List<Row> list = new ArrayList<>();
        list.add(new Row("John", "Doe"));
        list.add(new Row("Jan", "Kowalski"));
        list.add(new Row("Dominic", "Doom"));
        tables.put("people", list);
    }


    private static final Predicate<String> matchAnyString = s -> s.length() > 0;
    private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;

    private int colIndex = -1;
    private String table;
    private String column;
    private Predicate<String> whereFilter = matchAnyString;
    private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

    public void setColumn(String column) {
        this.column = column;
        setColumnMapper();
    }

    private void setColumnMapper() {
        switch (column) {
            case "*" -> colIndex = -1;
            case "name" -> colIndex = 0;
            case "surname" -> colIndex = 1;
        }
        if (colIndex != -1) {
            columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
        }
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setFilter(Predicate<String> filter) {
        this.whereFilter = filter;
    }

    public List<String> search() {
        List<String> result = tables.entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map((Row::toString))
                .flatMap(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());
        clear();
        return result;
    }

    private void clear() {
        table = null;
        column = null;
        whereFilter = matchAnyString;
        columnMapper = matchAllColumns;
    }
}
