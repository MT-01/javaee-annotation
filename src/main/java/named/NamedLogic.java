package named;


import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@Dependent
public class NamedLogic {
    
    @Inject
    NamedBean namedBean;
    
    public void changeName (String name) {
        namedBean.setName(name);
    }
}
