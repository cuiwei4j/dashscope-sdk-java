// This file is auto-generated, don't edit it. Thanks.
package com.alibaba.dashscope.bailian.models;

import com.aliyun.sdk.gateway.pop.models.Response;
import darabonba.core.TeaModel;

/**
 * 
 * {@link AddCategoryResponse} extends {@link TeaModel}
 *
 * <p>AddCategoryResponse</p>
 */
public class AddCategoryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddCategoryResponseBody body;

    private AddCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddCategoryResponse create() {
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
    public AddCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCategoryResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddCategoryResponseBody body);

        @Override
        AddCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCategoryResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AddCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCategoryResponse response) {
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
        public Builder body(AddCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCategoryResponse build() {
            return new AddCategoryResponse(this);
        } 

    } 

}
