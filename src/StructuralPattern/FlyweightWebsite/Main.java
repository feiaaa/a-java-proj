package StructuralPattern.FlyweightWebsite;

public class Main {
    public static void main(String[] args){
        FlyWebsiteFactory ff=new FlyWebsiteFactory();
        Website fx= ff.GetWebsiteCategory("product show");
        fx.Use(new User("user1"));
        Website fy= ff.GetWebsiteCategory("product show");
        fy.Use(new User("user2"));
        Website fz= ff.GetWebsiteCategory("product show");
        fz.Use(new User("user3"));
        Website fa= ff.GetWebsiteCategory("blog");
        fa.Use(new User("user4"));
        Website fb= ff.GetWebsiteCategory("blog");
        fb.Use(new User("user5"));
        Website fc= ff.GetWebsiteCategory("blog");
        fc.Use(new User("user6"));
        System.out.println("catalog number:"+ff.GetWebsiteCount());
    }
}
