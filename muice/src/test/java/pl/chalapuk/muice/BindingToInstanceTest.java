/*
 * Copyright (C) 2013 Maciej Chałapuk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.chalapuk.muice;

import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * @author maciej@chalapuk.pl (Maciej Chałapuk)
 */
public class BindingToInstanceTest {

    @Test
    public void testBindingObjectClassToInstance() {
        final Object instance = new Object();

        Injector injector = Muice.createInjector(new BindingModule() {

            @Override
            public void configure(Binder binder) {
                binder.bind(Object.class)
                        .toInstance(instance);
            }
        });

        assertSame(instance, injector.getInstance(Object.class));
        assertSame(instance, injector.getInstance(Object.class));
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerWhenBindingToNullInstance() {
        Muice.createInjector(new BindingModule() {

            @Override
            public void configure(Binder binder) {
                binder.bind(Object.class)
                        .toInstance(null);
            }
        });
    }
}
