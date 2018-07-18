/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.kakeibochan.mylasta.action;

import com.kakeibochan.mylasta.action.FrontLabels;
import org.lastaflute.core.message.UserMessage;

/**
 * The keys for message.
 * @author FreeGen
 */
public class FrontMessages extends FrontLabels {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    /** The key of the message: すでにこのメールアドレスは登録されています。 */
    public static final String ERRORS_SIGNUP_ACCOUNT_ALREADY_EXISTS = "{errors.signup.account.already.exists}";

    /**
     * Add the created action message for the key 'errors.signup.account.already.exists' with parameters.
     * <pre>
     * message: すでにこのメールアドレスは登録されています。
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public FrontMessages addErrorsSignupAccountAlreadyExists(String property) {
        assertPropertyNotNull(property);
        add(property, new UserMessage(ERRORS_SIGNUP_ACCOUNT_ALREADY_EXISTS));
        return this;
    }
}
