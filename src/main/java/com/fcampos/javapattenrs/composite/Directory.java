package com.fcampos.javapattenrs.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{

    private List<File> children = new ArrayList<>();

    public Directory(final String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(this.getName());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(final File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public boolean removeFile(final File file) {
        return children.remove(file);
    }
}
