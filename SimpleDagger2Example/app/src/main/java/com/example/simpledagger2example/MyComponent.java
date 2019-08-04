
/*
 * @Chandra Dhakite
 * Dagger2 next concept is Component. which define the mapping between the one or more module and
 * one or more classes that will use them
 * In our case it has single module (MyModule) and single class (MainActivity)
 * Component must be flagged as @Singlton annotation as provide Modules are @Singlton
 * @Component (add all module class ) and define injects , where do you want to inject the dependancies  in our case MainActivity
 */


package com.example.simpledagger2example;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);

}
