package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class LinkingURI(
    public val uri: String? = null,
    @SerialName("session_id")
    public val sessionId: String? = null
) : SignaldResponseBodyV1()
