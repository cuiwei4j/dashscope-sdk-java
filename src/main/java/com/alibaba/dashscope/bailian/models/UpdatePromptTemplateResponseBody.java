// This file is auto-generated, don't edit it. Thanks.
package com.alibaba.dashscope.bailian.models;

import darabonba.core.TeaModel;

/**
 * 
 * {@link UpdatePromptTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePromptTemplateResponseBody</p>
 */
public class UpdatePromptTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdatePromptTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePromptTemplateResponseBody create() {
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

        public UpdatePromptTemplateResponseBody build() {
            return new UpdatePromptTemplateResponseBody(this);
        } 

    } 

}
