package org.inthewaves.kotlinsignald.clientprotocol.v1.requests

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v1.structures.SendResponse

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * This class only represents the response from signald for the request. Make a request by creating
 * an instance of [org.inthewaves.kotlinsignald.clientprotocol.v1.structures.ResetSessionRequest] and
 * then calling its `submit` function.
 */
@Serializable
@SerialName("reset_session")
public data class ResetSession private constructor(
    public override val data: SendResponse? = null
) : JsonMessageWrapper<SendResponse>()
