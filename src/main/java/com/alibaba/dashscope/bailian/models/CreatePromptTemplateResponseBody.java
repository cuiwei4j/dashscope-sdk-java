// This file is auto-generated, don't edit it. Thanks.
package com.alibaba.dashscope.bailian.models;

import darabonba.core.TeaModel;

/**
 * 
 * {@link CreatePromptTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePromptTemplateResponseBody</p>
 */
public class CreatePromptTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("promptTemplateId")
    private String promptTemplateId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePromptTemplateResponseBody(Builder builder) {
        this.promptTemplateId = builder.promptTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePromptTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return promptTemplateId
     */
    public String getPromptTemplateId() {
        return this.promptTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String promptTemplateId; 
        private String requestId; 

        /**
         * promptTemplateId.
         */
        public Builder promptTemplateId(String promptTemplateId) {
            this.promptTemplateId = promptTemplateId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePromptTemplateResponseBody build() {
            return new CreatePromptTemplateResponseBody(this);
        } 

    } 

}
