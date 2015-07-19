package singleton;

import javax.inject.Singleton;

@Singleton
public class SingletonBean {

    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String sayHello () {
        return "Hello!! " + this.name;
    }

}
