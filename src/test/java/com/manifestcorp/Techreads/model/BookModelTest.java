package com.manifestcorp.Techreads.model;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

import static org.junit.jupiter.api.Assertions.*;


class BookModelTest {

    @Test
    public void testBeanProperties() {
        BeanTester bean = new BeanTester();
        bean.testBean(Book.class);

    }
}


