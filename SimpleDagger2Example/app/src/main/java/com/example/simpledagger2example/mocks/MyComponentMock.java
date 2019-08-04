/*
 * @Chandra Dhakite
 */

/*
 * @Chandra Dhakite
 */

package com.example.simpledagger2example.mocks;



import com.example.simpledagger2example.MyComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = MyModuleMock.class)
public interface MyComponentMock extends MyComponent {

}


