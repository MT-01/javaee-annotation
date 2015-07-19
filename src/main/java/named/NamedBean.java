package named;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class NamedBean {

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
