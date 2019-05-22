package cput.Domain.Clients;

public class VIP {

    private String vipName;
    private String address;

    public VIP()
    {

    }
    public VIP(VIP.Builder build)
    {
        this.address=build.address;
        this.vipName=build.vipName;

    }

    public String getVIPName() {
        return vipName;
    }

    public String getAddress() {
        return address;
    }

    public void vipMessage(String soso, String capeTwon) {
    }

    public static class Builder{
        private String vipName;
        private String address;

        public VIP.Builder vipName(String phone){
            this.vipName=phone;
            return this;
        }
        public VIP.Builder address (String place){
            this.address=place;
            return this;
        }
        public VIP build()
        {
            return new VIP(this);
        }

    }
}

