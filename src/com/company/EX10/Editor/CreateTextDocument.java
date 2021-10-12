package com.company.EX10.Editor;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
