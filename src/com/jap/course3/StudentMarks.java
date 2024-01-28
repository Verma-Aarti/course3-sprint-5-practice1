package com.jap.course3;

public class StudentMarks {

    public int calculateMarks(int maths,int physics,int chemistry,int biology) {
        return maths+physics+chemistry+biology;
    }

    public int calculateMarks(int maths,int physics,int chemistry) {
        return maths+physics+chemistry;
    }
    public int calculateMarks(long business_Studies,int finance,int accounting) {
        return (int)business_Studies+finance+accounting;
    }
}
