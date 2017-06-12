package org.mfwbook.n;

public class NSearchFactory {
    public static NISearch create(String className) {
        if (className.equals("书号搜索")) {
            return new NSearchByBookId();
        } else if (className.equals("作者搜索")) {
            return new NSearchByAuthor();
        } else if (className.equals("书名搜索")) {
            return new NSearchByBookName();
        } else {
            return null;
        }
    }
}
