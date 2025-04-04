// This file is auto-generated, don't edit it. Thanks.
package com.alibaba.dashscope.bailian.models;

import darabonba.core.TeaModel;

/**
 * 
 * {@link DeletePromptTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePromptTemplateResponseBody</p>
 */
public class DeletePromptTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeletePromptTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePromptTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePromptTemplateResponseBody build() {
            return new DeletePromptTemplateResponseBody(this);
        } 

    } 

}
