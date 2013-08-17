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

/**
 * Thrown by providers in case of any problem with instantiation of provided
 * object.
 * 
 * @author maciej@chalapuk.pl (Maciej Chałapuk)
 */
@SuppressWarnings("serial")
public class InjectionError extends RuntimeException {

    public InjectionError(String message) {
        super(message);
    }

    public InjectionError(String message, Throwable cause) {
        super(message, cause);
    }
}
