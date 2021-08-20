package org.inthewaves.kotlinsignald.clientprotocol.v1.requests

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v1.structures.EmptyResponse

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * This class only represents the response from signald for the request. Make a request by creating
 * an instance of [org.inthewaves.kotlinsignald.clientprotocol.v1.structures.MarkReadRequest] and then
 * calling its `submit` function.
 */
@Serializable
@SerialName("mark_read")
public data class MarkRead private constructor(
    public override val `data`: EmptyResponse? = null
) : JsonMessageWrapper<EmptyResponse>()
