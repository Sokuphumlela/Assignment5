package cput.Domain.Setting;

public class Edit {
    private String pics;
    private String post;

    //Default constructor
    public Edit(){

    }
    public Edit(Builder build){

        this.pics=build.pics;
        this.post=build.post;
    }

    public String getPics() {
        return pics;
    }

    public String getPost() {
        return post;
    }

    public void editMessage(String picture, String picss ){    }

    public static class Builder{
        private String pics;
        private String post;

        public Builder pics (String photo){
            this.pics=photo;
            return this;
        }
        public Builder post (String write){
            this.post=write;
            return this;
        }

        public Edit build() {
            return new Edit(this);
        }
    }
}
