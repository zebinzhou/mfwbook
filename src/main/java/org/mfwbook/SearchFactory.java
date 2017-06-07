package org.mfwbook;

public class SearchFactory {
    public static ISearch create(String className) {
        if (className.equals("书号搜索")) {
            return new SearchByBookId();
        } else if (className.equals("作者搜索")) {
            return new SearchByAuthor();
        } else if (className.equals("书名搜索")) {
            return new SearchByBookName();
        } else {
            return null;
        }
    }
}
