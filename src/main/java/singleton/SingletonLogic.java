package singleton;


import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@Dependent
public class SingletonLogic {
    
    @Inject
    SingletonBean singletonBean;
    
    public void changeName (String name) {
        singletonBean.setName(name);
    }
    
}
