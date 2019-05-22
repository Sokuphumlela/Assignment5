package cput.Factory;

import cput.Domain.Setting.Edit;
import cput.Factory.Setting.EditFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EditFactoryTest {

    public Edit edit;
    @Before
    public void setUp() throws Exception {
        edit = EditFactory.CreateEdit("Dfd","Dws");
    }

    @Test
    public void createEdit() {
        Assert.assertEquals(edit.getPost(),edit.getPost());
    }
}