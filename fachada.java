import com.google.gson.Gson;

public class GsonFacade {
    private Gson gson;

    public GsonFacade(){
        this.gson = new Gson();
    }

    public String toJson(Objaect object) {
        return gson.toJson(object);
    }
}