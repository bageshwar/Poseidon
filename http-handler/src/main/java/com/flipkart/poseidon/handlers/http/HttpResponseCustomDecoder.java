package com.flipkart.poseidon.handlers.http;

import com.fasterxml.jackson.databind.JavaType;
import org.apache.http.HttpResponse;

/**
 * This interface is designed for clients to supply a custom response decoder
 * Author bageshwar.pn
 * Date 03/01/25
 */
public interface HttpResponseCustomDecoder {

    /**
     *
     * @param httpResponse
     * @return true if the response should be decoded by this decoder
     */
    boolean shouldDecode(HttpResponse httpResponse);

    /**
     * Decode the response
     * @param httpResponse
     * @param javaType
     * @return The decoded POJO
     */
    Object decode(HttpResponse httpResponse, JavaType javaType);
}
