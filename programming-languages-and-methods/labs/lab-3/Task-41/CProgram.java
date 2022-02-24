public class CProgram implements Comparable<CProgram> {
    private String sourceCode;

    public CProgram(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public int compareTo(CProgram o) {
        return Integer.compare(getCommentLength(), o.getCommentLength());
    }

    public int getCommentLength() {
        int count = 0;
        boolean isComment = false;
        int commentType = 0;
        for (int i = 1; i < sourceCode.length(); i++) {
            if (!isComment) {
                if (sourceCode.charAt(i - 1) == '/' && sourceCode.charAt(i) == '/') {
                    isComment = true;
                    commentType = 0;
                } else if (sourceCode.charAt(i - 1) == '/' && sourceCode.charAt(i) == '*') {
                    isComment = true;
                    commentType = 1;
                }
            } else {
                if (commentType == 0) {
                    if (sourceCode.charAt(i) == '\n') {
                        isComment = false;
                    } else {
                        count++;
                    }
                } else {
                    if (sourceCode.charAt(i - 1) == '*' && sourceCode.charAt(i) == '/') {
                        isComment = false;
                        count--;
                    } else {
                        if (sourceCode.charAt(i) != '\n') {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return sourceCode;
    }
}
