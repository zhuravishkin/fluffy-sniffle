package com.zhuravishkin.stepik.java.basecourse.textanalyzer;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
