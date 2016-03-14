package net.lagz0ne.xs.sample;

import net.lagz0ne.xs.ServiceDependencies;

import java.util.HashMap;
import java.util.Map;

public class Service1ImplDependency implements ServiceDependencies {
    @Override
    public Class getImplementationClass() {
        return Service1Impl.class;
    }

    @Override
    public Class getInterfaceClass() {
        return ServiceInterface1.class;
    }

    @Override
    public Map<String, Class<?>> getNamedDependencies() {
        HashMap<String, Class<?>> dependencies = new HashMap<>();
//        dependencies.put("service2", ServiceInterface2.class);
        return dependencies;
    }
}
