package cput.Factory.Setting;

import cput.Domain.Setting.Edit;

public class EditFactory {
    public static Edit CreateEdit(String pics, String post){
        return new Edit.Builder()
                .pics(pics)
                .post(post)
                .build();
    }
}
