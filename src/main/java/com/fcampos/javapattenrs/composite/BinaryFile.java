package com.fcampos.javapattenrs.composite;

public class BinaryFile extends File {

    private long size;

    public BinaryFile(final String name, final long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(final File file) {
        throw new UnsupportedOperationException("The leaf node doesn't support add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("The leaf node doesn't support get files operation");
    }

    @Override
    public boolean removeFile(final File file) {
        throw new UnsupportedOperationException("The leaf node doesn't support remove file operation");
    }
}
