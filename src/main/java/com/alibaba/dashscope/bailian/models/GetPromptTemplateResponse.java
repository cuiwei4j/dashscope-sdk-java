// This file is auto-generated, don't edit it. Thanks.
package com.alibaba.dashscope.bailian.models;

import com.aliyun.sdk.gateway.pop.models.Response;
import darabonba.core.TeaModel;

/**
 * 
 * {@link GetPromptTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetPromptTemplateResponse</p>
 */
public class GetPromptTemplateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetPromptTemplateResponseBody body;

    private GetPromptTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetPromptTemplateResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetPromptTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPromptTemplateResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetPromptTemplateResponseBody body);

        @Override
        GetPromptTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPromptTemplateResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetPromptTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPromptTemplateResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetPromptTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPromptTemplateResponse build() {
            return new GetPromptTemplateResponse(this);
        } 

    } 

}
